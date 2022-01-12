import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//tested app today

class Calculation
{
    void printSubArray(int arr[])
 {
     int count=0;
     int n=arr.length;
    for(int j=0;j<n;j++)
    {
        int sum=0;
        for(int k=j;k<n;k++)
        {
            sum=arr[k]+sum;
            if(sum<0)
            {
                count++;
            }
        }
    }
    System.out.println(count);  
 }
}
    


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        sc.close();
        Calculation obj = new Calculation();
        obj.printSubArray(arr);
        
        
    }
}

