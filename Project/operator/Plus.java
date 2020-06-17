package operator;

import java.util.List;

import main.Operator;
import main.Template;
import student.Data;
import template.PlusBasic;
import util.ConsoleReader;

public class Plus extends Operator{
	private Template template;
	private int answer = 0;

	@Override
	public void doMakeProblem(int num, Data myData) {
		this.num = num;
		template = setTemplate(0);
		answer = (Integer)template.makeTemplate(myData);
	}
	@Override
	public boolean doCheckAnswer() {
		int inputAnswer = ConsoleReader.promptInt("답을 적어주세요.");
		return (answer == inputAnswer);
	}

	@Override
	public void doPrintProblem() {
		template.printTemplate();
	}
	@Override
	public Template setTemplate(int idx) {
		if(idx == 0) return new PlusBasic();
		return null;
	}


}
