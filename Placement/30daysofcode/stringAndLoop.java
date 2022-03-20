import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        
        while(testcases>0){
            
            String testString = sc.next();
            
            String even="";
            String odd="";
            
            for(int i=0; i<testString.length(); i=i+2){
                even=even+testString.charAt(i);
            }
            
            for(int i=1; i<testString.length(); i=i+2){
                odd=odd+testString.charAt(i);
            }
            
            System.out.println(even+" "+odd);
            testcases=testcases-1;
        }
    }
}
