package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Iterator Vs ListIterator
//1. Iterator can be used by different interfaces like Set, List, Map but ListIterator can only be used by LIST interface(ArrayList, Linked List)
//2. Iterator can be used only for forward traversing but ListIterator can be used for forward and backward both direction traversing.
//3. Iterator can be used only to remove the elements  but Listerator is used to add, remove, set the elements.
//4. Using iterator we can traverse only from starting postion of the collection but Listiterator is used to traverse from any position of the list.

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Friends");
		tvSeries.add("The big bang theory");
		tvSeries.add("The dead man");
		tvSeries.add("Game Of Thrones");
		
		System.out.println("**********Printing using for each lamda*******");
		//1.Jdk 8 lamda expression
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("**********Printing using iterator******");
		//2.Iterator
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}
		
		//3.Iteraort with Foreach remaining and lamda
		System.out.println("**********Printing using iterator and ForEach remaining with lamda******");
		it=tvSeries.iterator();
		it.forEachRemaining(shows ->{
			System.out.println(shows);
		});
		
		//4.For loop with index
		System.out.println("**********Printing using For loop******");
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//5.Using for each loop
		System.out.println("**********Printing using for each loop*************");
		
		for(String element: tvSeries) {
			System.out.println(element);
		}
		
		//6.Using ListIterator each loop
		System.out.println("**********Printing using List Iterator*************");
		
		ListIterator<String> li = tvSeries.listIterator(tvSeries.size());
		
		while(li.hasPrevious()) {
			String show = li.previous();
			System.out.println(show);
		}
		

	}

}
