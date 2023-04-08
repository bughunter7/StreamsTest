package Streams_SectionThree_Basic_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlMapTest {

	String Ename;
	int Salary;
	
	public FlMapTest(String Ename,int Salary) {
		// TODO Auto-generated constructor stub
		this.Ename  = Ename;
		this.Salary = Salary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<FlMapTest> aone   = new ArrayList<>();
		aone.add(new FlMapTest("shubham", 12000));
	
		ArrayList<FlMapTest> atwo   = new ArrayList<>();
		atwo.add(new FlMapTest("shubham", 120000));
		
		List<List<FlMapTest>>la= Arrays.asList(aone,atwo);
		
		la.stream().flatMap(n->n.stream()).forEach(n->System.out.println(n.Ename + " "+n.Salary));
		
		
		}

}
