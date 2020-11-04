package ArrayListConcept;

import java.util.*;

public class ArrayListPractice {

	public static <E> void main(String[] args) {

//		  ArrayList<String> colours = new ArrayList<String>();
//		  colours.add("Green");
//		  colours.add("Red");
//		  colours.add("blue");
//		  
//		/*  for(int i=0;i<colours.size();i++){
//		    System.out.println(colours.get(i));
//		  }*/
//		  
//		 /* for(String element:colours){
//		    System.out.println(element);
//		  }*/
//		  
//		  //to insert the element in the first postion
//		  colours.add(0,"Orange");
//		    for(String element:colours){
//		    System.out.println(element);
//		  }
//		  
//		  //retrieve a element at index 3
//		  System.out.println("Colour at index 3 is :"+colours.get(3));
//		  
//		  //Update the value with the given value
//		  colours.set(2,"Yellow");
//		  
//		  System.out.println("updating red to yellow");
//		  
//		  for(String element: colours){
//		    System.out.println(element);
//		  }
//		  
//		  System.out.println("Remove third element from arraylist");
//		  
//		  colours.remove(2);
//		  
//		  for(String element: colours){
//		    System.out.println(element);
//		  }
//		  
//		  System.out.println("ArrayList Sorting using collections");
//		  
//		  Collections.sort(colours);
//		  
//		  for(String element: colours){
//		    System.out.println(element);
//		  }
//		  
//		  //copy one arraylist into another
//		  ArrayList<String> names = new ArrayList<String>();
//		  
//		  names.add("Tom");
//		  names.add("Peter");
//		  
//		  ArrayList<String> dept_names = new ArrayList<String>();
//		  dept_names.add("QA");
//		  dept_names.add("Selenium");
//
//		System.out.println("before copying");
//
//		 for(String element:names){
//		    System.out.println(element);
//		  }
//		  
//		  
//		  Collections.copy(names,dept_names);
//		  
//		  System.out.println("After copying");
//		  
//		  for(String element:names){
//		    System.out.println(element);
//		  }
//		  
//		  ArrayList<String> names1 = new ArrayList<String>();
//		  names1.add("QA");
//		  names1.add("Selenium");
//		  names1.add("Tom");
//		  names1.add("peter");
//		  names1.add("ddd");
//		  System.out.println("Before shuffling the list");
//		  
//		  for(String element:names1){
//		    System.out.println(element);
//		  }
//		  
//		  
//		  System.out.println("shuffling the list");
//		  
//		  Collections.shuffle(names1);
//		  
//		 
//		  
//		  
//		  for(String element:names1){
//		    System.out.println(element);
//		  }
//		  
//		   System.out.println("Before Reversing the list");
//		  
//		  for(String element:names1){
//		    System.out.println(element);
//		  }
//		  
//		  System.out.println("Reversing the list");
//		  
//		   Collections.reverse(names1);
//		  
//		   
//		  for(String element:names1){
//		    System.out.println(element);
//		  }
//		  
//		  System.out.println("Extracting portion the Arraylist");
//		  
//		  List<String> sub_list = names1.subList(0,3);
//		  
//		  for(String element:sub_list){
//		    System.out.println(element);
//		  }
//		  
//		 System.out.println("Compare two arraylist");
//		 
//		 ArrayList<String> listCompare1= new ArrayList<String>();
//		 
//		 listCompare1.add("Red");
//		 listCompare1.add("Orange");
//		 listCompare1.add("white");
//		 listCompare1.add("pink");
//		 listCompare1.add("black");
//		 
//		 ArrayList<String> listCompare2 = new ArrayList<String>();
//		 listCompare2.add("Red");
//		 listCompare2.add("Orange");
//		 listCompare2.add("pink");
//		 listCompare2.add("white");
//		 
//		 ArrayList<String> listCompareResult = new ArrayList<String>();
//		 
//		 for(String list : listCompare1){
//		   
//		   if(listCompare2.contains(list)){
//		     listCompareResult.add("Yes");
//		   }
//		   else
//		   {
//		     listCompareResult.add("No");
//		   }
//		   
//		 }
//		 
//		 for(String namesresult : listCompareResult){
//		   
//		   System.out.println(namesresult);
//		 }
//		 
//		 System.out.println("Before Swapping");
//		 
//		 for(String list1: listCompare1){
//		   System.out.println(list1);
//		 }
//		 
//		  System.out.println("Swap two elements black and pink");
//		  
//		  Collections.swap(listCompare1,3,4);
//		  
//		  
//		   for(String list1: listCompare1){
//		   System.out.println(list1);
//		 }
//		 
//		 System.out.println("join 2 araylists");
//		 
//		 ArrayList<String> joinArrayLists = new ArrayList<String>();
//		 
//		 joinArrayLists.addAll(listCompare1);
//		 joinArrayLists.addAll(listCompare2);
//		 
//		 
//		 for(String list:joinArrayLists){
//		   System.out.println(list);
//		 }
//		 
//		  System.out.println("Cloning araylist");
//		   ArrayList<String> cloneArraylist = (ArrayList<String>)joinArrayLists.clone();
//
//		   for(String list:cloneArraylist){
//		   System.out.println(list);
//		 }
//		  
//		System.out.println("Empty an arraylist");
//		cloneArraylist.removeAll(cloneArraylist);
//		   for(String list:cloneArraylist){
//		   System.out.println(list);
//		 }
//		if(cloneArraylist.isEmpty() == true){
//		  System.out.println("list is empty");
//		}
//
//		System.out.println("Trimming the ArrayList to its size");
//
//		listCompare1.trimToSize();
//		
//		System.out.println("The size of the list is: "+listCompare1.size());
//		listCompare1.add("tree");
//		
//		System.out.println("The size of the list is: "+listCompare1.size());
//
//	System.out.println("Incerease the capacity of the list");
//	ArrayList<String> incereaseSizeList = new ArrayList<String>();
//	incereaseSizeList.add("Red");
//	incereaseSizeList.add("white");
//	
//	incereaseSizeList.ensureCapacity(5); //minimum cpacity is 5
//	incereaseSizeList.add("Blue");
//	incereaseSizeList.add("Blue");
//	incereaseSizeList.add("Blue");
//	
//	System.out.println(incereaseSizeList.size());
//	
//	
//	
//	ArrayList<String> color_names= new ArrayList<String>();
//	color_names.add("Black");
//	color_names.add("white");
//	color_names.add("Orange");
//	
//	for(String element : color_names) {
//		System.out.println(element);
//	}
//	System.out.println("Program to replace the second element of a ArrayList with the specified element");
//	color_names.set(1, "Blue");
//	
//	for(String element : color_names) {
//		System.out.println(element);
//	}
//	
//	System.out.println("To print all the elements of the ArrayList using the position of the elements");
//	for(int i=0;i<color_names.size();i++) {
//	System.out.println("The colour of "+(i+1)+ " position is: " + color_names.get(i));
//	}
	
		//Dulicate elements list
	ArrayList<String> movies = new ArrayList<String>();
	
	movies.add("Thrones");
	movies.add("LoveAajKal");
	movies.add("LoveAajKal");
	movies.add("Thrones");
	movies.add("raja");
	movies.add("Mardani");
	
	Collections.addAll(movies);

	System.out.println(movies);
	
	Set<String> duplicateList = new HashSet<String>();
	Set<String> resultSet = new HashSet<String>();
	
	
	for(String name :movies ) {
		if(!duplicateList.add(name)) {
			resultSet.add(name);
		}
	}
	
	System.out.println("Duplicate movies list:" + resultSet);
	
	//code to sort the list of strings using Java collection
	String[] str1 = {"Archana" , "Panigrahi" , "Gandhiji" , "Umbrella" ,"Tea" ,"Assam"};
	
	
	
	
	
}

		  

		  
	}
