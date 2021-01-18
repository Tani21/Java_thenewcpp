public class PrimeNumber
{
	public static void main(String[] args) {
	    
	    for(int j=2; j<=1000; j++)
	    {
	int number = j;
	
	int half=number/2;
	int flag=0;
	
	for(int i=2; i<=half; i++)
	{
	    if(number%i==0)
	    {
	        flag=flag+1;
	    }
	}
	
	if(flag==0)
	{
	    System.out.print(number+" ");
	}
	    }
	
	}
}

