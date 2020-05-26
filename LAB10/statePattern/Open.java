package statePattern;

public class Open extends DoorState{

	@Override
	public void click(Door d) {
		// TODO Auto-generated method stub
		d.changeState(new StayOpen());
	}

	@Override
	public void complete(Door d) {
		// TODO Auto-generated method stub
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
		d.changeState(new Closing());
	}

}
