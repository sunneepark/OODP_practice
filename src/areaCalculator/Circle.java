package areaCalculator;

/*Circle 클래스*/
public class Circle implements AreaCalculator {
	public double radius;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (22/7)*this.radius*this.radius;
	}

}
