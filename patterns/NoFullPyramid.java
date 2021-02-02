import java.util.*;

public class NoFullPyramid
{
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner object = new Scanner(System.in);
		int rows = object.nextInt();
		int row=1;
		int spaces=rows;
		int number=0;
		for(int i=0; i<rows; i++)
		{
		    for(int space=0; space<spaces-1; space++)
		    {
		        System.out.print("  ");
		    }
		    
		    for(int j=0; j<2*row-1; j++)
		    {
		         number++;
		         System.out.print(number+" ");
		         
		    }
		    row=row+1;
		    spaces=spaces-1;
		    
		         System.out.println();
		}
	}
}

