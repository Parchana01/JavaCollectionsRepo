package HashMapHashTable;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapConcept {

	public static void main(String[] args) {
		//HashMap is a class that implements Map interface
		//It also extends AbstarctMap
		//it stores the value in {Key,Value} format
		//stores only unique values unlike Arraylist
		//it can can only one null key and multiple null values
		//it does not store the elements in sorting.
		//HashMap is non-synchronized --not thread safe
		//Concurrent modification exception - fail fast condition (Simultaneously if any thread modifies the hashmap structure then rest all threads will be seeing the modified hashMap) 
	
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "Test");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(null));
		
		hm.forEach((k,v) -> System.out.println("Key is : " + k + "Value is : "+ v ));
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(hm);
		hm.remove(2);		
		System.out.println(hm);
		
		//Hashmap Object using Employee Class
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "Dev");
		Employee e2 = new Employee("Peter", 21, "Admin");
		Employee e3 = new Employee("Jhon", 30, "Test");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			System.out.println("Employee" + key + " Info:");
			Employee e = m.getValue();
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
		
	}

}
