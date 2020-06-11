package bets;

import roulette.Bet;
import roulette.ConsoleReader;
import roulette.Wheel;
/**
 * Managing result of Three In Row Betting
 * @author 2016112105 박선희
 *
 */
public class ThreeInRow extends Bet {
	private int start=0;
	public ThreeInRow(String description, int payout) {
		super(description, payout);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		start = Integer.parseInt( ""
				+ ConsoleReader.promptRange(
						"Enter first of three consecutive numbers", 1, 34));
	}

	@Override
	public boolean isSuccess(Wheel wheel) {
		// TODO Auto-generated method stub
		return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}

}
