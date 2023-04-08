package TryingOutNewMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestPracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> la  = Arrays.asList(1,2,3,4,5);
		
	//	Optional<Integer> aila  =  la.stream().reduce((value,combinedvalue)->value+combinedvalue);

		la.stream().reduce((value,combinedvalue)->(value+combinedvalue));
		
		la.stream().toArray();
		
		// Find Minimum
		
		Optional<Integer> o  = la.stream().min((v1,v2)->v1.compareTo(v2));
		
		System.out.println(o.get() + " This is my minimun value ");
	}

}
