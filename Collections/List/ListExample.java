package org.snad.list;
import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Integer> list = new ArrayList<>();
		
		System.out.println("Enter the elements and enter any non-integer to stop");
		
//		while(true) {
//			int inputs = sc.nextInt();
//			if(inputs==-1) {
//				break;
//			}
//			list.add(inputs);
//		}
		while(sc.hasNextInt()) {
			list.add(sc.nextInt());		
		}//it runs upto non-integer input comes
		
		System.out.println(list);
		System.out.println(list.size());
	}

}
