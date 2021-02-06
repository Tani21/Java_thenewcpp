public class Main
{
	public static void main(String[] args) {
		int arr[][] = {{1},{2,3},{4,5,6},{7,8,9,10}};
		
		
		for( int[] x: arr)
		{
		    for( int b: x)
		    {
		        System.out.print(b+" ");
		    }
		    
		    System.out.println();
		}
		
	}
}
