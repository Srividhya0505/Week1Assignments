package week1.day2;

public class CharOccurrence {

		// Check number of occurrences of a char (eg 'e') in a String
		
	    	// declare and initialize a variable count to store the number of occurrences
			
			// convert the string into char array
				
			//get the length of the array
				
			// traverse from 0 till the array length 
				
				// Check the char array has the particular char in it 
			
				// if is has increment the count
					 
				
				// print the count out of the loop
			
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int i = 0;
		char charray [] = str.toCharArray();
		//int j = charray.length;
     for (int j = 0; j <charray.length; j++) {
		if (str.charAt(j) == 'e'){
				i++;
		}
		}
	System.out.println("No of occurrences of letter e is   " + i);
	}
	}


