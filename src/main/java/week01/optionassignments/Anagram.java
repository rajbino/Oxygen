package week01.optionassignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop ";
				//Declare another String
				String text2 = "pots";
				
				text1=text1.replace(" ","");
				text2=text2.replace(" ","");
				
				
				if (text1.length()==text2.length())
				{
					char[] chartext1 = text1.toCharArray();
					char[] chartext2 = text2.toCharArray();
					
					Arrays.sort(chartext1);
					Arrays.sort(chartext2);
										
					boolean result = Arrays.equals(chartext1,chartext2);
					System.out.println(result);
					if (result==true)
					{
						System.out.println("It is a anagram");
					}
					else {
						System.out.println("It is not a anagram");
					}
					
					
				}
				else {
					System.out.println("It is not a anagram");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */

	}

}
