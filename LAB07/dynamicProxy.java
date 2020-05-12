import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @author 2016112105 박선희
 * @purpose dynamic proxy 구현
 *
 */
class TransactionalServiceProxy implements InvocationHandler {
    private Object subject;
 
    public TransactionalServiceProxy(Object subject) {
        this.subject = subject;
    }
    @Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		 String methodName = method.getName();
		  
	        //메소드명이 Trx로 끝나면 트랜잭션 처리를 수행한다.
	        if (methodName.endsWith("Trx")) {
	            return executeTransactionalProcess(proxy, method, args);
	        }
	  
	        return executeNormalProcess(proxy, method, args);
	}
    private Object executeTransactionalProcess(Object proxy, Method method, Object[] args) throws Throwable{
    	try {
            Object result = method.invoke(subject, args);
            System.out.println(" do special something");
            return result;
        } catch (Exception e) {
            throw e;
        }
	}
	private Object executeNormalProcess(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return method.invoke(subject, args);
        } catch (Exception e) {
            throw e;
        }
    }
	
}

interface dynamicService {
	public void action(String name);
	public void actionTrx(String name);
}

class dynamicServiceImpl implements dynamicService {
	@Override
	public void actionTrx(String name) {
		String upperName = name.toUpperCase();
		System.out.print(upperName);
	}

	@Override
	public void action(String name) {
		System.out.print(name);
	}
}

public class dynamicProxy {
	public static void main(String[] args) {
		dynamicService subject = new dynamicServiceImpl();
		/**
		 * ClassLoader loader: Proxy 클래스를 정의한 클래스로더
			Class<?>[] interfaces: Proxy 객체가 구현할 인터페이스의 목록
			InvocationHandler h: InvocationHandler 인터페이스를 구현한 Proxy 객체 구현체 
		 */
		dynamicService memberService = (dynamicService)java.lang.reflect.Proxy.newProxyInstance(subject.getClass().getClassLoader()
				,new Class[]{dynamicService.class}, new TransactionalServiceProxy(subject));
		memberService.actionTrx("sunny park");
		memberService.action("sunny park");
	}
}
