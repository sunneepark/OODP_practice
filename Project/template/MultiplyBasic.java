package template;

import main.Generator;
import main.Template;
import student.Data;
import util.RandomUse;

public class MultiplyBasic implements Template {
	private int operand1;
	private int operand2;
	private String person1;
	private String item;
	
	@Override
	public Object makeTemplate(Data myData) {
		this.operand1 = Generator.Range.makeRandOperand();
		this.operand2 = Generator.Range.makeRandOperand();
		
		this.person1 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		
		this.item = myData.getItem(RandomUse.randInt(myData.getItemsSize()-1));
		
		return operand1*operand2;
	}

	@Override
	public void printTemplate() {
		System.out.println(person1+"은 "+operand1+"개의 "+item+"을 "
				+ operand2 +"묶음 가지고 있습니다."
						+person1+ "은 전부 "+ item+"이 몇 개입니까?");
	}
	

}
