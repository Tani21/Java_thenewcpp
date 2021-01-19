import java.util.*;
import java.io.*;
import java.lang.Math;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                int a=2, b=31;
                  
                int f=63;
                double g = Math.pow(a,f);
                double h = g-1;
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {System.out.println("* byte");}
                if(x>=-32768 && x<=32767)
                {System.out.println("* short");}
                if(x>=-2147483648 && x<=2147483647)
                {System.out.println("* int");}
                if(x>=-g && x<=h)
                {System.out.println("* long");}
               
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

