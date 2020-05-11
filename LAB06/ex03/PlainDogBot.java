package ex03;
/**
 * 
 * @author 2016112105 박선희
 *
 */
//dogbot을 상속받은 하나의 dogbot 종류
//dogbot 인터페이스 구현
public class PlainDogBot implements DogBot {

	protected int hungry, tired;
	protected String name;
	public PlainDogBot(int h, int t, String name) {
		this.hungry =h;
		this.tired= t;
		this.name=name;
	}
	public boolean eat(){
		if (hungry > 6){
			hungry -= 3;
			return true;
		}
		else
			return false;
	}

	public void rest(){
		hungry++;
		tired -= 2;
	}

	public void play(){
		hungry += 2;
		tired += 3;
	}

	public String noise(){
		if (hungry > 8 && tired < 11)
			return "whine ";
		else if (tired > 7 && tired > hungry)
			return "snore ";
		else
			return "woof ";
	}
	/**
	 * @role dogbot 이름 출력
	 */
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "DogBot ["+ name+ "]";
	}
}
