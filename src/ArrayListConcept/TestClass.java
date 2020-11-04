package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass {

	public static <E> void main(String[] args) {
		
		int[] a = new int[3]; //static array - The size is fixed.
		
		//dynamic array -- arraylist
		//once we kepp on adding the value the size will be increased.
		//1.it can contain suplicate values or elements
		//2.it maintains insertion order
		//3.it is not synchronized i.e it is not thread safe(slow)
		//4. allows randowm access to fetch the element because it stores the values on the basis of indexes.
		ArrayList ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		System.out.println("*************");
		System.out.println(ar.size());//length of the particular array list
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		ar.add(null);
		ar.add(null);
		
		System.out.println(ar.size());//length of the particular array list
		
		System.out.println(ar.get(4));//value at index 4
		
		//To print all the values from arraylist: 
		//1. for loop
		//2. Iterator
		System.out.println("*************");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//non generic vs generic
		//please define the genrics i.e. what kind of values we want to store into arraylistt
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		//ar1.add('test');//Can't add other than integer values
		ar1.add(10);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		ar2.add("Selenium");
		
		Collections.sort(ar2);
		
		Collections.shuffle(ar2);
		ar.clone();
		
		System.out.println("*****setting the value******");
		ar2.set(1,"QTP");
		for(String elemen : ar2) {
			System.out.println(elemen);
		}
		ar2.remove(1);
		for(String elemen : ar2) {
			System.out.println(elemen);
		}
		ar2.trimToSize();
		
		//System.out.println("Please enter the index value for which you want to retrieve the element value");
		
		//Scanner sc= new Scanner(System.in);
		//int index= sc.nextInt();
		
		//System.out.println("The vaue at index " + index + " is : " + ar2.get(index));
		
		ArrayList<E> ar3 = new ArrayList<E>();//if you don't know what kind of values need to be inserted
		
		//Employee class objects:
		Employee e1 = new Employee("Jhon",12,"IT");
		Employee e2 = new Employee("Peter",13,"QA");
		Employee e3 = new Employee("Tom",34,"Dev");
		
		//create Arraylist
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		/*
		 * //for loop to traverse the values for(int i=0;i<ar4.size();i++) {
		 * System.out.println(ar4.get(i).name + " " + ar4.get(i).age + " " +
		 * ar4.get(i).dept); }
		 */
		System.out.println("*************");
		//USing iterator to traverse the Arraylist:
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name + " " + emp.age + " " + emp.dept);
		}
		
		
		//*********************************
		
		//addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("seenium");
		ar5.add("QA");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("HTML");
		ar6.add("JavaScript");
		ar6.add("Java");
		System.out.println("*************");
		//Add the ar6 values into ar5.
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("*************");
		//removeAll
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll
		ArrayList<String> ar7 = new ArrayList<String>();
		
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		ar7.add("HTML");
		
		ArrayList<String> a8 = new ArrayList<String>();
		a8.add("test");
		a8.add("selenium");
		
		
		ar7.retainAll(a8);
		System.out.println("*************");
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		
		

	}

}
