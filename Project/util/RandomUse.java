package util;

import java.util.Random;
/**
 * 랜덤하게 생성
 * @author 2016112105 박선희
 *
 */
public class RandomUse {
	private static Random rand = new Random();
	/**
	 * 
	 * @param end 랜덤하게 생성할 가장 마지막 값
	 * @return end 이하 랜덤한 수
	 */
	public static int randInt(int end) {
		return rand.nextInt(end+1);
	}
}
