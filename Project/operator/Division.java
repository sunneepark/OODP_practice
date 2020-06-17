package operator;

import java.math.BigDecimal;

import main.Operator;
import main.Template;
import student.Data;
import template.*;
import util.ConsoleReader;

public class Division extends Operator{
	private Template template;
	private double answer = 0.0;
	private static int DEMIALPLACES = 2;
	@Override
	public void doMakeProblem(int num, Data myData) {
		this.num = num;
		template = setTemplate(0);
		Object tempDivision = template.makeTemplate(myData);

		answer = Math.round((double)tempDivision*100)/100.0;
	}
	@Override
	public boolean doCheckAnswer() {
		String inputAnswer="";
		do {
			inputAnswer = ConsoleReader.promptDouble("소수점 셋째 자리에서 반올림 해주세요. ");
		}while(!checkDecimalPlaces(inputAnswer));
		String tempAnswer = Double.toString(answer);
		int i=0;

		for(;i<tempAnswer.length() ;i++) {
			if(inputAnswer.length()<=i) { 
				if(tempAnswer.charAt(i)!='0' && tempAnswer.charAt(i) != '.') return false;
			}
			else if(tempAnswer.charAt(i) != inputAnswer.charAt(i)) return false;
		}
		while(i<inputAnswer.length()) {
			if(inputAnswer.charAt(i++)=='0') return false;
		}
		return true;
	}

	@Override
	public void doPrintProblem() {
		template.printTemplate();
	}
	@Override
	public Template setTemplate(int idx) {
		if(idx == 0) return new DivisionBasic();
		return null;
	}
	/**
	 * item 이 숫자인지 숫자라면 소수점 이하 둘째 자리인지 확ㅇ니
	 * @param d item to be checked
	 * @return true of false
	 */
	private static boolean checkDecimalPlaces(String d) {
	       int i=0;
	       for(i=0;i<d.length();i++) {
	    	   if(d.charAt(i)=='.') break;
	    	   else if(d.charAt(i)<'0' || d.charAt(i)>'9') { 
	    		   System.out.println("숫자를 입력해주세요.");
	    		   break;
	    	   }
	       }
	       return (d.length()-i-1) <= DEMIALPLACES;
	}
	
}
