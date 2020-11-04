package TreeSetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;


//TreeSet is a set where elements are sorted where as Hashset doesnot Sort the elements
//TreeSet stores the elements in a ordered way but HashSet doesn't store the elements in the ordered manner.
public class TreeSetDemo {

	public static void main(String[] args) {
		int[] numbers = {23,7,8,9,56,1,2,10};		
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		try {
		int length = numbers.length;
		System.out.println("Size of the array : "+length);
		
		for(int i=0;i<length;i++) {
			numberSet.add(numbers[i]);
		}

		
		System.out.println("hash Set Elemnts :"+numberSet);
		
		TreeSet<Integer> treeSetNumber = new TreeSet<Integer>(numberSet);
		
		System.out.println("Tree Se elements sorted way: "+treeSetNumber);
		
		System.out.println("First element of the treeSet: "+treeSetNumber.first());
		
		System.out.println("Last element of the treeSet: "+treeSetNumber.last());
		
		//Reverse order of the treeSet:
		
		Iterator<Integer> li = treeSetNumber.descendingIterator();
		
		while(li.hasNext()) {
			int num = li.next();
			System.out.println(num);
		}
		
		System.out.println("Cloning the element");
		TreeSet<Integer> set2 = (TreeSet)treeSetNumber.clone();
		System.out.println(set2);
		System.out.println("Size of the cloned Set: "+set2.size());
		
		System.out.println("Comparing two Tree Sets:");
		TreeSet<Integer> treeSetNumber1 = new TreeSet<Integer>();
		treeSetNumber1.add(1);
		treeSetNumber1.add(2);
		treeSetNumber1.add(7);
		treeSetNumber1.add(9);
		TreeSet<Integer> treeSetNumber2 = new TreeSet<Integer>();
		treeSetNumber2.add(7);
		treeSetNumber2.add(9);
		treeSetNumber2.add(0);
		treeSetNumber2.add(1);
		System.out.println("Set1: "+treeSetNumber1);
		System.out.println("Set2:" + treeSetNumber2);
		List<String> treeSetNumber3 = new ArrayList<String>();
		for(int num : treeSetNumber1) {
			if(treeSetNumber2.contains(num)) {
				treeSetNumber3.add("Yes");
			}
			else {
				treeSetNumber3.add("No");
			}
		}
		System.out.println(treeSetNumber3);
		
		System.out.println("find the numbers less than 7 in a tree set");
		TreeSet<Integer> ts = new TreeSet<Integer>(treeSetNumber1.headSet(7));
		System.out.println(ts);

		System.out.println("get the element in a tree set which is greater than or equal to the given element");
		System.out.println(treeSetNumber1.ceiling(8));
		System.out.println("get the element in a tree set which is less than or equal to the given element");
		System.out.println(treeSetNumber1.floor(2));
		System.out.println("Strictly greater than the given element 4");
		System.out.println(treeSetNumber1.higher(4));
		System.out.println("Strictly lower than the given element 4");
		System.out.println(treeSetNumber1.lower(4));
		
		System.out.println(treeSetNumber2);
		System.out.println("retrieve and remove the first element of a tree set");
		System.out.println(treeSetNumber2.pollFirst());
		System.out.println("retrieve and remove the last element of a tree set");
		System.out.println(treeSetNumber2.pollLast());
		System.out.println(treeSetNumber2);
		
		System.out.println("remove a given element from a tree set");
		System.out.println(treeSetNumber2.remove(1));
		System.out.println(treeSetNumber2);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Hello");
		}

	}

}
