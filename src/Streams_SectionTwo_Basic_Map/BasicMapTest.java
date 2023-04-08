package Streams_SectionTwo_Basic_Map;

import java.util.ArrayList;

public class BasicMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al  = new ArrayList<>();
		
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(1);
		
		al.stream().map(n->n*2).forEach(n->System.out.println(n));
		

	}

}
