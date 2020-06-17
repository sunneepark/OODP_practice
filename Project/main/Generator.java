package main;

import java.util.ArrayList;
import java.util.List;

import operator.*;
import student.Data;
import util.ConsoleReader;
import util.RandomUse;
/**
 * 문제에 필요한 것을 입력 받고, 이에 맞는 문제를 발생한다.
 * @author 2016112105 박선희
 *
 */
public class Generator {
	private List<Integer> operators;
	private int problemNum;
	private static int OPERATORS_NUM=4;
	void setting() {
		this.setOperator();
		this.setProblemNum();
		this.setOperandRange();
	}
	/**
	 * Making Problems
	 * @param myData
	 * @return
	 */
	List<Operator> makeProblem(Data myData) {
		int[] checkOperatorNum = new int[OPERATORS_NUM+1];
		for(int i=0;i<checkOperatorNum.length;i++)
			checkOperatorNum[i]=0;
		
		int operatorNum = operators.size();
		List<Operator> temp = new ArrayList<Operator>();
		int idx=0;
		
		while(temp.size() < problemNum) {
			idx=RandomUse.randInt(operatorNum-1);
			while(checkOperatorNum[operators.get(idx)] >= Math.ceil((double)problemNum/operatorNum))
				idx=(++idx % operatorNum);  //문제수가 반보다 아직 안됬다면

			checkOperatorNum[operators.get(idx)]++;
			temp.add(whatOperator(operators.get(idx)-1));
		}
		idx=0;
		for(Operator op : temp) //문제 생성
			op.doMakeProblem(++idx, myData);
		
		return temp;
	}
	
	private void setOperator() {
		System.out.println("연산의 종류를 선택해주세요.(1.더하기 / 2.빼기 / 3.곱하기 / 4.나눗셈)");
		this.operators = ConsoleReader.intRepeat();
	}
	private void setProblemNum() {
		System.out.println("문제 수를 입력해주세요.");
		this.problemNum = ConsoleReader.promptInt();
	}
	private void setOperandRange() {
		System.out.println("피연산자의 범위를 입력해주세요.");
		new Range(ConsoleReader.promptInt(), ConsoleReader.promptInt());
	}
	/**
	 * 
	 * @param idx operator index
	 * @return idx에 알맞은 연산자를 생성.
	 */
	private Operator whatOperator(int idx) {
		if(idx == 0) return new Plus();
		if(idx == 1) return new Subtract();
		if(idx == 2) return new Multiply();
		if(idx == 3) return new Division();
		return null;
	}
	public static class Range{
		private static int start;
		private static int end;
		public Range(int start, int end) {
			this.start = start;
			this.end = end;
		}
		public static int makeRandOperand() {
			return RandomUse.randInt(end-start)+start; //0+start~end-start+start
		}
	}
}
