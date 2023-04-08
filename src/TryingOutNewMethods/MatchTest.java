package TryingOutNewMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> ls  =  Arrays.asList("apple","van","bat","dog","cat","apple");
		
		//Sorted
		
		ls.stream().sorted().forEach(n->System.out.println(n));

		//AnyMatch
			
		boolean bs  =  ls.stream().anyMatch(v1->v1.startsWith("a"));
		
		System.out.println(bs);
		
		//AllMatch
		
		Boolean vs   = ls.stream().allMatch(v1->v1.startsWith("a"));
		System.out.println(vs);
		
		//NonMatch
		
		boolean ba  = ls.stream().noneMatch(v1->v1.startsWith("z"));
		System.out.println(ba);
		
		//FindAny
	
		Optional<String> randvalue  =  ls.stream().findAny();
		
		System.out.println(randvalue.get());
		
		
	}

}
