package template;

import main.Generator;
import main.Template;
import student.Data;
import util.RandomUse;

public class DivisionBasic implements Template {
	private int operand1;
	private int operand2;
	private String person1;
	private String item;
	
	@Override
	public Double makeTemplate(Data myData) {
		this.operand1 = Generator.Range.makeRandOperand();
		do {
			this.operand2 = Generator.Range.makeRandOperand();
		}while((int)((double)operand1/operand2) == 0);
		
		this.person1 = myData.getPerson(RandomUse.randInt(myData.getPersonsSize()-1));
		this.item = myData.getItem(RandomUse.randInt(myData.getItemsSize()-1));
		return (double)((double)operand1/(double)operand2);
	}

	@Override
	public void printTemplate() {
		System.out.println(person1+"은 "+item +"을 "+operand1+"개 가지고 있습니다."
				+ "(그/그녀)는 "+operand2+"명의 친구에게 "+item+"을 똑같이 나누어 주고 싶습니다."
						+"각각" +item+ "을 몇 개씩 가지게 되나요? (만약 똑같이 나누어 떨어지지 않을 경우에는 소수로 표현해주세요.)");
	}
}
