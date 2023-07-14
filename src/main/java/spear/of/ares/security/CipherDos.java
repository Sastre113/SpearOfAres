package spear.of.ares.security;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CipherDos {
	
    private final String SECRET_KEY;
    private final byte[] IV;
    private final String ALGORITHM;

    public CipherDos() {
        this.SECRET_KEY = "NoMeRobesPorFavo";
        this.IV = new byte[]{
                0x01, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00
        };
        this.ALGORITHM = "AES/GCM/NoPadding";
    }

    public String encrypt(String plaintext) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, IV);

        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, gcmParameterSpec);

        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes(StandardCharsets.UTF_8));

        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decrypt(String encryptedText) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        SecretKeySpec secretKeySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, IV);

        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, gcmParameterSpec);

        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {
    	CipherDos cipherDos = new CipherDos();

    	System.out.println(cipherDos.decrypt(args[0]));
    	
        String originalText = "Hola, este es un mensaje secreto.";
        String encryptedText = cipherDos.encrypt(originalText);
        String decryptedText = cipherDos.decrypt(encryptedText);

        System.out.println("Texto original: " + originalText);
        System.out.println("Texto cifrado: " + encryptedText);
        System.out.println("Texto descifrado: " + decryptedText);
    }
}
