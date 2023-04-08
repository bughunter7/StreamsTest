package Streams_SectionFive_TerminalandNonTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TermandNonTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> la  = Arrays.asList(12,5,45,34,22,2,12,4,1,1);
		
		//Distinct
		//la.stream().distinct().forEach(n->System.out.println(n));

		//Limit
		
		List<String> sr  = Arrays.asList("shubham","subhash","parab");
		
		sr.stream().limit(2).forEach(s->System.out.println(s));
		
		//NonTerminal Operations
		
		List <Integer> sa = la.stream().collect(Collectors.toList());
		
			sa.stream().forEach(n->System.out.println("this is coverted object "+n));
			
	// Finding Distinct
			
		List<Integer> aa =  sa.stream().distinct().collect(Collectors.toList());
			
		Optional<Integer> ss  =  aa.stream().max((v1,v2)->(v1.compareTo(v2)));
	
		System.out.println(ss.get());
	}

}
