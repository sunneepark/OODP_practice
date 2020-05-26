package statePattern;

public class StayOpen extends DoorState{

	@Override
	public void click(Door d) {
		d.changeState(new Closing());
	}

	@Override
	public void complete(Door d) {
	}

	@Override
	public void timeout(Door d) {
	}
}
