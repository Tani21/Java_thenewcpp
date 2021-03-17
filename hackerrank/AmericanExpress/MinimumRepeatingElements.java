import java.util.*;

public class Frequency
{

	public static void main(String[] args) {
		int length = 13;
		int sub = 8;
		int arr[] = {1,4,2,9,2,9,2,8,2,9,7,7,3};
		int temp;
		
		Arrays.sort(arr);
		
		Map <Integer, Integer> map = new HashMap<Integer, Integer> ();
		
		for(int i=0; i<length; i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 1);
			}
			
			else
			{
				temp = map.get(arr[i]);
				temp=temp+1;
				map.put(arr[i], temp);
			}
		}
		
		System.out.println("The frequency is: "+map.entrySet());
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys)
		{
			System.out.println("Key: "+key+"Value: "+map.get(key));
		}
		
		Set<Integer> keySet = map.keySet(); 
		  
        Collection<Integer> values = map.values(); 
  
        ArrayList<Integer> listOfValues 
            = new ArrayList<Integer>(values); 
  
        System.out.println("The Values of the Map are "
                           + listOfValues); 
        
        Collections.sort(listOfValues, Collections.reverseOrder()); 
        
        System.out.println(listOfValues);
        int i=0;
        int count=0;
        
        while(sub>=0)
        {
        	if(sub>listOfValues.get(i))
        	{
        		sub=sub-listOfValues.get(i);
        		count=count+1;
        		System.out.println("sub in if: "+sub+" count: "+count);
        	}
        	
        	else
        	{
        		count=count+1;
        		System.out.println(" count: "+count);
        		break;
        	}	
        	i=i+1;
        }
        
        System.out.println(count);  
	}
}

