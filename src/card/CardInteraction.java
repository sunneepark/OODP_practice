package card;

/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
/**
 * 
 * @author 2016112015 박선희
 * @date 20/03/17
 *
 */
import java.util.Scanner;
public class CardInteraction {
	private Scanner scanner;
	private CardOrder card;
	
	public CardInteraction() {
		scanner = new Scanner(System.in);
	}
	
	//runs the program as follows:
	//Gets details of card name from user
	//Displays card
	//Repeatedly, until user responds ok
	//	Asks the user if they would like to change the border
	//	If so, change the border and print the new card
	//Print the price of the order
	//print whether a discount is applicable or not
	public void run() {

		//Gets details of card name from user
		String nameFromUser = "";
		while((nameFromUser=getNameFromUser()).length() <= 0);
		
		//Displays card
		CardOrder order = new CardOrder(nameFromUser);
		System.out.print("Here is a sample card:\n"+order.getSampleCard());

		//Repeatedly, until user responds ok
		//	Asks the user if they would like to change the border
		//	If so, change the border and print the new card
		String border;
		
		while(true) {
			System.out.println("Enter “OK” if this card is ok, otherwise enter an alternative border character:");
			border=scanner.nextLine();
			if(border.equals("OK"))
				break;
			order.setBorder(border.charAt(0));
			System.out.print("Here is a sample card:\n"+order.getSampleCard());
		}
		
		//Print the price of the order
		int numFromUser=getNumberFromUser();
		order.setNumCards(numFromUser);
		System.out.println("The price of "+numFromUser+" cards is "+order.getFinalCost()+ " won.");
		
		//print whether a discount is applicable or not
		if(order.hasDiscount())
			System.out.println("10% discount applied");
		else
			System.out.println("No discoint given");
	}

	//repeatedly requests and reads name from user
	//until valid (i.e. <=28 chars and contains at least one space
	//finally returns the valid text
	private String getNameFromUser() {
		String nameFromUser = "";
		
		boolean finish = false;
		while(!finish) {
			System.out.print("Enter name: ");
			nameFromUser= scanner.nextLine();
			if(nameFromUser.indexOf(" ") == -1)
				System.out.println("성과 이름을 스페이스바로 분리하여 주시길 바랍니다.");
			else if(nameFromUser.trim().length()>28)
				System.out.println("28자 이상인 이름은 입력하실 수 없습니다.");
			else
				finish = true;
		}
		return nameFromUser;
	}
	
	//repeatedly requests and reads number from user
	//until valid number entered i.e. between 1 and 1000
	//finally returns the valid number	
	private int getNumberFromUser() {
		
		int numFromUser=0;
		boolean finish=false;
		while(!finish) {
			System.out.print("How many cards would you like? ");
			
			numFromUser=scanner.nextInt();
			if(numFromUser < 1 || numFromUser > 1000)
				System.out.println("수량은 1에서 1000사이의 정수를 입력해주세요.");
			else
				finish=true;
		}
		
		return numFromUser;
	}
	

}


