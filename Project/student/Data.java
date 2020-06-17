package student;

import java.util.List;

/**
 * 학생이 좋아하는 정보(input)
 * @author 2016112105 박선희
 *
 */
public class Data {
	private List<String> persons;
	private List<String> items;
	
	protected Data(List<String> persons, List<String> items) {
		super();
		this.persons = persons;
		this.items=items;
	}
	public String getPerson(int idx) {
		return persons.get(idx);
	}
	public String getItem(int idx) {
		return items.get(idx);
	}
	public int getPersonsSize() {
		return persons.size();
	}
	public int getItemsSize() {
		return items.size();
	}
}
