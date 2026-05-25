package org.snad.iterator;

import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		System.out.println("==============using for loop==============");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==============using for each loop==============");
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("==============using iterator ==============");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==============using List iterator ==============");
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("==============using ListIterator Reverse ==============");
		ListIterator<Integer> rev = list.listIterator(list.size());
		while(rev.hasPrevious()) {
			System.out.println(rev.previous());
		}
	}

}
