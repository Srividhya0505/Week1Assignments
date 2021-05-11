package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	    String str ="madam";
	    String rev = "";
	  
	   for (int i=str.length()-1; i>=0; i--) {
		     rev = rev + str.charAt(i); 
	}
	   	   System.out.println(rev);
	   	   
	      if (str.equalsIgnoreCase(rev))
	    		  {
	    		  System.out.println("Given string is palindrome");
	      }
	    
		

	}

}
