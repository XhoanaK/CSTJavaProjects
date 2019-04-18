package project2;

public class Project2 {
	public static void main(String[] args) {
		
		Circle1 [] circles = {
			      new Circle1(3), 
			      new Circle1(13.24),
			      new Circle1 (1.5),
			      new Circle1(13.22)
			      };
			    java.util.Arrays.sort(circles);
			    for (Circle1 circle: circles) {
			      System.out.print(circle + " "); 
			      System.out.println();

			   
			    }
			    Circle1 circle = new Circle1(4);
			    Circle1 circle1 = circle;
			    Circle1 circle2 = (Circle1) circle.clone(); 
			  // need to cast (Circle) the clone method is in super class object
			    // the parent are object and the pc needs to know which object address you want to pass the geometric or circle
			    System.out.println( "Original circle " +circle);
			    System.out.println("Clone circle " +circle2);
			    System.out.println("circle == circle1 is " +
			    		 (circle == circle1));
			    System.out.println("circle == circle2 is " +
			    		 (circle == circle2));
			    		 System.out.println("circle.equals(circle2)) is " + circle1.equals(circle2));
			    
			    
			  }
			}
