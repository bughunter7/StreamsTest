package StreamCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = Arrays.asList(12,4,56,7);
		
		ls.stream().filter(n->n%2==0).forEach(n->System.out.println("Even Numbers  "+n));
		ls.stream().filter(n->n%2!=0).forEach(n->System.out.println("Odd Number "+n));
		

	}

}
