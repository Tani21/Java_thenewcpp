import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        long arrayy[] = new long[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            long sum=0;
            for(int j=0; j<arr.length; j++)
            {
                if(i==j)
                    continue;
                else
                   sum=sum+arr[j];        
            }
            
            arrayy[i]=sum;
            
        }
        long minsum=arrayy[0], maxsum=arrayy[0];
        for(int k=0; k<arr.length; k++)
        {
            
            if(arrayy[k]<minsum)
                minsum=arrayy[k];
                
            if(arrayy[k]>maxsum)
                maxsum=arrayy[k];    
        }
        
        System.out.println(minsum+" "+maxsum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
