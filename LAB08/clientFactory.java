/**
 * 
 * @author 2016112105 박선희
 * @using 추상 팩토리 패턴
 *
 */
enum VendorID {LG, HYUNDAI}
enum Direction {UP, DOWN}
enum MotorStatus {MOVING, STOPPED}

abstract class Motor {
	private MotorStatus motorStatus;
	public Motor() {
		motorStatus = MotorStatus.STOPPED;
	}
	
	protected abstract void moveMotor(Direction direction);
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	public void stop() {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.STOPPED)
			return;
		
		setMotorStatus(MotorStatus.STOPPED);
	}
}

class MotorFactory {
	// vendorID에 따라 LGMotor 또는 HyundaiMotor 객체를 생성함
	public static Motor createMotor(VendorID vendorID) {
		Motor motor = null;

		switch (vendorID) {
		case LG:
			motor = new LGMotor();
			break;
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}
class LGMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move LG Motor " + direction);
	}
}

class HyundaiMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor " + direction);
	}
}

class ElevatorController {
	private int id;
	private int curFloor = 1;
	private Motor motor;

	public ElevatorController(int id, Motor motor) {
		this.id = id;
		this.motor = motor;
	}

	public void gotoFloor(int destination) {
	
		if (destination == curFloor)
			return;
		
		Direction direction;
		if (destination > curFloor)
			direction = Direction.UP;
		else
			direction = Direction.DOWN;
		
		motor.move(direction);
	
		System.out.print("Elevator [" + id + "] floor:" + curFloor);
		curFloor = destination;
		System.out.println(" ==> " + curFloor + " with " + motor.getClass().getName());
		
		motor.stop();
	}
}

public class clientFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*추상 팩토리 미적용*/
//		Motor lgMotor = new LGMotor();
//		ElevatorController controller1 = new ElevatorController(1, lgMotor);
//		controller1.gotoFloor(5);
//		controller1.gotoFloor(3);
//
//		Motor hyundaiMotor = new HyundaiMotor();
//		ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
//		controller2.gotoFloor(4);
//		controller2.gotoFloor(6);
		
		/*추상 팩토리 적용*/
		MotorFactory factory = new MotorFactory(); //모터 팩토리 생성
		//각각 제조사에 따른 모터 객체 생성
		Motor lgMotor = factory.createMotor(VendorID.LG);
		ElevatorController controller1 = new ElevatorController(1, lgMotor);
		controller1.gotoFloor(5);
		controller1.gotoFloor(3);
		
		Motor hyundaiMotor = factory.createMotor(VendorID.HYUNDAI);
		ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
		controller2.gotoFloor(4);
		controller2.gotoFloor(6);
	}

}
