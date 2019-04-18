package project3;

import java.util.Arrays;

public class project3 {

		
	public static void main(String[] args) {

		 // Catch any error with the circles ***
			try {
	            Circle[] circles = {
	                    new Circle(0),
	                    new Circle(9),
	                    new Circle(-36),

	            };

	            Arrays.sort(circles);
	            System.out.println("Sorting circles radius are");
	            for (int i = 0; i < circles.length; i++) {
	                System.out.println(circles[i].getRadius());
	            }

	            Circle clone = (Circle) circles[2].clone();
	            System.out.println("Radius of cloned circle is: " + clone.getRadius());

	        } catch (IllegalArgumentException e){
	            System.out.println(e);
	            System.out.println("Please try again. The radius cannot be less than zero. ");
	        }
			System.out.println("\nNumber of objects created: " +
		    	      Circle.getNumberOfObjects());
	    }

	}