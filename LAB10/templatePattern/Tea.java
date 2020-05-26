package templatePattern;
/**
 * 
 * @author 2016112105 박선희
 * @purpose concrete class for primitive method
 *
 */
public class Tea extends CaffeineBeberage{

	@Override
	protected void DoOperaion1() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	} 

	@Override
	protected void DoOperation2() {
		// TODO Auto-generated method stub
		System.out.println("Adding Lemon");
	}

}
