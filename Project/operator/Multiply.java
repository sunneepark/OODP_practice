package operator;

import main.Operator;
import main.Template;
import student.Data;
import template.MultiplyBasic;
import util.ConsoleReader;

public class Multiply extends Operator {
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
		int inputAnswer = ConsoleReader.promptInt();
		return (answer == inputAnswer);
	}

	@Override
	public void doPrintProblem() {
		template.printTemplate();
	}
	@Override
	public Template setTemplate(int idx) {
		if(idx == 0) return new MultiplyBasic();
		return null;
	}

}
