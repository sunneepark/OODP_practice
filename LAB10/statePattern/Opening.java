package statePattern;

public class Opening extends DoorState{

	@Override
	public void click(Door d) {
		// TODO Auto-generated method stub
		d.changeState(new Closing());
	}

	@Override
	public void complete(Door d) {
		// TODO Auto-generated method stub
		d.changeState(new Open());
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
	}

}
