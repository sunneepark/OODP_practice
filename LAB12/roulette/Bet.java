package roulette;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
	
	private String myDescription;
	private int myPayout;
	/**
	 * Constructs a bet with the given name and odds.
	 * 
	 * @param description
	 *            name of this kind of bet
	 * @param payout
	 *            payout given by the house for this kind of bet
	 */
	public Bet(String description, int payout) {
		myDescription = description;
		myPayout = payout;
	}

	/**
	 * @return odds given by the house for this kind of bet
	 */
	public int getPayout() {
		return myPayout;
	}

	/**
	 * @return name of this kind of bet
	 */
	public String getDescription() {
		return myDescription;
	}
	
	/**
	 * Place the given bet by prompting the user for the specific information
	 * need to complete the given bet.
	 */
	public abstract void place();
	/**
	 * Checks if the given bet is won or lost given the user's choice and the
	 * result of spinning the wheel.
	 * 
	 * @param wheel
	 *            result of spinning the wheel
	 */
	public abstract boolean isSuccess(Wheel wheel);
}
