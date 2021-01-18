import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            double two=2;
            int a0=a;
            for(double j=0; j<n; j++)
            {
                double power=Math.pow(two, j);
                int a1=a0+(int)(power*b);
                System.out.print(a1+" ");
                a0=a1;
                
            }
            System.out.println("");
        }
        in.close();
              
    }
}
