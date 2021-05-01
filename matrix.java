package labfile;

import java.util.*;

public class Matrix {
	
	static void matrixTranspose(int arr[][])
	{
		System.out.println("Matrix transpose of this matrix is: ");
		for(int j=0; j<2; j++)
		{
			for(int i=0; i<2; i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static void matrixInverse(int arr[][])
	{
		System.out.println("Matrix inverse of this matrix is: ");
		int first = arr[0][0]; 
		arr[0][0] = arr[1][1];
		arr[1][1]=first;
		
		arr[0][1] = -arr[0][1];
		arr[1][0] = -arr[1][0];
		
		int prefix = (arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]);
		
		System.out.print("(-1"+"/"+prefix+") ");
		System.out.println(arr[0][0]+" "+arr[0][1]);
		System.out.println("      "+arr[1][0]+" "+arr[1][1]);
	}
	
	static void matrixMultiplication(int arrone[][], int arrtwo[][])
	{
		int arraythree[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    arraythree[i][j] += arrone[i][k] * arrtwo[k][j];
            }
        }
		
		System.out.println();
		System.out.println("matrix after multiplication");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arraythree[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayy[][] = new int[2][2];
		int arrayone[][] = new int [2][2];
		int arrayytwo[][] = new int[2][2];
		
		System.out.println("Enter the elements of 2*2 matrix");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arrayy[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original matrix is: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arrayy[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		System.out.println();
		matrixTranspose(arrayy);
		System.out.println();
		matrixInverse(arrayy);
		System.out.println();
		
		System.out.println("Enter the elements of 2*2 for matrix one");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arrayone[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original matrix one is: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arrayone[i][j]+" "); 
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("Enter the elements of 2*2 for matrix two");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arrayytwo[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Original matrix two is: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arrayytwo[i][j]+" "); 
			}
			
			System.out.println();
		}
		matrixMultiplication(arrayone,arrayytwo);
		System.out.println();
		
		scanner.close();
	}

}
