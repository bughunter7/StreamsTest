package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ll = Arrays.asList(12, 4, 6, 78, 9);
		
		ll.stream().skip(2).forEach(n->System.out.println(n));

	}

}
