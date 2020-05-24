package prototypeBasic;
/**
 * 
 * @author 2016112105 박선희
 * @usage 
 *
 */
public class MessageBox implements Product{
	private String text;
	private char wrapChar;
	public MessageBox(String text, char wrapChar) {
		this.text= text;
		this.wrapChar = wrapChar;
	}
	public String use() { //메서드가 해당하는 동작(앞뒤를 입력받은 문자로 감싼다)을 수행
		return wrapChar + text + wrapChar;
	}
	public Product createClone() { //자기 자신을 복사하여 새로운 인스턴스를 리턴
		Product copyElem = new MessageBox(text, wrapChar);
		return copyElem;
	}
}
