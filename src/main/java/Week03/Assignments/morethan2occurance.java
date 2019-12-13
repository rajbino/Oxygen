package Week03.Assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class morethan2occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="Paypal India";
		name=name.replace(" ", "");
		name=name.toLowerCase();
		
		char[] charname=name.toCharArray();
		
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		
		for (int i=0; i<charname.length;i++)
		{
			if (map.containsKey(charname[i]))
			{
				map.put(charname[i],map.get(charname[i])+1);
			}
			else {
				map.put(charname[i], 1);
			}
		}
		
		for(Entry<Character,Integer> entryset:map.entrySet())
		{
			if(entryset.getValue()>=2)
			{
				System.out.println(entryset.getKey());
				break;
			}
		}

	}

}
