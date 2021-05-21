import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N%2 != 0)
        {
            System.out.println("Weird");
        }
        
        if(N%2==0)
        {
            if(2<=N && N<=5)
            {
                System.out.println("Not Weird");
            }
            
            if(6<=N && N<=20)
            {
                System.out.println("Weird");
            }
            
            if(N>20)
            {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
