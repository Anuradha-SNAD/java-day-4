package org.snad.map;

import java.util.*;

public class MapExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map <Integer,String> map = new HashMap<>();
//		int n = sc.nextInt();
//		
//		for(int i=0;i<n;i++) {
//			map.put(sc.nextInt(), sc.next());
//		}
		map.put(101,"Anu");
		map.put(102,"Ravi");
		map.put(103,"sai");
		map.put(104,"vara");
		map.put(105,"prasad");
		System.out.println(map);
		
		//map methods
		System.out.println(map.get(101));
		map.remove(101);
		System.out.println(map.size());
		System.out.println(map.keySet());//all keys
		System.out.println(map.values());//all values
		System.out.println(map.entrySet());
		
		LinkedHashMap <Integer,String> map2 = new LinkedHashMap<>();
		map2.put(103,"Ravi");
		map2.put(102,"sai");
		map2.put(104,"vara");
		System.out.println(map2);
		
		TreeMap <Integer,String> map3 = new TreeMap<>();
		map3.put(103,"Ravi");
		map3.put(102,"sai");
		map3.put(104,"vara");
		System.out.println(map3);
		
	}

}
