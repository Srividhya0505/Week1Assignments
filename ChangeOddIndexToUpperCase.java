package week1.day2;

public class ChangeOddIndexToUpperCase {

	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	
	public static void main(String[] args) {
		
		String test = "changeme";
		String newstring = "";
		//System.out.println(test.toUpperCase());
		char chars[] = test.toCharArray(); 
		  		   
	 for (int i=0; i < chars.length; i++) {
		 if (i%2 !=0)
		 {
		     chars[i] = Character.toUpperCase(chars[i]);
			 }
	 }
		    newstring = String.valueOf(chars);
		    System.out.println(chars);
		   
		     }
	
	}


//System.out.println();
		
	




