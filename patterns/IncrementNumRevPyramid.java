public class IncrementNumRevPyramid
{
	public static void main(String[] args) {
		System.out.println("Creating patterns");
		int k=1;
		int arr[][] = new int[5][];
		for(int i=5; i>=0; i--)
		{
		    
		    for(int j=i; j>=0; j--)
		    {
		        System.out.print(k+" ");
		        k++;
		    }
		    System.out.println();
		}
	}
}
