import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import javax.crypto.*;

public class lab7_digital_signature {
    public static void main(String args[]) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException{
        Scanner sc = new Scanner(System.in);
        String encodedString="", retrievedHash="", encodedStringtoverify="";
        String finalmessage="", inputcopy="", retrievedMessage="";

        System.out.println("Enter string to encrypt: ");
        String input = sc.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        input = input + " "+dtf.format(now);
        inputcopy=input;

        System.out.println();
        System.out.println("Your final message of this mail is: "+input);

        // STEP 1
        System.out.println();
        System.out.println("Applying SHA hash function");
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] bytearray = md.digest(inputcopy.getBytes(StandardCharsets.UTF_8));
        BigInteger number = new BigInteger(1, bytearray);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }
        encodedString=hexString.toString();
        finalmessage = input+encodedString;
        System.out.println("Message has been hashed and appended to original input");

        // STEP 2
        System.out.println();
        System.out.println("Encrpting the final message using RSA");
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair pair = generator.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        Cipher encryptCipher = Cipher.getInstance("RSA");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] secretMessageBytes = finalmessage.getBytes(StandardCharsets.UTF_8);
        byte[] encryptedMessageBytes = encryptCipher.doFinal(secretMessageBytes);
        String encodedMessage = Base64.getEncoder().encodeToString(encryptedMessageBytes);
        System.out.println("message has been encoded");
        System.out.println();
        System.out.println("Transfer of message takes place");
        System.out.println();

        // Decoding of message using RSA
        Cipher decryptCipher = Cipher.getInstance("RSA");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedMessageBytes = decryptCipher.doFinal(encryptedMessageBytes);
        String decryptedMessage = new String(decryptedMessageBytes, StandardCharsets.UTF_8);
        System.out.println("message has been decrypted: "+decryptedMessage);
        System.out.println("Check if encrypted message is equal to decrypted message: "+ finalmessage.equals(decryptedMessage));
        int length = decryptedMessage.length()-encodedString.length();
        retrievedMessage = decryptedMessage.substring(0, length);
        retrievedHash = decryptedMessage.substring(length, decryptedMessage.length());

        // hashing the retrieved message
        byte[] bytearraytoverify = md.digest(retrievedMessage.getBytes(StandardCharsets.UTF_8));
        BigInteger numbertoverify = new BigInteger(1, bytearraytoverify);
        StringBuilder hexStringtoverify = new StringBuilder(numbertoverify.toString(16));
        while (hexStringtoverify.length() < 64) {
            hexStringtoverify.insert(0, '0');
        }

        encodedStringtoverify=hexStringtoverify.toString();
        if(encodedStringtoverify.equals(retrievedHash)){
            System.out.println();
            System.out.println("Thus, Hash of retrieved message matches the retrieved hash value");
            System.out.println("This authenticates the contents at the time of the signature");
            System.out.println("Since original message is appended with date and time, author date and time can be verified");
        }
        sc.close();
    }
}
