package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = Arrays.asList(12,4,56,7);
		
		Optional<Integer> op =  ls.stream().reduce((value,accumulator)->(value+accumulator));
		
		System.out.println(op.get());
		

	}

}
