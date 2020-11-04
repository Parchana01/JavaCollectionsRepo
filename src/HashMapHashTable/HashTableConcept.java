package HashMapHashTable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to hashMap but it is synchronized.
		//stores the value on the basis of key and value
		//specifies the object which is key having hashcode based on that values are stored
		//Key --> Object --> HashCode --> Value (hashcode is 32-bit singed int number)
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Peter");
		h1.put(3, "Jhon");
		
		Hashtable h2 = new Hashtable();
		
		//Clone Method
		h2 = (Hashtable) h1.clone();
		
		System.out.println("the values from h1: " + h1);
		System.out.println("the values from h2: " + h2);
		
		h1.clear();
		System.out.println("the values from h1: " + h1);
		System.out.println("the values from h2: " + h2);
		
		//Contains Value
		Hashtable st = new Hashtable();
		
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen")) {
			System.out.println("Value is found");
		}
		
		//Print all the values using enumeration
		System.out.println("Print the values using Enumeration");
		
		
		Enumeration e = st.elements();
		while(e.hasMoreElements()){
		System.out.println(e.nextElement());	
		}
		
		//Print all the values using entrySet
		System.out.println("Print the values using EntrySet");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		//Check both hashtables are equal or not
		Hashtable st1 = new Hashtable();
		
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium"); //it contains only unique values
		st1.put("C", "Selenium");
		//no null values or keys are entertained //null pointer exception
		
		if(st1.equals(st)) {
			System.out.println("both the hash tables are equal");
		}
		
		//Get the value from a key:
		System.out.println(st1.get("A"));
		
		//Get the hashcode of hashtable object
		System.out.println("the has code value of st1: " + st1.hashCode());
		
		//Generics:
		Hashtable<String, String> st3 = new Hashtable<String, String>();
		
		
	}

}
