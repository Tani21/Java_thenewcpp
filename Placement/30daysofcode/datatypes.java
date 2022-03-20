import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int i=4;
        double d = 4.0;
        String s = "HackerRank";
        
        int a = scan.nextInt();
        double b = scan.nextDouble();
        String c = scan.nextLine();
        c=c+scan.nextLine(); 
        
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+" "+c);
        
    }
}
