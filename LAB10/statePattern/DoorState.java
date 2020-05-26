package statePattern;
/**
 * 
 * @author 2016112105 박선희
 * @usage state class
 *
 */
public abstract class DoorState {
	abstract public void click(Door d);
	abstract public void complete(Door d);
	abstract public void timeout(Door d);
	void changeState(Door d, DoorState s) {
		d.changeState(s);
	}
	
}
