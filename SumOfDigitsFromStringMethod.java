package week1.day2;

public class SumOfDigitsFromStringMethod {
	
			
	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String text2 = text.replaceAll("[^0-9]", "");
		System.out.println(text2);
		
		char[] convertstrngtoarray = text2.toCharArray();
		
		for (int i = 0; i < convertstrngtoarray.length; i++) {
			        char geteachchar = text2.charAt(i);
			  int stringvalue = Character.getNumericValue(geteachchar);
			   sum =  sum+stringvalue;
		}
			
			System.out.println(sum);
	}
}

		


