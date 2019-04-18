package project7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSetExample {
	 public static void main(String[] args) {
		    // Create a hash set
		    Set<String> set = new HashSet<>();

		    // Add strings to the set
		    set.add("30");
		    set.add("35");
		    set.add("85");
		    set.add("75");
		    set.add("95");
		    set.add("91");
		    set.add("65");
		    set.add("72");
		    set.add("81");


		    TreeSet<String> treeSet = new TreeSet<>(set);
		    System.out.println("Sorted tree set: " + treeSet);

//		     Use the methods in SortedSet interface
		    System.out.println("first(): " + treeSet.first());//
		    System.out.println("last(): " + treeSet.last());
		    System.out.println("headSet(\"60\"): " + 
		      treeSet.headSet("60"));
		    System.out.println("tailSet(\"60\"): " + 
		      treeSet.tailSet("70"));

		    // Use the methods in NavigableSet interface
		    System.out.println("lower(\"P\"): " + treeSet.lower("p"));
		    System.out.println("higher(\"P\"): " + treeSet.higher("70"));//>
		    System.out.println("floor(\"P\"): " + treeSet.floor("P"));
		    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
		    System.out.println("pollFirst(): " + treeSet.pollFirst()); //poll removes items
		    System.out.println("pollLast(): " + treeSet.pollLast());
		    System.out.println("New tree set: " + treeSet);
		  }
		}
