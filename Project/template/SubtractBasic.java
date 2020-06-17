package template;

import main.Generator;
import main.Template;
import student.Data;
import util.RandomUse;

public class SubtractBasic implements Template{

	private int operand1;
	private int operand2;
	private String person1;
	private String person2;
	private String item;
	
	@Override
	public Object makeTemplate(Data myData) {
		this.operand1 = Generator.Range.makeRandOperand();
		do {
			this.operand2 = Generator.Range.makeRandOperand();
		}while(operand2 > operand1);
		
		this.person1 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		do {
			this.person2 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		}while(person2.equals(person1));
		this.item = myData.getItem(RandomUse.randInt(myData.getItemsSize()-1));
		
		return operand1-operand2;
	}

	@Override
	public void printTemplate() {
		System.out.println(person1+"은 "+item +"을 "+operand1+"개 가지고 있습니다."
				+ person1+"은 "+person2+"에게 "+item+" "+operand2+"개 주었습니다."
						+person1+ "에게 몇 개의 "+ item+"가 남았습니까?");
	}
	
}
