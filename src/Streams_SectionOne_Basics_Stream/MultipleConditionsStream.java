package Streams_SectionOne_Basics_Stream;

import java.util.ArrayList;

public class MultipleConditionsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Name Starts with s and length should be more than 5
		
		ArrayList<String> al  = new ArrayList<>();
		
		al.add("shubham");
		al.add("salu");
		al.add("srk");
		al.add("sam");
		al.add("saibaba");
		al.add(null);
		
	//	al.stream().filter(n->n.length()>5 && n.startsWith("s")).forEach(n->System.out.println(n));
		
		// Display all values except null
		
		al.stream().filter(n->n!=null).forEach(n->System.out.println("these are my non null values "+n));

	}

}
