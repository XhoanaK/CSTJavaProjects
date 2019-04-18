package edu.citytech.cst.driver;

import edu.citytech.cst.utility.HeavyCalculations;
import edu.citytech.cst.utility.ComplexBusiness;
import edu.citytech.cst.utility.EmailProcess;
import edu.citytech.cst.utility.MetaThread;

public class DriverExample {

	public static void main(String[] args) throws InterruptedException {
		
		
//		
//		MetaThread.pause(2000);
//		System.out.println("finished");
		
		HeavyCalculations h = new HeavyCalculations();
		ComplexBusiness h2 = new ComplexBusiness();
		EmailProcess e = new EmailProcess();
		e.setName("email");
		e.start();
		
		e.join();
		h.start();
		Thread t1 = new Thread(h2,"complex"); //the thread is looking for a runnable interface IT IS A RUNNABLE
		t1.start();
		//h.process(); instead of this do 
	
		System.out.println("I am finished");

	}

}
