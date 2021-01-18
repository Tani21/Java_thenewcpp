public class MatrixInverse
{
    public static void main(String[] args) 
	{
        int row = 2, column = 2;
        int[][] matrix = { {Integer.parseInt(args[0]), Integer.parseInt(args[1])}, 
						   {Integer.parseInt(args[2]), Integer.parseInt(args[3])}}; 
						   

        // Display current matrix
		System.out.println("\n The given matrix one is : ");
        display(matrix);

	int determinant;
	determinant=(matrix[0][0]*matrix[1][1])-(matrix[1][0]*matrix[0][1]);

        // matrix inverse
        int[][] matrixinverse = new int[column][row];

	matrixinverse[0][0]=matrix[1][1];
	matrixinverse[1][1]=matrix[0][0];
	matrixinverse[0][1]=-matrix[0][1];
	matrixinverse[1][0]=-matrix[1][0];
        
        // Display multiplied matrix
		System.out.println("\n The inverse of the matrix is : ");
System.out.print("("+"1/"+determinant+")");
	
        display(matrixinverse);
    }

    public static void display(int[][] matrix) 
	{
		//for(int i = 0; i < row; i++)
        for(int[] row : matrix) 
		{
			//for (int j = 0; j < column; j++)
            for (int column : row) 
			{
                System.out.print(" " + column + "   ");
            }
            System.out.println("	");
        }
    }
}
