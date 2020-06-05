package decoratorPattern;
/**
 * 
 * @author 2016112105 박선희
 *
 */
public class BasicCar implements Car{
	public BasicCar() {
		
	}
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.print("Basic Car. ");
	}

}
