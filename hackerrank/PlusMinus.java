import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double positive=0.0, negative=0.0, zero=0.0;
    
    for(int i=0; i<arr.size(); i++)
    {
        if(arr.get(i)>0)
        {
            positive=positive+1;
        }
        
        else if(arr.get(i)==0){
            zero=zero+1;
        }
        
        else{
            negative=negative+1;
        }
        
    }
    
    System.out.println(positive/arr.size());
    System.out.println(negative/arr.size());
    System.out.println(zero/arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
