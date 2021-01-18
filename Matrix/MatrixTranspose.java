public class MatrixTranspose
{
    public static void main(String[] args) 
	{
        int row = 3, column = 3;
        int[][] matrix = { {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])}, 
						   {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])}, 
						   {Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8])} };

        // Display current matrix
		System.out.println("\n The given matrix is : ");
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) 
		{
            for (int j = 0; j < column; j++) 
			{
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
		System.out.println("\n The transpose of the matrix is : ");
        display(transpose);
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
            System.out.println();
        }
    }
}
