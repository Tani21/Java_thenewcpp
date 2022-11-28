import java.util.*;

public class vignere_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String input= sc.next();
        System.out.println("Enter key: ");
        String key = sc.next();
        String requiredkey="", output="";

        if(key.length()<input.length()){
            for(int i=0; i<input.length(); i++){
                int modnumber=i%key.length();
                requiredkey=requiredkey+key.charAt(modnumber);
            }
        }

            for(int i=0; i<input.length(); i++){
                int keynumber = requiredkey.charAt(i);
                keynumber = keynumber-97;
                int inputnumber = input.charAt(i);
                inputnumber=inputnumber-97;
                int finalnumber = (keynumber+inputnumber)%26;
                finalnumber=finalnumber+97;
                char finalchar = (char)finalnumber;
                output = output + finalchar;
            }

        System.out.println("ciphered text: "+output);
        sc.close();
    }
}
