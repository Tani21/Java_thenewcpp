import java.io.*;
import java.util.*;
import java.lang.String;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int lengthofstrings;
        lengthofstrings=A.length()+B.length();
        System.out.println(lengthofstrings);
       
       int number;
       number=A.compareTo(B);
       
       if(number>0){System.out.println("Yes");}
       else{System.out.println("No");}
        
        String firstLetterA = A.substring(0, 1);
    String remainingLettersA = A.substring(1, A.length());

    // change the first letter to uppercase
    firstLetterA = firstLetterA.toUpperCase();

    // join the two substrings
    A = firstLetterA + remainingLettersA;
    
    String firstLetterB = B.substring(0, 1);
    String remainingLettersB = B.substring(1, B.length());

    // change the first letter to uppercase
    firstLetterB = firstLetterB.toUpperCase();

    // join the two substrings
    B = firstLetterB + remainingLettersB;
    System.out.println(A+" "+B);
    }
}

