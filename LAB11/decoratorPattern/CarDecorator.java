package decoratorPattern;
/**
 * 
 * @author 2016112105 박선희
 * @purpose 데코레이터 객체 
 * @usage 클라이언트에게 요구된 기능에 알맞은 서브클래스를 선택
 *
 */
public class CarDecorator implements Car{
	private Car car;
	public CarDecorator(Car car) {
		this.car=car;
	}
	@Override
	public void assemble() {
		car.assemble();
	}
}
