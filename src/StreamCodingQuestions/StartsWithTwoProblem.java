package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithTwoProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls =  Arrays.asList(22,44,23,3,21,2,23,1);

		//Print only those Number which starts with 2
		
		List<String> aa =  ls.stream().map(n->String.valueOf(n)).filter(n->n.startsWith("2")).collect(Collectors.toList());
		
		System.out.println(aa);
	}
	

}
