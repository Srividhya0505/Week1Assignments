package week1.day2;

public class SumOfDigitsFromString {
	
			 
	public static void main(String[] args) {
		String text1 = "Tes12Le79af65";
		  int sum = 0;
		  char [] convertstringtoarray = text1.toCharArray();
			  for (int i = 0; i < convertstringtoarray.length; i++) {
					 if(Character.isDigit(convertstringtoarray[i])) {
					 int totalchar = Character.getNumericValue(convertstringtoarray[i]);
					   sum = sum+totalchar;
				
			  }	 
			 }
			 
		           
			  System.out.println("SumofDigitsFromString Tes12Le79af65    ="+ sum);
			  
	}
}
