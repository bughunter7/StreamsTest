package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = Arrays.asList(12,4,56,7);
		
		Optional<Integer> op =  ls.stream().max((v1,v2)->v1.compareTo(v2));
		
		System.out.println(op);
		
		Optional<Integer> oa  =  ls.stream().min((v1,v2)->(v1.compareTo(v2)));

		System.out.println(oa.get());
	}

}
