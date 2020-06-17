package main;

import java.util.List;

import student.Builder;
import student.Student;
/**
 * WPG 시뮬레이터
 * @author 2016112105 박선희
 *
 */
public class WPG {
	private Generator generator = new Generator();
	private Student student = new Student();
	private List<Operator> problems;
	private int score=0;
	/**
	 * 학생 정보 입력받기
	 */
	public void setStudent() {
		Builder builder = new Builder();
		builder.setPersons();
		builder.setItems();
		
		student = new Student();
		student.myData = builder.build();
	}
	
	public void startGenerator() {
		System.out.println("\n문제 유형을 답해주세요.");
		generator.setting();

		System.out.println("\n사용자 맞춤형 문제를 제작중입니다.");
		problems = generator.makeProblem(student.myData);
		System.out.println("\n사용자 맞춤형 문제가 완성되었습니다.");
	}
	public void startSolve() {
		for(Operator i : problems) {
			if(i.processOneProblem())
				System.out.println("정답입니다!"+(++score)+"점 입니다.\n");
			else
				System.out.println("오답입니다ㅠㅡㅠ"+(score)+"점 입니다.\n");
		}
	}

	
}
