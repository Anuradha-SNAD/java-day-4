package org.snad.map;

import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String [] words = n.split(" ");
		Map<String,Integer> map = new HashMap<>();	
		
		for(String s : words) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
			
		}
		
	}

}
