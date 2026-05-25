package org.snad.set;

import java.util.*;

public class SortEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> treeSet = new TreeSet<>();
		
		for(int i=0;i<n;i++) {
			treeSet.add(sc.next());
		}
		System.out.println(treeSet);
	}

}
