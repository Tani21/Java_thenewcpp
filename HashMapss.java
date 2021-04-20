package project;
import java.util.*;

public class HashMapss {

	public static void main(String[] args) {
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Tanishka", 19);
		hm.put("Mayank", 20);
		hm.put("Rajul", 21);
		System.out.println("Printing all keys\n");
		for(String i : hm.keySet())
		{
			System.out.println(i);
		}
		System.out.println("Printing all values\n");
		for(Integer i: hm.values())
		{
			System.out.println(i);
		}
		
		System.out.println(hm.get("Rajul"));
		if(hm.containsKey("Tanishka"))
		{
			System.out.println("value for this key is "+hm.get("Tanishka"));
		}
		if(hm.containsValue(20))
		{
			System.out.println("the key for this value is Mayank");
		}
		

	}

}

