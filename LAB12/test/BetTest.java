package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bets.OddEven;
import bets.RedBlack;
import bets.ThreeInRow;
import roulette.Bet;
import roulette.Wheel;

/**
 * Test the Bet class.
 * 
 * @author Robert C. Duvall
 */
public class BetTest {
	private Bet[] myPossibleBets = {
			new RedBlack("test", 1),
			new OddEven("test", 1),
			new ThreeInRow("test", 1)
	};
	@Test
	public void testCreation() {
		for(Bet temp : myPossibleBets) {
			assertEquals(temp.getDescription(), "test");
			assertEquals(temp.getPayout(), 1);
		}
	}
	@Test
	public void testRedBlack() {
		Wheel myWheel=new Wheel();
		Bet temp = myPossibleBets[0];
		assertEquals(temp.isSuccess(myWheel), myWheel.getColor()=="black");	
	}
	@Test
	public void testOddEven() {
		Wheel myWheel=new Wheel();
		Bet temp = myPossibleBets[1];
		assertEquals(temp.isSuccess(myWheel), myWheel.getNumber()%2 == 1);	
	}
	@Test
	public void testThreeInRow() {
		Wheel myWheel=new Wheel();
		Bet temp = myPossibleBets[2];
		myWheel.setNumber(4);
		assertTrue(!temp.isSuccess(myWheel));	
	}
}
