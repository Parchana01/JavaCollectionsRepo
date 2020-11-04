package HashSetConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("Tom");
		hSet.add("Peter");
		hSet.add("Archana");
		
		System.out.println("***to attted the specified element at the end of HasSet***");
		
		hSet.add("Panigrahi");
		
		hSet.iterator();
		
		System.out.println("***Iterating the hash set***");
		for(String name : hSet) {
			System.out.println(name);
		}
		
		System.out.println("The number of elements in the hashSet: "+hSet.size());
		
		System.out.println("*******Empty the HashSet*******");
		hSet.clear();
		
		if(hSet.isEmpty()) {
			System.out.println("HashSet is empty");
		}
		
		hSet.add("Tom");
		hSet.add("Peter");
		hSet.add("Archana");
		
		System.out.println("********Cloning the hasSet******");
		HashSet<String> clonedSet = new HashSet<String>();
		clonedSet = (HashSet)hSet.clone();
		for(String name : clonedSet) {
			System.out.println(name);
		}
		
		System.out.println("Converting HashSet into Array");
		String[] new_Array = new String[(hSet.size())];
		hSet.toArray(new_Array);
		
		for(String element: new_Array) {
			System.out.println(element);
		}
		
		System.out.println("******Convert hashSet into TreeSet");
		Set<String> treeSet = new TreeSet<String>(hSet);
		for(String element: treeSet) {
		System.out.println(element);
		}
		
		System.out.println("******Convert hashSet into List/Arraylist");
		List<String> list_String = new ArrayList<String>(hSet);
		for(String element : list_String) {
			System.out.println(element);
		}
		
		System.out.println("Compare two HashSets");
		
		HashSet<String> hSet1 = new HashSet<String>();
		hSet1.add("Tom");
		hSet1.add("Peter");
		hSet1.add("Panigrhi");
		
		System.out.println("Set1:" + hSet);
		System.out.println("Set2:" + hSet1);
		List<String> hSet2 = new ArrayList<String>();
		
		for(String element: hSet) {
			if(hSet1.contains(element)) 
				hSet2.add("Yes");
			else
				hSet2.add("No");
			
		}
		System.out.println(hSet2);
		
		System.out.println("Remove all the elements from HashSet");
		hSet2.clear();
		
		System.out.println("Printing the common elements of above 2 sets");
		for(String element: hSet) {
			if(hSet1.contains(element) )
				hSet2.add(element);
			
		}
		System.out.println(hSet2);
		
	}

}
