package templatePattern;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start making coffee : ");
        CaffeineBeberage coffee = new Coffee();
        coffee.prepareRecipe();
        
        System.out.println("\nStart making tea : ");
        CaffeineBeberage tea = new Tea();
        tea.prepareRecipe();
	}

}
