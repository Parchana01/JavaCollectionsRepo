package LinkedListConcept;

import java.util.Iterator;
import java.util.LinkedList;


//LinkedList is class which is implementing List Interface as well as Deque Interface
//LinkedList is a dynamic array which stores the data on the basis of 2 things:1. actual data and 2.Reference of the second node
//
public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RPA");
		
		//Print:
		System.out.println("Linked List content"+ll);
	
		//addfirst:
		ll.addFirst("UTP");
		//addLast:
		ll.addLast("Automation");
		
		System.out.println("Updated Linked List content"+ll);
		
		System.out.println("0th index value: "+ll.get(0));
		
		ll.set(0, "Manual");
		System.out.println("0th index value: "+ll.get(0));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Updated Linked List content"+ll);
		
		ll.remove(2);
		
		System.out.println("Updated linked list: "+ll);
		
		//How to print all the values of linked list:
		//for loop
		//advanced for loop
		//iterator
		//while loop
		
		System.out.println("Printing using for loop: ");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("Using advance for loop");
		for(String str: ll) {
			System.out.println(str);
		}

		System.out.println("Printing using iterator");
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);			
			
		}

		System.out.println("Printing Using while loop");
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	} 

}
