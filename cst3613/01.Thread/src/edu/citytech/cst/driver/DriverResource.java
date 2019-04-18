package edu.citytech.cst.driver;

import edu.citytech.cst.utility.FoodResource;

public class DriverResource {
	public static void main(String[] args) {
		FoodResource f1 = new FoodResource();
		FoodResource f2 = new FoodResource();
		FoodResource f3 = new FoodResource();
		FoodResource f4 = new FoodResource();
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();
	}
	
}
