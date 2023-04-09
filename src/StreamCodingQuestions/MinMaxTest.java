package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ll = Arrays.asList(12, 4, 6, 78, 9);
		
	    Optional<Integer> minnum  = 	ll.stream().min((v1,v2)->v1.compareTo(v2));

	   System.out.println(" Minimum Value is "+minnum.get());
	   
	   // same applies for max value 
	   
	    
	}

}
