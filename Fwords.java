package project;
import java.util.*;

public class FrequencyWord {

	public static void main(String[] args) {
		HashMap<String, Integer> wordfrequency = new HashMap<String,Integer>();
		int a= 0 ;
		
		String string="This is a string a that will a have the the this following features ";
		for(int i = 0; i<string.length(); i++)
		{
			String sb="";
			
			if(string.charAt(i)==' ')
			{
				sb = string.substring(a, i);
				if(wordfrequency.containsKey(sb))
				{
					int b = wordfrequency.get(sb);
					b = b+1;
					wordfrequency.replace(sb, b);  
				}
				
				else
				{
					wordfrequency.put(sb, 1);
				}
				a=i;

			}
		}
		System.out.println(wordfrequency);
	}
}

