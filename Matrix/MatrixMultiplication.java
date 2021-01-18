public class MatrixMultiplication
{
    public static void main(String[] args) 
	{
        int row = 3, column = 3;
        int[][] matrixone = { {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])}, 
						   {Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5])}, 
						   {Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8])} };

        // Display current matrix
		System.out.println("\n The given matrix one is : ");
        display(matrixone);

	int[][] matrixtwo = { {Integer.parseInt(args[9]), Integer.parseInt(args[10]), Integer.parseInt(args[11])}, 
						   {Integer.parseInt(args[12]), Integer.parseInt(args[13]), Integer.parseInt(args[14])}, 
						   {Integer.parseInt(args[15]), Integer.parseInt(args[16]), Integer.parseInt(args[17])} };

        // Display current matrix
		System.out.println("\n The given matrix two is : ");
        display(matrixtwo);


        // matrix multiplication
        int[][] matrixthree = new int[column][row];
        for(int i=0;i<3;i++)
	{    
		for(int j=0;j<3;j++)
		{    
			matrixthree[i][j]=0;      
			for(int k=0;k<3;k++)      
			{      
				matrixthree[i][j]+=matrixone[i][k]*matrixtwo[k][j];      
			}
		  //printing matrix element  
		}//end of j loop  
	//new line    
	} 

        // Display multiplied matrix
		System.out.println("\n The multiplication of the matrix is : ");
        display(matrixthree);
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
