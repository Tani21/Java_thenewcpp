package revision;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

public class aes {
    
        private static SecretKey key;
        private static final int KEY_SIZE = 128;
        private static final int DATA_LENGTH = 128;
        private static Cipher encryptionCipher;
    
        public static void init() throws Exception {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(KEY_SIZE);
            key = keyGenerator.generateKey();
        }
    
        public static String encrypt(String data) throws Exception {
            byte[] dataInBytes = data.getBytes();
            encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
            encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedBytes = encryptionCipher.doFinal(dataInBytes);
            return encode(encryptedBytes);
        }

        public static String decrypt(String encryptedData) throws Exception {
            byte[] dataInBytes = decode(encryptedData);
            Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec spec = new GCMParameterSpec(DATA_LENGTH, encryptionCipher.getIV());
            decryptionCipher.init(Cipher.DECRYPT_MODE, key, spec);
            byte[] decryptedBytes = decryptionCipher.doFinal(dataInBytes);
            return new String(decryptedBytes);
        }

        private static String encode(byte[] data) {
            return Base64.getEncoder().encodeToString(data);
        }
    
        private static byte[] decode(String data) {
            return Base64.getDecoder().decode(data);
        }

        public static void main(String[] args) throws Exception {
           init();
                String encryptedData = encrypt("Hello, welcome to the encryption world");
                String decryptedData = decrypt(encryptedData);
    
                System.out.println("Encrypted Data : " + encryptedData);
                System.out.println("Decrypted Data : " + decryptedData);
            
        
    }
}
