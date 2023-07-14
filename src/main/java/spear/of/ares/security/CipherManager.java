/**
 * 
 */
package spear.of.ares.security;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 21:32:19 - 27/06/2023
 *
 */
public class CipherManager {

	private final String SECRET_KEY;
	private final byte[] IV;
	private final String ALGORITHM;
	
	public CipherManager() {
		this.SECRET_KEY = "NoMeRobesPorFavo";
		this.IV = new byte[] {
			    0x01, 0x00, 0x00, 0x00,
			    0x00, 0x00, 0x00, 0x00,
			    0x00, 0x00, 0x00, 0x00
			};
		this.ALGORITHM = "AES/GCM/NoPadding";
	}
	
	public static void mostrarHash(HttpServletRequest request) {
		String hashBase64 = request.getHeader("hash");
		CipherManager cipherManager = new CipherManager();
		
		
		System.out.println("Hash recibido: " + hashBase64); 
		String hash = new String(Base64.getDecoder().decode(hashBase64));
		System.out.println("Hash quitado base64: " + hash); 
		
		
		try {
			
			
			String msgCifrado = cipherManager.encriptar("Mensaje oculto");
			String msgCifradoBase64 = Base64.getEncoder().encodeToString(msgCifrado.getBytes(StandardCharsets.UTF_8));
			String msgRecibidoCifrado = new String(Base64.getDecoder().decode(msgCifradoBase64));
			String msgDescifrado = cipherManager.desencriptar(msgRecibidoCifrado);
			
			System.out.println(cipherManager.desencriptar(hash));
			
		} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException
				| InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String encriptar(String msg) throws InvalidKeyException, InvalidAlgorithmParameterException,
			IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = this.getEncriptador();	
		byte[] cipherText = cipher.doFinal(msg.getBytes());
		return Base64.getEncoder().encodeToString(cipherText);
	}
	
	public String desencriptar(String msgEncriptado) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		//byte [] msgBytes = Base64.getDecoder().decode(msgEncriptado.getBytes());
		Cipher cipher = this.getDesencriptador();
		cipher.updateAAD(msgEncriptado.getBytes());
		byte[] msgDescifrado = cipher.doFinal(msgEncriptado.getBytes());
		return new String(msgDescifrado, StandardCharsets.UTF_8);
	}

	
	private Cipher getEncriptador() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		return this.generarCipher(Cipher.ENCRYPT_MODE);
	}
	
	private Cipher getDesencriptador() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		return this.generarCipher(Cipher.DECRYPT_MODE);
	}
	
	private Cipher generarCipher(int mode) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		GCMParameterSpec parameterSpec = new GCMParameterSpec(128, this.IV);
		SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
		cipher.init(mode, keySpec, parameterSpec);
		
		return cipher;
	}
}
