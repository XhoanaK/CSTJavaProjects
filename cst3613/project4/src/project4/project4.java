package project4;

import java.util.Arrays;

public class project4 {
	public static void main(String[] args) {
	try {
        Circle[] circles = {
                new Circle(0),
                new Circle(-9),
                new Circle(36),
                new Circle(6),

        };
        project4.<Circle>sort(circles);
    	project4.<Circle>printList(circles);
    	
        Arrays.sort(circles);
        System.out.println("before sorting");
        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i].getRadius());
   
        }
        

        Circle clone = (Circle) circles[2].clone();
        System.out.println("Radius of cloned circle is: " + clone.getArea()+"\n");
    } catch (IllegalArgumentException e){
        System.out.println(e);
        System.out.println("Please try again. The radius cannot be less than zero. ");
    
    }
	
	try {
	Rectangle [] rectangles = {
		      new Rectangle(-9,6), 
		      new Rectangle(13.2,14),
		      new Rectangle (1.5,16),
		      new Rectangle(13.22,4)
		      };
	
		
			
				 project4.<Rectangle>sort(rectangles);
				 project4.<Rectangle>printList(rectangles);
		
	  Arrays.sort(rectangles);
	  System.out.println("Sorted rectangles area are");

	  for (int i = 0; i< rectangles.length; i++) {
		  System.out.println(rectangles[i].getArea());}
	 
	}catch(IllegalArgumentException e){
      System.out.println(e);
      System.out.println("Please try again. The radius cannot be less than zero. ");
	}
	
	}
	

	//to compare both objects
	
//	Rectangle rectangle = new Rectangle(9, 12);
//    Circle circle = new Circle(3);
//
//    System.out.println("\nSame area? " +
//      equalArea(rectangle, circle));
//	
//	
//	public static <E extends GeometricObject> 
//			boolean equalArea(
//		      E object1, E object2) {
//		    return object1.getArea() == object2.getArea();
//		  }
	
 

	public static <E extends Comparable<E>> void sort(E[] list) { // stand for genetic type, work for any type of obbject that is comperable
	    E currentMin;
	    int currentMinIndex; //<E extends Comparable<E>> bounded generic type

	    for (int i = 0; i < list.length - 1; i++) {
	      // Find the minimum in the list[i..list.length-1]
	      currentMin = list[i];
	      currentMinIndex = i;

	      
	   
	    	  
	      for (int j = i + 1; j < list.length; j++) {
	        if (currentMin.compareTo(list[j]) > 0) {
	          currentMin = list[j];
	          currentMinIndex = j;
	        }
	      }

	      // Swap list[i] with list[currentMinIndex] if necessary;
	      if (currentMinIndex != i) {
	        list[currentMinIndex] = list[i];
	        list[i] = currentMin;
	      }
	    }
	  }

	
	  /** Print an array of objects */
	  public static void printList(Object[] list) {
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	    System.out.println();
	  }
	

	  
	  
	}
		

