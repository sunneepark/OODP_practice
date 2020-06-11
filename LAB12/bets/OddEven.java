package bets;

import java.util.Set;
import java.util.TreeSet;

import roulette.Bet;
import roulette.ConsoleReader;
import roulette.Wheel;
/**
 * Managing result of Odd and Even Betting
 * @author 2016112105 박선희
 *
 */
public class OddEven extends Bet {
	private String result="odd";
	public OddEven(String description, int payout) {
		super(description, payout);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		Set<String> choices = new TreeSet<String>();
		choices.add("even");
		choices.add("odd");
		result = ConsoleReader.promptOneOf("Please bet", choices);
	}

	@Override
	public boolean isSuccess(Wheel wheel) {
		// TODO Auto-generated method stub
		return (wheel.getNumber() % 2 == 0 && result.equals("even"))
				|| (wheel.getNumber() % 2 == 1 && result.equals("odd"));
	}

}
