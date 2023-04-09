package StreamCodingQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicatesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = Arrays.asList(1,2,3,5,6,2,32,1);
		
		//ls.stream().filter(n->Collections.frequency(ls, n)>1).forEach(N->System.out.println(N));
		
		// Approach Two
		
		HashSet<Integer> hs  = new HashSet<>();
		
		ls.stream().filter(n->!hs.add(n)).forEach(n->System.out.println(n));
		
		

	}

}
