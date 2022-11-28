import java.util.*;

public class lab4_aes_cipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to encrypt: ");
		String input = sc.next();
		System.out.println("Enter key value: ");
		String key = sc.next();

		//input = encryption_function(input, key);
		System.out.println("Value of Cipher: " + input);
		//input = decryption_function(input, key);
		System.out.println("Deciphered Value: "+input);

        sc.close();
    }
    
}
