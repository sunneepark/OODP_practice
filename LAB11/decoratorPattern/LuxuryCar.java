package decoratorPattern;
/**
 * 
 * @author 2016112105 박선희
 * @usage concrete Decorator
 *
 */
public class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car car) {
		super(car);
	}
	@Override
	public void assemble() {
		super.assemble();//상위 클래스 operation(주된 기능)
		System.out.print("Adding features of Luxury Car. "); //부수적인 기능
	}
}
