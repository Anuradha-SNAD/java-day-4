package org.snad.list;
import java.util.*;

public class StudentListManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("Anu");
		list.add("Sai");
		list.add("Prasad");
		
		System.out.println("1.Add Student");
		System.out.println("2.Remove Student");
		System.out.println("3.Search Student");
		System.out.println("4.All Students");
		int n = sc.nextInt();
		switch(n) {
		case 1 :{
			System.out.println("How many students?");
		    int input = sc.nextInt();

		    for(int i=0;i<input;i++) {
		        list.add(sc.next());
		    }
		    System.out.println("Added successfully");

		    System.out.println(list);
		    break;
		}
		case 2 :{
			System.out.println("Enter student name to remove : ");
			String name = sc.next();
			if(list.contains(name)) {
				list.remove(name);
				System.out.println("removed successfully");
				System.out.println(list);
			}else {
				System.out.println("student not found");
			}
			break;
		}
		case 3 :{
			System.out.println("Enter student name to search id : ");
			String n1 = sc.next();
			if(list.contains(n1)) {
				System.out.println(n1+" id is : "+list.indexOf(n1));
			}else {
				System.out.println("student not found");
			}
			break;
			
		}
		case 4 :{
			System.out.println(list);
			break;
		}
		default :{
			System.out.println("Invalid input!!Choose Correct one");
		}
		
		}
		
		
	}

}
