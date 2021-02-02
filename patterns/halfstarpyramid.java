public class halfstarpyramid
{
	public static void main(String[] args) {
		System.out.println("Creating patterns");
		int arr[][] = new int[5][];
		for(int i=0; i<5; i++)
		{
		    for(int j=0; j<i+1; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
