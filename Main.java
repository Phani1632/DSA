import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Main {
    public static String encrypt(String res)throws Exception{
        String key="qwertyuiopasdfghjklzxcvbnm123456";
        String iv ="1234567890123456";

        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        byte[]  encrypted = cipher.doFinal(res.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);

    }
    public static void main(String[] args) {
        String json = "{"
                + "\"firstNumber\":10,"
                + "\"secondNumber\":-20"
                + "}";
        
        try {
            System.out.println(encrypt(json));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
