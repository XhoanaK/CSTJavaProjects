package hmw3;

import java.util.ArrayList;

import java.util.List;


public class TestList {
	public static void main(String args[]) {


	    //initializing list 1
	    List<String> list1 = new ArrayList<>();
	    list1.add("red");
	    list1.add("yellow");
	    list1.add("green");
	    
	    //initializing list 2
	    List<String> list2 = new ArrayList<>();
	    list2.add("red");
	    list2.add("yellow");
	    list2.add("blue");
	    
	    
//part a
	    list1.addAll(list2);
	    System.out.println("After calling list1.addAll(list2)");
	    System.out.println("List 1 : " + "" + list1);
	    System.out.println("List 2 : " + "" + list2+ "\n");

 //part b
	    list1.add(list2+"");
	    System.out.println("After calling list1.add(list2)");
	    System.out.println("List 1 : " + "" + list1);
	    System.out.println("List 2 : " + "" + list2+ "\n");
	    
 //part c
	    list1.removeAll(list2);
	    System.out.println("After calling list1.removeAll(list2)");
	    System.out.println("List 1 : " + "" + list1);
	    System.out.println("List 2 : " + "" + list2+ "\n");
	    
 //part d
	    list1.remove(list2);
	    System.out.println("After calling list1.remove(list2)");
	    System.out.println("List 1 : " + "" + list1);
	    System.out.println("List 2 : " + "" + list2+ "\n");
	    
//part e
	    list1.retainAll(list2);
	    System.out.println("After calling list1.retainAll(list2)");
	    System.out.println("List 1 : " + "" + list1);
	    System.out.println("List 2 : " + "" + list2 + "\n");
	    
//part f
	    list1.clear();
	    System.out.println("After calling list1.clear()");
	    System.out.println(list1);
	    
  }
}    	