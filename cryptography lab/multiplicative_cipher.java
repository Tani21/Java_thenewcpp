import java.util.*;

public class multiplicative_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        int key =3;
        String output="";

        for(int i=0; i<input.length(); i++){
            int ascii = input.charAt(i);
            ascii=ascii-97;
            ascii=(ascii*key)%26;
            ascii=ascii+97;
            char converted = (char) ascii;
            output=output+converted;
        }

        System.out.println("ciphered text: "+output);
        sc.close();
    }
}
