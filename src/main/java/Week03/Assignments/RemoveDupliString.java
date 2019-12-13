package Week03.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class RemoveDupliString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Paypal India";
		name = name.toLowerCase();
		name=name.replace(" ", "");
		char[] namchar= name.toCharArray();
	    
		Map <Character,Integer> map= new LinkedHashMap<>();
		
		for(int i=0; i<namchar.length;i++)
		{
			if (map.containsKey(namchar[i]))
					{
				map.put(namchar[i],map.get(namchar[i])+1);
				
				
					}
			else {
				map.put(namchar[i], 1);
			}
			
		}
		
		
		for (Entry<Character,Integer> eachEntry:map.entrySet())
		{
			if(eachEntry.getValue()>1)
			{
			
				map.remove(eachEntry);
			}
			
			else {
				 System.out.print(eachEntry.getKey());
			}
		}
		
		
		
		 
	
		
	}

}
