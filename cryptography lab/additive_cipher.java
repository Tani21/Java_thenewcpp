import java.util.*;

public class additive_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        int key =3;
        String output="";
        String finalstring="";

        for(int i=0; i<input.length(); i++){
            int ascii = input.charAt(i);
            ascii=ascii-97;
            ascii=(ascii+key)%26;
            ascii=ascii+97;
            char converted = (char) ascii;
            output=output+converted;
        }

        System.out.println("ciphered text: "+output);

        for(int i=0; i<output.length(); i++){
            int ascii = output.charAt(i);
            
            ascii=ascii-key;

            System.out.println("char: "+(char)ascii);
            finalstring=finalstring+(char)ascii;


        }

        System.out.println("finalstring: "+finalstring);
        sc.close();
    }   
}
