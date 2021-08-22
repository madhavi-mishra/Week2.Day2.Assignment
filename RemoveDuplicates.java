package week2Day2Assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("The original word----" + text);
		String[] ch = text.split(" ");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != null) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i].equalsIgnoreCase(ch[j])) {
						ch[j] = null;
					}
				}
			}

		}
		// Displaying the String without the duplicate words
		for (int k = 0; k < ch.length; k++) 
		{
			if (ch[k] != null) {
				System.out.print(ch[k] + " ");
			}

		}
	}
	
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

}
