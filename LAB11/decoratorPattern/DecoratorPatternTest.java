package decoratorPattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sportsCar = new SportsCar(new BasicCar());

		sportsCar.assemble();

		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar())); 
		sportsLuxuryCar.assemble();

	}

}
