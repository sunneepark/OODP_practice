package prototypeBasic;
import java.util.HashMap;
/**
 * 
 * @author 2016112105 박선희
 * @usage prototype factory
 *
 */
public class PrototypeService{
	private HashMap<String, Product> productList = new HashMap<String, Product>();
	void register(String name, Product copyElem) { //복사할 객체를 등록한다. key는 객체의 다운캐스팅한 클래스 이름
		productList.put(name, copyElem);
	}
	Product create(String name) { //등록되어 있는 객체에서 클래스명으로 해당하는 객체를 복사
		return ((Product)(productList.get(name))).createClone();
	}
}
