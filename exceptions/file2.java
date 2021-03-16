public class Main
{
	public static void main(String[] args) {
		int a=50;
		int b=0;
		int arr[] = new int [10];
		try
		{
		    try
		    {
		        arr[10]=10;
		    }
		    
		    catch(ArrayIndexOutOfBoundsException ex)
		    {
		        System.out.println(ex);
		    }
		    double c = a/b;
		}
		
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
