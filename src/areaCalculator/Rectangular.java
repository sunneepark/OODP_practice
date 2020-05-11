package areaCalculator;

/*Rectangular 클래스*/
public class Rectangular implements AreaCalculator {
	public double length;
	public double width;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length *this.width;
	}

}
