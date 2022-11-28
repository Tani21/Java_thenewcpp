import java.util.*;

public class lab2_substitution_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Caeser cipher is a type of substitution cipher");
        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        System.out.println("Enter key value: ");
        int key = sc.nextInt();
        String output="";
        String decrypted_text="";

        System.out.println("Performing encryption");
        for(int i=0; i<input.length(); i++){
            int ascii = input.charAt(i);
            ascii=ascii-97;
            ascii=(ascii+key)%26;
            ascii=ascii+97;
            char converted = (char) ascii;
            output=output+converted;
        }
        System.out.println("ciphered text: "+output);

        System.out.println("Performing decryption");
        for(int i=0; i<output.length(); i++){
            int ascii = output.charAt(i);
            ascii=ascii-97;
            ascii = ascii-key;
            if(ascii<0){
                ascii=ascii+26;
            }
            ascii = ascii%26;
            ascii=ascii+97;
            char converted = (char) ascii;
            decrypted_text=decrypted_text+converted;
        }
        System.out.println("deciphered text: "+decrypted_text);
        sc.close();
    }
}
