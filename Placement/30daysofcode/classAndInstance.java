import java.io.*;
import java.util.*;

 class Person{
   
    int age;
    
    Person(int initialAge){
        if(initialAge>=0){
            age=initialAge;
        }
        
        else{
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    
    void yearPasses(){
        age=age+1;
    }
    
    void amlOld(){
        if(age<13)
            System.out.println("You are young.");
        else if(13<=age && age<18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }
}

public class Solution {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        
        while(testcases>0){
            int inputage = sc.nextInt();
            Person p = new Person(inputage);
            
            p.amlOld();
            p.yearPasses();
            p.yearPasses();
            p.yearPasses();
            p.amlOld();
            
            System.out.println();
            testcases=testcases-1;
        }
    }
}
