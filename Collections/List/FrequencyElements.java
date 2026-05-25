package org.snad.list;

import java.util.*;

public class FrequencyElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		List <String> list = new ArrayList<String>();
		
		for(int i=0;i<s;i++) {
			list.add(sc.next());
		}
		List <String> list1 = new ArrayList<String>();
		
		for(String string : list) {
			if(!list1.contains(string)) {
				int count = 0;
				 
				for(String str : list) {
					if(string.equals(str)) {
						count++;
					}
				}
				System.out.println(string + " → " + count);
				list1.add(string);
			}
		}
		
	}

}
