import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int answer=-1;
    int key=6, value=-1;
    Map<Integer, Integer> hm = new TreeMap<Integer,Integer>();
    Collections.sort(arr);
 
    for(int i=1; i<6; i++){
        int freq = Collections.frequency(arr,i);
        hm.put(i, freq);
    }
    
    for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
       if(e.getValue()>value) {
            
                value=e.getValue();
                key=e.getKey();
            }
    }
    return key;
    
   
    }

}

public class Solution {
    public static void main(String[] args) throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
