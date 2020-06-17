package main;

import student.Data;
import student.Student;
/**
 * 연산자에 맞는 문제 저장
 * @author 2016112105 박선희
 *
 */
public abstract class Operator {
	public int num =0; //문제 번호
	/**
	 * primitive method
	 * @return 문제의 답을 확인
	 */
	public boolean processOneProblem() {
		System.out.println(num+"번째 문제");
		doPrintProblem();
		return doCheckAnswer();
	}
	public abstract void doMakeProblem(int num, Data myData);
	public abstract void doPrintProblem();
	public abstract boolean doCheckAnswer();
	public abstract Template setTemplate(int idx);
}
