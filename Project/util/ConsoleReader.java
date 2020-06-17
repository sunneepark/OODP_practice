package util;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 콘솔로 입력 받는 클래스
 * @author 2016112105 박선희
 *
 */
public class ConsoleReader {
	// by default, read input from the user's console
	private static Scanner in = new Scanner(new InputStreamReader(System.in));
	
	public static void setInput(InputStreamReader inputStream) {
		in = new Scanner(inputStream);
	}
	public static int promptInt(String str) {
		System.out.println(str);
		return in.nextInt();
	}
	public static String promptDouble(String str) {
		System.out.println(str);
		return promptString();
	}
	public static List<String> stringRepeat(){
		System.out.println("(그만 입력 하시려면 'end'를 입력하세요.)");
		List<String> temp = new ArrayList<String>();
		while(true) {
			String input = ConsoleReader.promptString();
			if(input.equals("end")) break;
			temp.add(input);
		}
		return temp;
	}
	public static List<Integer> intRepeat(){
		System.out.println("(그만 입력 하시려면 'end'를 입력하세요.)");
		List<Integer> temp = new ArrayList<Integer>();
		
		while(true) {
			String input = ConsoleReader.promptString();
			if(input.equals("end")) break;
			temp.add(Integer.parseInt(input));
		}
		return temp;
	}
	public static String promptString() {
		return in.next();
	}
	public static int promptInt() {
		return in.nextInt();
	}
	
}
