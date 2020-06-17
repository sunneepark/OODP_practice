package main;

import student.Data;
/**
 * 문제의 템플릿
 * @author 2016112105 박선희
 *
 */
public interface Template {
	/**
	 * template 에 맞게 문제 출력
	 */
	void printTemplate();
	/**
	 * 
	 * @param myData template을 만들 때 필요한 데이터 해당 데이터에서 랜덤하게 가져와서 저장
	 * @return 랜덤하게 생성한 문제의 답
	 */
	Object makeTemplate(Data myData);
}
