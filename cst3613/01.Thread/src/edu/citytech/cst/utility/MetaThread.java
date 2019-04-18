package edu.citytech.cst.utility;

public class MetaThread {
	
	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void pause() {
		long millis= 1000;
		pause(millis);
		
	}




	public static void console(Thread currentThread) {
		String message ="name: %s1, priority %s2";
//		message = String.format(message, currentThread.getName());
		message= message.replace("%s1", currentThread.getName() );
		message =message.replace("%s2", currentThread.getPriority()+"" );
		System.out.println(message);

	}




	public static void console(String string, Thread currentThread) {
		String message ="name: %s1, priority %s2";
//		message = String.format(message, currentThread.getName());
		message= message.replace("%s1", currentThread.getName() );
		message =message.replace("%s2", currentThread.getPriority()+"" );
		System.out.println(string + " " +message);
	}
}
