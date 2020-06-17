package student;

import java.util.ArrayList;
import java.util.List;

import util.ConsoleReader;

/**
 * Store input data(related student) attribute temporarily
 * 
 * @author 2016112105 박선희
 * 
 */
public class Builder {
	private List<String> persons;
	private List<String> items;
	private String temp;
	public Builder() {
		persons=new ArrayList<String>();
		items=new ArrayList<String>();
	}
	public Data build() {
		return new Data(persons, items);
	}

	public void setPersons() {
		System.out.println("귀하의 아이들에게 중요한 사람들의 이름을 적어주세요.(두 명 이상 적어주세요.)");
		persons = ConsoleReader.stringRepeat();
	}

	public void setItems() {
		System.out.println("귀하의 아이들이 관심을 가지고 있는 항목의 이름을 적어주세요.");
		items = ConsoleReader.stringRepeat();
	}
}
