package org.snad.iterator;

import java.util.*;

public class IterateEmployeeObjects {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee employee1 = new Employee(1,"Anu");
		Employee employee2 = new Employee(2,"Vara");
		Employee employee3 = new Employee(3,"Sai");
		Employee employee4 = new Employee(4,"Prasad");
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		
		for(int i=0;i<list.size();i++) {
			Employee e =list.get(i);
			System.out.println("Id : "+e.id+", Name : "+e.name);
		}
		System.out.println("=======for each loop : ========");
		for(Employee e : list) {
			System.out.println("Id : "+e.id+", Name : "+e.name);
		}
		
		System.out.println("=======using iterator: ========");
		Iterator<Employee> i = list.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("Id : "+e.id+", Name : "+e.name);
		}
	}

}
class Employee{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
}
