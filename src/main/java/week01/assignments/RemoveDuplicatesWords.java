package week01.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		//int count = 0;
		
		String[] array = text.split(" ");
		for (int i=0;i<array.length;i++)
		{
			
			//System.out.println(array[i]);
		for(int j=i+1;j<array.length;j++)
		{
			
			if (array[i].equals(array[j]))
			{
		     array[j]="";
			}
		}
		System.out.print(" "+array[i]+" ");
			
		}
		
		
		
		
		
		
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */

	}

}
