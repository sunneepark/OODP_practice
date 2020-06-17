package template;

import main.Template;
import main.Generator;
import main.Generator.Range;
import student.Data;
import util.RandomUse;

public class PlusBasic implements Template{
	private int operand1;
	private int operand2;
	private String person1;
	private String person2;
	private String item;
	
	@Override
	public Object makeTemplate(Data myData) {
		this.operand1 = Generator.Range.makeRandOperand();
		this.operand2 = Generator.Range.makeRandOperand();
		
		this.person1 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		do {
			this.person2 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		}while(person2.equals(person1));
		this.item = myData.getItem(RandomUse.randInt(myData.getItemsSize()-1));
		
		return operand1+operand2;
	}

	@Override
	public void printTemplate() {
		System.out.println(person1+"은 "+item +"을 "+operand1+"개 가지고 있습니다."
				+ person2+"은 "+item+"을 "+operand2+"개 가지고 있습니다."
						+ "그들이 가지고 있는 "+ item+"은 모두 몇 개입니까?");
	}
	
}
