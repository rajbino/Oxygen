package day6.classroom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCharOccurence {
	
	
	
	public static void main(String[] args)
	{
		String name="Rajaram";
		char[] namechar= name.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i=0; i<namechar.length; i++)
		{
			//map.put(namechar[i],1);
			
			
			if(map.containsKey(namechar[i]))
			{
				map.put(namechar[i], map.get(namechar[i])+1);
			}
			else {
				
				map.put(namechar[i], 1);
				
			}
				
		}
		System.out.println(map);
	}
	
	
	

}
