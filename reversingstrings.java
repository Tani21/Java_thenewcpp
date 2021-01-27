import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int flag=0;
 
        // convert String to character array
        // by using toCharArray
        char[] try1 = A.toCharArray();
        char[] rev = new char[try1.length];
        
        int j=0;
 
        for (int i = try1.length - 1; i >= 0; i--)
        {
            rev[j]=try1[i];
            j++;
        }    
        
        
        for(int k=0; k<try1.length; k++)
        {
            if(rev[k]==try1[k])
            {
                flag=flag+1;
            }
            
            else{break;}
        }
        
        if(flag==try1.length)
        {
            System.out.println("Yes");
        }
        else{System.out.println("No");}
    
    }
}

