package revision;
import java.util.*;

public class caser {

    static boolean isPrime(int a){
        boolean answer=true;
        int flag=1;
        

        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                flag=0;
                break;
            }
        }

        if(flag==0){
            answer=false;
        }

        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // String input= sc.next();
       // String key=sc.next();
        int p=3, q=11, e=0, d=0,counter=0;

        int n = p*q;
        int phi_n = (p-1)*(q-1);

        x:
        for(int i=2; i<phi_n; i++){
            boolean reply = isPrime(i);
            if(reply==true){
                if(i!=p && i!=q){
                    if(phi_n%i!=0){
                        e=i;
                        break x;
                    }
                }
            }
        }
        
        t:
        while(true)
{
    if((e*counter)%phi_n==1){
        d=counter;
        break t;
    }

    else{
        counter++;
        System.out.println(counter);
    }
   

}

System.out.println("e: "+e+" d: "+d);
       
        sc.close();
    }
}
