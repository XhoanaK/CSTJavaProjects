package project2;


public class Circle1 extends GeometricObject implements Cloneable, 
Comparable<Circle1>{ // <circle> it means its comperable between circle objects 
	// the order doesn't matter, cloneable can go first or later 
	
	  private double radius;

	  public Circle1() {
	  }

	  public Circle1(double radius) {
	    this.radius = radius;
	  }

	  /** Return radius */
	  public double getRadius() {
	    return radius;
	  }

	  /** Set a new radius */
	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  @Override /** Return area */
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }

	  /** Return diameter */
	  public double getDiameter() {
	    return 2 * radius;
	  }

	  @Override /** Return perimeter */
	  public double getPerimeter() {
		    return 2 * radius * Math.PI;
		  }

	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
	 @Override 
	
	  public Object clone() { // return object if you use Circle you use super class circle and it has not implemented clone
		 // object is okay bc object is parent of all classes which is parent of super 
		 // clone it copies all the data  if u want to copy all the records use super.clone 
	        Object o = null;
	        try {
	            o = super.clone();
	        } catch (CloneNotSupportedException ex) {
	            ex.printStackTrace();
	        }
	        return o;
	        //if u want to copy just one then use this 
	        //sometimes u can't use super.clone when an object is specific and some data u don't want to copy
	        // if u have xyz and when u clone u want to make z different 
	   
//	        	public circle clone() {
	   		 // clone it copies all the data 
//	   	        circle o = null;
//	   	        try {
//	   	            o = super.clone();
//	   	        } catch (CloneNotSupportedException ex) {
//	   	            ex.printStackTrace();
//	   	        }
//	   	        return o;
//	    
	  }
	  

	@Override
	public int compareTo(Circle1 o) {
		if (getRadius() < o.getRadius())
		return -1;
		else if (getRadius()>o.getRadius())
			return 1;
		else return 0;
	}
	
	
	public int sumofN (int n) {
		if (n==0) //base case
			return 0;
		else //recursive step
			return sumofN (n-1)+n;
	}

	@Override 
	  public String toString() {
	    return "Radius: " +radius	;  // return super.toString
	    }
	}
	