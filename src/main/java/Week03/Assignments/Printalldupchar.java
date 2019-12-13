package Week03.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Printalldupchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Infosys Limited";
		name=name.replace(" ", "");
		name=name.toLowerCase();
		
		char[] charname = name.toCharArray();
		
		Map<Character,Integer> map= new LinkedHashMap<>();
		
		for(int i=0; i<charname.length; i++ )
		{
			
			if (map.containsKey(charname[i]))
			{
				map.put(charname[i], map.get(charname[i])+1);
			}
			else
			{
				map.put(charname[i], 1);
			}
			
		}
		
		for (Entry<Character,Integer> entrySet: map.entrySet())
		{
			if (entrySet.getValue()>1)
			{
				System.out.print(" "+entrySet.getKey()+" ");
			}
		}
		
		
		

	}

}
