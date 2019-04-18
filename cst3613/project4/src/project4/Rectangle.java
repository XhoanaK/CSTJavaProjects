package project4;

public class Rectangle extends GeometricObject implements Comparable <Rectangle> {
private double width;
private double height;

public Rectangle() {
}

public Rectangle(
  double width, double height) {
	if ( height<=0 || width <=0) {
		throw new IllegalArgumentException("Invalid width or height. Must be greater than  than zero");
	}else {
		this.width = width;
		this.height = height;
	}
}

public Rectangle(
  double width, double height, String color, boolean filled) {
this.width = width;
this.height = height;
setColor(color);
setFilled(filled);
}

/** Return width */
public double getWidth() {
return width;
}

/** Set a new width */
public void setWidth(double width) {
this.width = width;
}

/** Return height */
public double getHeight() {
return height;
}

/** Set a new height */
public void setHeight(double height) { // throw error 
this.height = height;
}
/** Return area */
public double getArea() {
	
return  width * height;

}

/** Return perimeter */
public double getPerimeter() {
return  2 * (width + height);

}


@Override
public int compareTo(Rectangle o) {
	// TODO Auto-generated method stub
	if (getArea() >o.getArea()) 
	return 1;
	else if (getArea() <o.getArea()) 
	return -1;
	else 
	return 0;
	}




}