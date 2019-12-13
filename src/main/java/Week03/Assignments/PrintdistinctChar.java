package Week03.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintdistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Amazon India Private Limited";
		name= name.replace(" ", "");
		name= name.toLowerCase();
		char[] charname= name.toCharArray();
		
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0; i<charname.length;i++)
		{

			map.put(charname[i], 1);
			
		}
		
		//System.out.println(map);
		
		for(Entry<Character,Integer> entrySet:map.entrySet())
		{
			System.out.print(entrySet.getKey());
		}
		
		

	}

}
