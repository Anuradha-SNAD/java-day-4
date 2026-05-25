package org.snad.set;

import java.util.*;

public class UniqueWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set <String> set = new HashSet<>();
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			set.add(sc.next());
		}
		System.out.println(set);
		System.out.println("count = "+set.size());
	}

}
