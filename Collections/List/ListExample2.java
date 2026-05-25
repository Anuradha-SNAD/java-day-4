package org.snad.list;
import java.util.*;

public class ListExample2 {
	public static void main(String[] args) {
		System.out.println("========ArrayList==========");
		List <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		List<Integer> list2 = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
			
		//methods
		list.add(1, 50);//add extra element at particular index
		System.out.println(list.get(4));
		list.set(3, null);
		list.set(1, null);
		list.remove(1);
		System.out.println(list.contains(70));
		System.out.println(list.indexOf(null));
		System.out.println(list.lastIndexOf(10));
		System.out.println(list);
		System.out.println(list2);
		list.clear();
		
		list.addAll(list2);
		list.removeAll(list);
		list.retainAll(list2);
		Collections.sort(list);
		Collections.reverse(list);
		Collections.shuffle(list);
		System.out.println(list);
		
//		System.out.println("=========Linked List=========");
//		List<Integer> list = new LinkedList<Integer>();
//		list.addFirst(10);
//		list.addFirst(30);
//		list.addLast(20);
//		list.addLast(50);
//		list.removeFirst();
//		list.removeLast();
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		Collections.sort(list);
//		System.out.println(list);
//		
//		System.out.println("=========Vector==============");
//		Vector<Integer> list = new Vector<Integer>();
//		list.addElement(10);
//		list.addElement(20);
//		System.out.println(list.elementAt(0));
//		System.out.println(list);
		
		System.out.println("==========Stack===========");
		Stack <Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
//		stack.pop();
//		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.search(20));
		System.out.println(stack.get(0));
		System.out.println(stack.empty());
		System.out.println(stack);
		
	}

}
