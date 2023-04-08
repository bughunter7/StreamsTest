package Streams_SectionOne_Basics_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>al  = new ArrayList<>();
		
		al.add(45);
		al.add(232);
		al.add(100);
		al.add(76);
		al.add(55);
		
		List<Integer>la ;
		//la  =al.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		al.stream().filter(n->n%2==0).forEach(k->System.out.println(k));
	

	}

}
