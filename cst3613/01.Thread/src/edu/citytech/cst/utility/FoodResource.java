package edu.citytech.cst.utility;

import java.util.ArrayList;

public class FoodResource extends Thread {
	
	
	//static there will be one version of the list in the memory 
	static ArrayList list = new ArrayList();
	
	static {
		for (int i = 0; i < 30; i++) {
			list.add("food"+1);
			
			
		}
	}
	public void run() {
		remove();
	}
		private  synchronized void remove() {
			for (int i = 0; i < 9; i++) {
				if (list.size()== 0) {
					System.out.println("No More Food!");
					return;
				}
				list.remove(0);
				int size = list.size();
				MetaThread.console("size: " +size,Thread.currentThread());
			}
		

	}
}
	
