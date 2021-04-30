package labfile;

public class PrintTable {
	
	static void printtable(int a)
	{
		for(int i=1; i<11; i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
		
	}
	public static void main(String args[])
	{
		printtable(10);
		System.out.println();
		printtable(2);
		
	}

}
