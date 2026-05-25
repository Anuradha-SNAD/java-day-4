package org.snad.iterator;

import java.util.*;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		Emp emp1 = new Emp(2,"Anu",3000);
		Emp emp2 = new Emp(1,"Sai",25000);
		Emp emp3 = new Emp(3,"Prasad",14000);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		SalaryComparator salaryComparator = new SalaryComparator();
		Collections.sort(list,salaryComparator);
		System.out.println(list);
	}

}
class Emp{
	int id ;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
class SalaryComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return Double.compare(o1.salary, o2.salary);
	}
	
}
