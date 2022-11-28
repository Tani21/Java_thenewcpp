import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.*;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA {
    public static void main(String args[]) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{

        Scanner sc = new Scanner(System.in);

        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
generator.initialize(2048);
KeyPair pair = generator.generateKeyPair();

PrivateKey privateKey = pair.getPrivate();
PublicKey publicKey = pair.getPublic();

String secretMessage = "tanishka here";

Cipher encryptCipher = Cipher.getInstance("RSA");
encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

byte[] secretMessageBytes = secretMessage.getBytes(StandardCharsets.UTF_8);
byte[] encryptedMessageBytes = encryptCipher.doFinal(secretMessageBytes);

String encodedMessage = Base64.getEncoder().encodeToString(encryptedMessageBytes);
System.out.println("encoded message: "+encodedMessage);

Cipher decryptCipher = Cipher.getInstance("RSA");
decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);

byte[] decryptedMessageBytes = decryptCipher.doFinal(encryptedMessageBytes);
String decryptedMessage = new String(decryptedMessageBytes, StandardCharsets.UTF_8);

System.out.println("decrypted message: "+decryptedMessage);

System.out.println(secretMessage.equals(decryptedMessage));

        sc.close();

    }
    
}
