package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		 
		String text1 = "stops";
		String text2 = "potss";
        
		int text1length = text1.length();
		int text2length = text2.length();
		{
		
		if (text1length==text2length) {
			char [] text11 = text1.toCharArray();
		    char [] text12 = text2.toCharArray();
		    
		    Arrays.sort(text11);
		    Arrays.sort(text12);
		    System.out.println(text11);
		    System.out.println(text12);
		
		    if (Arrays.equals(text11, text12))
		   {
			   System.out.println("the given string is an Anagram");
		   }
		
		}
				else {
				System.out.println("The given string is not an Anagram");
		}
		}
	}
}





