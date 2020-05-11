package ex03;
/**
 * 
 * @author 2016112105 박선희
 *
 */
import java.util.Observable;
import java.util.Observer;

public class ObservableDogBot extends Observable implements DogBot {
	private DogBot dogbot;
	/**
	 * @role observe 대상 dogbot 설정
	 * @param dogbot
	 */
	public ObservableDogBot(DogBot dogbot) {
		this.dogbot = dogbot;
	}
	/**
	 * @role dogbot 이 음식을 먹었을 때
	 */
	@Override
	public boolean eat() {
		// TODO Auto-generated method stub
		if (dogbot.eat()){
			setChanged(); //observer update 알림 
			notifyObservers("eats");
			return true;
		}
		else
			return false;
	}
	/**
	 * @role dogbot 의 휴식을 취할 때
	 */
	@Override
	public void rest() {
		// TODO Auto-generated method stub
		dogbot.rest();
		setChanged(); //observer update 알림 
		notifyObservers("rests");
	}
	/**
	 * @role dogbot 의 놀 때
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		dogbot.play();
		setChanged(); //observer update 알림 
		notifyObservers("plays");
	}
	@Override
	public String noise() {
		// TODO Auto-generated method stub
		return dogbot.noise();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return dogbot.getName();
	}
	@Override
	public String toString() {
		return dogbot.toString();
	}
}
