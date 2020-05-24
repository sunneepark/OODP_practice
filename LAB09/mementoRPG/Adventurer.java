package mementoRPG;
import java.awt.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author 2016112105 박선희
 * @purpose store user's state in RPG game using memento pattern
 *
 */

class careTaker{ //memento 여기선 스냅샷의 생성 삭제를 관리
	Stack<StateSnapshot> mementos = new Stack<>();
    public void push(StateSnapshot memento){
        mementos.push(memento);
    }
    public StateSnapshot pop(){
        return mementos.pop();
    }
}
class Map{
	int board[][] = new int[5][5]; //대략 예시
}
class Item{
	String name; int trait; //대략 예시
}
class Position{
	int x; int y;
}
class StateSnapshot { //memento
	// java final is similar to 'readonly' in c#, but it is just language support difference.
	private final int Hp;
	private final int Mp;
	private final Position Position;
	private final Map CurrentMap;
	private final Stream<Item> Items;
	
	public StateSnapshot(int hp, int mp, Position position, Map currentMap, Stream<Item> items) {
		super();
		Hp = hp;
		Mp = mp;
		Position = position;
		CurrentMap = currentMap;
		Items = items;
	}
	
	public int getHp() {
        return Hp;
    }

    public int getMp() {
        return Mp;
    }

    public Position getPosition() {
        return Position;
    }

    public Map getMap() {
        return CurrentMap;
    }

    public java.util.List<Item> getItems() {
        return Items.collect(Collectors.toList());
    }
}

public class Adventurer {
	public int Hp;
	public int Mp;
	public Position Position;
	public Map CurrentMap;
	public Stream<Item> items;
	
	public StateSnapshot CreateSnapshot() { 
		return new StateSnapshot(Hp, Mp, Position, CurrentMap, items); 
	} 
	public void RestoreSnapshot(StateSnapshot snapshot) {
		Hp = snapshot.getHp(); 
		Mp = snapshot.getMp();
		items = (Stream<Item>) snapshot.getItems(); 
		Position = snapshot.getPosition(); 
		CurrentMap = snapshot.getMap(); 
	}

}
class Game {
	Adventurer user;
	careTaker care;
	public void Play() {
		//만약 user 가 살아있다면 caretaker 에 저장
		//만약 user 가 죽으면 마지막 스냅샷 pop();
	}
}
