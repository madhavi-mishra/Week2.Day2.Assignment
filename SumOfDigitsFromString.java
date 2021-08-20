package week2Day2Assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tes12Le79af65";
		int sum = 0;
		String str1 =  str.replaceAll("\\D", "");
		char ch[] = str1.toCharArray();
		
		for(int i=0;i<ch.length; i++) {
			sum =sum+ Character.getNumericValue(ch[i]);			
		}
		System.out.println(sum);
	}

}

/*
 * Method 1
 * Pseudo Code
 
 * Declare a String text with the following value
	String text = "Tes12Le79af65";
   Declare a int variable sum
	int sum = 0;
 * a) using replaceAll(), replace all the non-digits into ""
 * b) Now, convert the String into array
 * c) Iterate over the array and get each character
 * d) Using Character.getNumericValue(), Change the char into int
 * e) Add the values to sum & print
 * 
 */