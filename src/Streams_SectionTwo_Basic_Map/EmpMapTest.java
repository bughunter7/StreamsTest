package Streams_SectionTwo_Basic_Map;

import java.util.ArrayList;

public class EmpMapTest {

	String Ename;
	int Salary;

	public EmpMapTest(String Ename, int Salary) {
		// TODO Auto-generated constructor stub
		this.Ename = Ename;
		this.Salary = Salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<EmpMapTest> al = new ArrayList<>();

		al.add(new EmpMapTest("shubham", 120000));
		al.add(new EmpMapTest("Mahadeva", 98989));

		al.stream().filter(n -> n.Ename.startsWith("M")).map(n -> n.Salary / 10 * 100)
				.forEach(n -> System.out.println(n));

	}

}
