package bets;

import java.util.Set;
import java.util.TreeSet;

import roulette.Bet;
import roulette.ConsoleReader;
import roulette.Wheel;
/**
 * Managing result of Red and Black Betting
 * @author 2016112105 박선희
 *
 */
public class RedBlack extends Bet {
	private String result="black";
	public RedBlack(String description, int payout) {
		super(description, payout);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		Set<String> choices = new TreeSet<String>();
		choices.add(Wheel.BLACK);
		choices.add(Wheel.RED);
		result = ConsoleReader.promptOneOf("Please bet", choices);
	}

	@Override
	public boolean isSuccess(Wheel wheel) {
		// TODO Auto-generated method stub
		return wheel.getColor().equals(result);
	}

}
