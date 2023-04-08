package Streams_SectionOne_Basics_Stream;

import java.util.ArrayList;

public class FilteringEmployeeSalary {
	
	String Ename;
	int Salary;
	
	
	public FilteringEmployeeSalary(String Ename,int Salary) {
		// TODO Auto-generated constructor stub
		this.Ename = Ename;
		this.Salary = Salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<FilteringEmployeeSalary> al  = new ArrayList<>();
		
		al.add(new FilteringEmployeeSalary("shubham", 50000));
		al.add(new FilteringEmployeeSalary("erf", 44));
		
		al.stream().filter(n->n.Salary>20000).forEach(n->System.out.println(n.Salary));
	}

}
