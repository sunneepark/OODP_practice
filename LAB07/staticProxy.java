/**
 * 
 * @author 2016112105 박선희
 * @purpose static proxy 구현
 *
 */
interface Service {
	public void action(String name);
}

class RealServiceImpl implements Service { //실제 로직 처리
	@Override
	public void action(String name) {
		String upperName = name.toUpperCase();
		System.out.println(upperName);
	}
}

class TransactionalServiceImpl implements Service {
	private Service subject;

	public TransactionalServiceImpl() {
		this.subject = new RealServiceImpl();
	}

	@Override
	public void action(String name) {
		// 실제 처리는 실제 MemberServiceImpl 객체에 위임
		subject.action(name);
	}
}

public class staticProxy {
	public static void main(String[] args) {
		// MemberServiceImpl 대신 Service 인스턴스 사용 -> 프록시
		Service memberService = new TransactionalServiceImpl();
		memberService.action("sunny park");
	}
}
