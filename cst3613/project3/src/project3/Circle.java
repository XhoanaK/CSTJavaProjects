package project3;

public class Circle extends GeometricObject 
implements Cloneable, Comparable <Circle> {
private double radius;

public Circle(){

}

public Circle(double radius)  {
	if ( radius < 0){
  		throw new  IllegalArgumentException( "ERROR: Radius is less than 0." );
	} else {
		this.radius = radius;
	}
	numberOfObjects++;
}

/** Return radius */
public double getRadius() {
return radius;

}
/** Set a new radius */
public void setRadius(double radius) {
  	// if Radius is greater than 0 getRadius, if not throw error ***
  	if ( radius < 0 ){
  		throw new  IllegalArgumentException("ERROR: Radius is less than 0.");
	} else {
  		this.radius = radius;
  	}
  }

private static int numberOfObjects = 0;
public static int getNumberOfObjects() {
return numberOfObjects;
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
public String toString() {
return super.toString() + " and the radius is " + radius;
}

@Override
public int compareTo(Circle o) {
// TODO Auto-generated method stub
if (getRadius() >o.getRadius()) 
return 1;
else if (getRadius() <o.getRadius()) 
return -1;
else 
return 0;
}

@Override
public Object clone() {
Object o = null;
try {
o = super.clone();        
} catch (CloneNotSupportedException ex) {
ex.printStackTrace();
}
return o;  
}
/*
public Circle clone() {
Circle o = new Circle();
try {
o.setRadius(this.getRadius()); 
} catch (CloneNotSupportedException ex) {
ex.printStackTrace();
}
return o;  
}
*/  


}
