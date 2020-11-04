package LinkedListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList<String> names= new LinkedList<String>();
		names.add("Archana");
		names.add("Peter");
		names.add("Tom");
		
		for(String element:names) {
			System.out.println(element);
		}

		System.out.println("Appending Jhon at the last postion");
		
		names.add("Jhon");
		for(String element:names) {
			System.out.println(element);
		}
		
		System.out.println("Iterating the linked listfrom the second position");
		ListIterator<String> li = names.listIterator(1);
		
		while(li.hasNext()) {
			String element  = li.next();
			System.out.println(element);
		}
				
		System.out.println("Travesring the linked list in reverse order");
		li = names.listIterator(names.size());
		while(li.hasPrevious()) {
			String element = li.previous();
			System.out.println(element);
		}
		
		System.out.println("*****before inserting the value");
		for(String element : names) {
			System.out.println(element);
		}
		
		System.out.println("insert the specified element at the specified position in the linked list");
		/*
		 * li = names.listIterator(); while(li.hasNext()) { String show = li.next();
		 * if(li.nextIndex() == 1){ li.add("Panigrahi"); } }
		 */
		names.add(1,"Panigrahi");
		
		for(String element : names) {
			System.out.println(element);
		}
		
		System.out.println("*******insert at the first and last position in the linked list****");
		names.addFirst("Girl");
		names.addLast("Boy");
		names.offerFirst("AAA");
		names.offerLast("AAA");
		for(String element: names) {
			System.out.println(element);
		}
		System.out.println("*******insert some elements at the specified position in the linked list****");
		LinkedList<String> newList = new LinkedList<String>();
		newList.add("Grany");
		newList.add("Nany");
		
		names.addAll(1,newList);
		
		for(String element: names) {
			System.out.println(element);
		}
		System.out.println("the first and last occurrence of the specified elements in the linked list");
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		
		System.out.println("Printing the elements with the position in the linked list");
		for(int i=0;i<names.size();i++) {
			System.out.println("The values at "+(i+1)+" position is: "+names.get(i));
		}
		
		System.out.println("Remove a specified element in the linked list");
		names.remove(0);
		for(String element: names) {
			System.out.println(element);
		}
		names.add(0,"AAA");

		System.out.println("remove first and last element from a linked list");
		names.removeFirst();
		names.removeLast();
		
		for(String element: names) {
			System.out.println(element);
		}
		System.out.println("remove all the elements from a linked list");
		names.removeAll(names);
		for(String element: names) {
			System.out.println(element);
		}
		
		names.add("Archana");
		names.add("Peter");
		names.add("Tom");
		
		System.out.println("Swap Archana and peter in the linked list");
		Collections.swap(names, 0, 1);
		for(String element: names) {
			System.out.println(element);
		}
		
		System.out.println("Shuffle the linked list");
		Collections.shuffle(names);
		for(String element: names) {
			System.out.println(element);
		}
		
		System.out.println("Join 2 linked lists");
		
		LinkedList<String> names1 = new LinkedList<String>();
		names1.add("Jhon");
		names1.add("Test");
		
		LinkedList<String> names2 = new LinkedList<String>();
		names2.addAll(names);
		names2.addAll(names1);
		
		for(String element: names2) {
			System.out.println(element);
		}
		
		
		System.out.println("Cloning linked list");
		LinkedList<String> names3 = (LinkedList) names.clone();
		for(String element: names3) {
			System.out.println(element);
		}
		
		System.out.println("Remove and return the first element of the linked list");
		System.out.println(names3.pop());
		
		System.out.println("retrieve but does not remove, the first and last element of a linked list");
		names3.addFirst("peter");
		
		System.out.println(names3);
		System.out.println(names3.peekFirst());
		System.out.println(names3.peekLast());
		
		if(names3.contains("Archana"))
			System.out.println("Archana is present");
		else
			System.out.println("Archana is not present");
		
		System.out.println("Convert a linklist list into ArrayList");
		
		List<String> araylist = new ArrayList<String>(names3);
		
		System.out.println(araylist);
		
		System.out.println("Compare two linked lists");
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Red");
		list1.add("orange");
		list1.add("blue");
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Red");
		list2.add("orange");
		
		LinkedList<String> list3 = new LinkedList<String>();
		
		for(String element: list1) {
			if(list2.contains(element))
				list3.add("Yes");
			else
				list3.add("No");
		}
		
		System.out.println(list3);
		System.out.println("To verify whether list is empty or not");
		list3.removeAll(list3);
		if(list3.isEmpty()) {
			System.out.println("list is empty");
		}
		
		System.out.println("replace an element in the linked list");
		list1.set(0,"uuu");
		System.out.println(list1);
		
		
		
		
		

		
		
		
			
	}

}
