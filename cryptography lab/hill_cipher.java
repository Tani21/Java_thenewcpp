import java.util.*;

public class hill_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        System.out.println("Enter key: ");
        String key = sc.next();

        int matrixsize = (int)Math.sqrt(key.length());
        int keymatrix[][] = new int[matrixsize][matrixsize];
        int inputmatrix[][] = new int[input.length()][1];
        int finalmatrix[][] = new int[input.length()][1];
        String output="";
        int keycounter=0;
        int inputcounter=0;

        // store the key matrix
        for(int i=0; i<matrixsize; i++){
            for(int j=0; j<matrixsize; j++){
                int a = key.charAt(keycounter);
                a = a-97;
                keycounter++;
                keymatrix[i][j]=a;
            }
        }
  
        // store the input matrix
        for(int i=0; i<input.length(); i++){
            for(int j=0; j<1; j++){
                int b= input.charAt(inputcounter);
                b = b-97;
                inputcounter++;
                inputmatrix[i][j]=b;
            }
        }

        // multiply the two matrices
            for(int i=0; i<matrixsize; i++){
                for(int j=0; j<1; j++){
                    for(int k=0; k<matrixsize; k++){
                        finalmatrix[i][j] += keymatrix[i][k] * inputmatrix[k][j];
                    }
                }
            }

            for(int i=0; i<matrixsize; i++){
                for(int j=0; j<1; j++){
                    for(int k=0; k<matrixsize; k++){
                       finalmatrix[i][j]=finalmatrix[i][j]%26;
                    }
                }
            }

            for(int i=0; i<matrixsize; i++){
                for(int j=0; j<1; j++){
                    int numbervalue = finalmatrix[i][j];
                    numbervalue = numbervalue+97;
                    char a = (char)numbervalue;
                    output = output + a;
                }
            }

            System.out.println("output: "+output);
            sc.close();
    }
}
