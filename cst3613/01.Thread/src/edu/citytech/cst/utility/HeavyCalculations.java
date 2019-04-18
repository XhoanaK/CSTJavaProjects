package edu.citytech.cst.utility;


public class HeavyCalculations extends Thread{

	//rightclick source->override-run
	
	@Override 
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
