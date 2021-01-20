import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = null;
        input = new Scanner(System.in);
        int i=0;
        while(input.hasNextLine())
         {
             i=i+1;
            //Reading the nextLine
            System.out.println(i+" "+input.nextLine());
         }
    }
}
