package project2;

public class hw1 {
	public static void main(String[] args) {
		System.out.print( exp(3,5));
		
	}
	public static int exp(int x, int m) {
		if(m == 0) {
	        return 1;
	    } else {
	        return x * exp(x, m - 1);
	    }
	}
}
		
		
		
		
