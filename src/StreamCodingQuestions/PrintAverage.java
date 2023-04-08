package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PrintAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = Arrays.asList(1,2,3,4,5);
		
		 int c  = (int) ls.stream().count();
		 
		 System.out.println(c);

		 Optional<Integer> ans  =  ls.stream().reduce((value,combinedvalue)->(value+combinedvalue));
		 int averge  = ans.get() / c;
		 System.out.println("Average of the arrays is "+averge);
		 
		 // Map to INT
		 
		double d =  ls.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println("Average V2.0 "+d);
		
		//Get Square of the Number
		
	       double avv =  ls.stream().map(n->n*n).filter(n->n>10).mapToInt(n->n).average().getAsDouble();
	        
	       System.out.println(avv);
	     
	     
	     
	}

}
