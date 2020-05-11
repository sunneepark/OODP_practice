package ex03;
/**
 * 
 * @author 2016112105 박선희
 *
 */
import java.util.Observable;
import java.util.Observer;

//dogbot의 변화가 생길 때 이름과 액션을 인쇄
public class DogWatcher implements Observer{ 
	private String watcherName;
	public DogWatcher(String name) {
		this.watcherName=name;
	}
	/**
	 * @role observer(dogwatcher)의 갯수 반환
	 */
	public int countObservers() {
		// TODO Auto-generated method stub
		return this.countObservers();
	}
	/**
	 * @role observer 추가
	 * @param observer 인 dogwatcher
	 */
	public void addObserver(DogWatcher obs) {
		// TODO Auto-generated method stub
		obs.addObserver(this);
	}
	/**
	 * @role observer 삭제
	 * @param 삭제 대상인 observer인 dogwatcher
	 */
	public void deleteObserver(DogWatcher obs) {
		// TODO Auto-generated method stub
		obs.deleteObserver(this);
	}
	/**
	 * @role update 되었을 때 observer 이름과 update된 dogbot 이름과 액션 출력
	 */
	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		DogBot temp = (DogBot)obs;
		System.out.println("observer "+watcherName+" says: "+ temp.getName()+" "+ arg);
	}
	public String toString() {
		return "dogwatcher " + watcherName;
	}
	
}
