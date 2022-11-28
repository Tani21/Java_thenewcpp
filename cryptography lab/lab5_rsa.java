import java.util.*;

public class lab5_rsa {

    static boolean checkPrime(int x){
        boolean primecheck=true;
        
        t:
        for(int i=2; i<=x/2; i++){
            
            if(x%i==0){
                primecheck = false;
                break t;   
            }
        }
        return primecheck;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int primeone=0, primetwo=0, n=0, phi_n=0, e=0, d=0;
        System.out.println("Please enter first prime number");
        primeone = sc.nextInt();
        System.out.println("Please enter second prime number");
        primetwo=sc.nextInt();
        System.out.println("Enter string to encrypt: ");
        String input=sc.next(); 

        n = primeone*primetwo;
        phi_n = (primeone-1)*(primetwo-1);

        t:
        for(int i=2; i<phi_n; i++){
            if(i!=primeone && i!=primetwo){
                boolean result = checkPrime(i);
                if(result==true){
                    if(phi_n%i!=0){
                        e=i;
                        break t;
                    }

                    else {}
                }
            }
        }

        System.out.println("public key: "+e);

        int counter=1;
        s:
        while(true){
            if((e*counter)%phi_n==1){
                d=counter;
                break s;
            }
            else{
                counter++;
            }
        }
        System.out.println("private key: "+d);

        double encryption = (Math.pow(input.length(), e))%n;
        System.out.println("Value of cipher: "+encryption);
        double decryption = (Math.pow(encryption, d))%n;
        System.out.println("Deciphered value: "+decryption);

        if(decryption==input.length()){
            System.out.println("RSA has successfully encrypted and decrypted the message as length of input is equal to the deciphered text");
        }
        sc.close();
    }
}
