package org.snad.iterator;

import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		List<Employeee> list = new ArrayList<>();
		Employeee e1 = new Employeee(2,"Anu",20000);
		Employeee e2 = new Employeee(1,"Sai",20000);
		Employeee e3 = new Employeee(3,"Prasad",15000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		System.out.println("=== Comparable Sorted ByDefault Name with over-ridden compareTo ===");
		System.out.println(list);
	}

}
class Employeee implements Comparable<Employeee>{
	int id;
	String name;
	double salary;
	
	public Employeee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int compareTo(Employeee e) {
		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
