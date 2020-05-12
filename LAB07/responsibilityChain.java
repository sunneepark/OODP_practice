import java.util.function.Function;

/**
 * 
 * @author 2016112105 박선희
 * @purpose 책임연쇄패턴을 람다식으로 표현
 *
 */
public class responsibilityChain {
	public static void main(String[] args) {
		Function<Integer, Integer> receiver1 = (Integer i) -> i%100;
		Function<Integer, Integer> receiver2 = (Integer i) -> i%10;
		
		Function<Integer, Integer> Handler = receiver1.andThen(receiver2);
		int result = Handler.apply(531);

        System.out.println(result);
    }

}
