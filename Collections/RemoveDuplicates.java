package org.snad.list;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> unique = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int input = sc.nextInt();
			list.add(input);
		}
		for(int i=0;i<n;i++) {
			if(!(unique.contains(list.get(i)))){
				unique.add(list.get(i));
			}
		}
		System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + unique);
	}

}
