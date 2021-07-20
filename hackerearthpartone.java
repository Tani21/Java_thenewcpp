import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */ //System.out.println("NO");
 
        // Write your code here
 
 
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
 
        int a=-1, b=-1, flag=0;
 
        
        while(testcases>0)
        {
            int number = scanner.nextInt();
            //System.out.println("number: "+number);
            t:
            while(a!=0)
            {
                a = number /10;
                b = number%10;
                if(b!=6 && b!=9)
                {
                    //System.out.println("43 goes here");   
                    flag=flag+1;
                    break t;
                }
 
                else if(b==6 || b==9)
                {
                   //System.out.println("43 goes in else if");
                }
                 number=a;
            }
 
            a=-1; b=-1;
 
            //System.out.println("flag: "+flag);
 
            if(flag==0)
            {
                System.out.println("YES");
            }
 
            else if(flag==1)
            {
                System.out.println("NO");
            }
 
            flag=0;
            testcases--;
        }
 
    }
}
