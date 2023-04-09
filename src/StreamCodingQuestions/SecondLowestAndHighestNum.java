package StreamCodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLowestAndHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ll = Arrays.asList(12, 4, 6, 78, 9);
		
		ll.stream().sorted().limit(2).skip(1).forEach(n->System.out.println(n));
		
		//Descending
		
		ll.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(n->System.out.println(n));
		

	}

}
