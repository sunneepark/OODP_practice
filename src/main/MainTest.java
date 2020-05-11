package main;

import card.CardOrder;
import name.Name;

/**
 * 
 * @author 2016112015 박선희
 * @date 20/03/17
 *
 */
//Basics 5
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Name n1 = new Name("Jane", "", "Black");
		System.out.println(n1.getInits() + " " + n1.getFirstAndLastName());
		System.out.println(n1.getLastCommaFirst());
		System.out.println(n1);
		
		Name n2 = new Name("Mary", "Ann", "Smith");
		System.out.println(n2.getInits() + " " + n2.getFirstAndLastName());
		System.out.println(n2.getLastCommaFirst());
		System.out.println(n2);
		
		//cardorder 클래스 예시
		CardOrder order = new CardOrder("Jane Black");
		System.out.print(order.getSampleCard());
	}

}
