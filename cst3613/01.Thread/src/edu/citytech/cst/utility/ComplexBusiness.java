package edu.citytech.cst.utility;


public class ComplexBusiness extends Object implements Runnable{ 
	//extends only one but can implement many interfaces
	//rightclick source->override-run
	//why are interfaces are important? 
	
	//there needs to be a standard and follow the standard the way it is.  
	
	public void run() {
		process(); //whatever will take a long time need to be overriden in run method
	}

	public void process() {
		
		for (int i = 0; i < 15; i++) {
			MetaThread.pause(1000);
			MetaThread.console(Thread.currentThread());
		}
	}
}
