package statePattern;

public class Door{
	private DoorState state = new Closed();

	public void click() {
		System.out.println("click .....");
		state.click(this);
		printStatus();
	}
	public void complete() {
		System.out.println("complete .....");
		state.complete(this);
		printStatus();
	}
	public void timeout() {
		System.out.println("timeout .....");
		state.timeout(this);
		printStatus();
	}
	public void changeState(DoorState s) {
		this.state = s;
	}
	public void printStatus() {
		System.out.println(state+"\n");
	}
}
