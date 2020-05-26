package templatePattern;
/**
 * 
 * @author 2016112105 박선희
 * @purpose template method
 *
 */
public abstract class CaffeineBeberage {
	void prepareRecipe() { 
		boilWater();
		DoOperaion1();
		pourInCup();
		DoOperation2();
	}
	void boilWater() {
		 System.out.println("Boiling water");
	}
	void pourInCup() {
        System.out.println("Pouring into cup");
	}
	abstract protected void DoOperaion1();
	abstract protected void DoOperation2();
}
