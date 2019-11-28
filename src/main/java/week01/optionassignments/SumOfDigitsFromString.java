package week01.optionassignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// Declare a String text with the following value
				String text = "Tes12Le79af65";
				// Declare a int variable sum
				int sum = 0;
				// method01
				/*text= text.replaceAll("[^0-9]+","");				
				char[] array = text.toCharArray();
							
				for (int i=0; i<array.length; i++)
				{
					sum = sum + Character.getNumericValue(array[i]);
				}
				
				System.out.println("The sum of digits from string "+sum);*/
				
				//method02
				
				
				char[] array=text.toCharArray();
				for (int i=0; i<array.length; i++)
				{
					if (Character.isDigit(array[i]))
					{
						sum = sum + Character.getNumericValue(array[i]);
					}
				}
				System.out.println("The sum of digits from string "+sum);
	
				
				//build a logic to get sum of all the digits from the given string
				
				/*
				 * Method 1
				 * Pseudo Code
				 * a) using replaceAll(), replace all the non-digits into ""
				 * b) Now, convert the String into array
				 * c) Iterate over the array and get each character
				 * d) Using Character.getNumericValue(), Change the char into int
				 * e) Add the values to sum & print
				 * 
				 */
				
				/*
				 * Method 2
				 * Pseudo Code
				 * 
				 * a) Iterate an  array over the String
				 * b) Get each character and check if it is a number using Character.isDigit()
				 * c) Now covert char to int using Character.isDigit() and add it to sum
				 * d) Now Print the value
				 */

	}

}
