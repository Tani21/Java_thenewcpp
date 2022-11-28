package revision;
import java.util.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class sha {

   public static byte[] getSha(String input) throws NoSuchAlgorithmException{
   MessageDigest md = MessageDigest.getInstance("SHA-256");
    return md.digest(input.getBytes(StandardCharsets.UTF_8));
   }

   public static String toHexString(byte[] hash){
    BigInteger number = new BigInteger(1,hash);
    StringBuilder hex = new StringBuilder((number.toString(16)));

    while(hex.length()<64){
        hex.insert(0, '0');
    }

    return hex.toString();
   }
    public static void main(String args[]) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String input="this string has to be encoded";
        System.out.println(toHexString(getSha(input)));
        sc.close();

    }
    
}
