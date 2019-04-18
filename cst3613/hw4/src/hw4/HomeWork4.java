package hw4;

import java.util.*;

public class HomeWork4 {
	  public static void main(String[] args) {
		    PriorityQueue<String> queue1 = new PriorityQueue<>();
		    queue1.offer("George");
		    queue1.offer("Jim");
		    queue1.offer("John");
		    queue1.offer("Blake");
		    queue1.offer("Kevin");
		    queue1.offer("Michael");

		  
		    PriorityQueue<String> queue2 = new PriorityQueue<>(
		      5, Collections.reverseOrder());
		    queue2.offer("George");
		    queue2.offer("Katie");
		    queue2.offer("Kevin");
		    queue2.offer("Michelle");
		    queue2.offer("Ryan");
		    
		    PriorityQueue<String> union = new PriorityQueue<>(queue1);
	        PriorityQueue<String> tmp = new PriorityQueue<>(queue2);
	        
	        String s;
	        while ((s = tmp.poll()) != null) {
	            if (!union.contains(s)) {
	                union.add(s);
	            }
	        }
	        
	        System.out.println("Union set: " + union);

	        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
	        difference.removeAll(queue2);
	        System.out.println("Difference: " + difference);

	        PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
	        intersection.retainAll(queue2);
	        System.out.println("Intersection: " + intersection);

	    }
}
