package week01.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		String[] array=test.split(" ",0);
		for (int i=0; i<array.length;i++)
		{
			if (i%2==1)
			{
				char[] 	chararray = array[i].toCharArray();				
				
				for (int j=0; j<chararray.length/2; j++)
				{
					char temp =chararray[chararray.length-1-j];
					chararray[chararray.length-1-j]=chararray[j];
					chararray[j]=temp;	
				}
				
			System.out.print(chararray);
			}
			else {
				System.out.print(" "+array[i]+" ");
			}

		}
		
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		
		

	}

}
