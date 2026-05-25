package org.snad.map;

import java.util.*;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Integer> map = new HashMap<String, Integer>();
		System.out.println("Enter Name => Marks");
		for(int i=0;i<n;i++){
			map.put(sc.next(), sc.nextInt());
		}
		System.out.println("Enter student name to search:");
        String search = sc.next();
        
        if(map.containsKey(search)) {
        	System.out.println(search+" = "+map.get(search));
        }else {
            System.out.println("Student not found");
        }
	}

}
