import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        int a=0,b=0;
       try
       {
            a = object.nextInt();
            b = object.nextInt();
            System.out.println(a/b);
       }
       catch(InputMismatchException ime)
           {
               System.out.println("java.util.InputMismatchException");

           }     
       
       catch(Exception e)
           {
               System.out.println(e);
           }      
    }
}
