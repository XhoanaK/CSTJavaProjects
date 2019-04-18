
public class reverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        String s = "ABCDE";
	        String revereseString = reverseString(s);
	        System.out.println( "The orignal String is: " +s + 
	        		"\nThe reversed String is: " +revereseString);
	    }

	    public static String reverseString(String s)
	    {
	        if (s.isEmpty())
	            return s;
	        	        return reverseString(s.substring(1)) + s.charAt(0);
	    }
	    
	}