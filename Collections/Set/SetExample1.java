package org.snad.set;

import java.util.*;

public class SetExample1 {
	public static void main(String[] args) {
		System.out.println("======set=======");
		Set<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());
		}

		System.out.println(set);
		
		System.out.println("======Hashset=======");
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			hashSet.add(sc.nextInt());
		}
		System.out.println(hashSet);
		
		System.out.println("========Linked Hashset==========");
		LinkedHashSet<Integer> linkedHashset = new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++) {
			linkedHashset.add(sc.nextInt());
		}
		System.out.println(linkedHashset);
		
		System.out.println("======TreeSet=======");
		TreeSet treeSet = new TreeSet<>();
		for(int i=0;i<n;i++) {
			treeSet.add(sc.nextInt());
		}
		System.out.println(treeSet);
		
	}

}
