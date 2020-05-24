package prototypeBasic;

import java.util.Scanner;

public class BasicTest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//create prototype
    	String input = sc.next();
   
    	Product star = new MessageBox(input,'*');
    	Product underBar = new MessageBox(input,'_');
    	
    	// register prototype to name in product Factory
        PrototypeService service = new PrototypeService();
        service.register("star",star);
        service.register("underBar",underBar);
        
        //test code
        Product testStar = service.create("star");
        Product testUnderBar = service.create("underBar");
        
        System.out.println(testStar.use());
        System.out.println(testUnderBar.use());
        
    }
}
