package project5;

import java.util.ArrayList;
import java.util.Arrays;

public class project5 {
//	public static void main(String[] args) {
//
//		 ArrayList<String> strings = new ArrayList<String>();
//		    strings.add("Switzerland");
//		    strings.add("Switzerland");
//		    strings.add("New Zealand");
//		    strings.add("Switzerland");
//		    strings.add("Amsterdam");
//
//
//		    System.out.println ("Arraylist with duplicate: "+ strings);
//		  
//
//        
//		    System.out.println("Arraylist with duplicate removed:");
//        strings = removeDuplicates(strings);
//        for (String s : strings) {
//        		System.out.println(s);
//	
//        } 
//    }
//
//    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
//
//        ArrayList<E> newList = new ArrayList<>(list.size());
//        for (E aList : list) {
//            if (!newList.contains(aList)) {
//                newList.add(aList);
//            }
//        }
//        return newList;
//    }
//}

	
	






	public static void main(String args[])

	 {

	 ArrayList <Integer>

	 list= new ArrayList<> (Arrays.asList ( 1,1,2,3,4,5,5,5,6));

	 

	 System.out.println("Arraylist with duplicates:" + list);

	 

	 ArrayList<Integer>

	  newlist= removeDuplicates(list);

	  

	  System.out.println ("Arraylist with duplicate removed:"+ newlist);

 	  }

	 



	

	

	

	

	public static <E> ArrayList <E> removeDuplicates(ArrayList<E>list)

	{

		ArrayList<E> newlist= new ArrayList<E>();

		for (E element:list) {

			

			if (!newlist.contains(element)) {

			  newlist.add(element);

		}

	}

     return newlist;

	}

}