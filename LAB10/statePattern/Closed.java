package statePattern;

public class Closed extends DoorState{
	@Override
	public void click(Door d) {
		// TODO Auto-generated method stub
		d.changeState(new Opening());
	}

	@Override
	public void complete(Door d) {
		// TODO Auto-generated method stub
	}

	@Override
	public void timeout(Door d) {
		// TODO Auto-generated method stub
		
	}
}
