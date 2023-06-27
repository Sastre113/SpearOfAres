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
			    0x00, 0x00, 0x00, 0x00,
			    0x00, 0x00, 0x00, 0x00,
			    0x00, 0x00, 0x00, 0x00
			};
		this.ALGORITHM = "AES/GCM/NoPadding";
	}
	
	public static void mostrarHash(HttpServletRequest request) {
		String hash = request.getHeader("hash");
		CipherManager cipherManager = new CipherManager();
		try {
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
		ByteBuffer byteBuffer = ByteBuffer.wrap(msgEncriptado.getBytes());
		byte[] iv = new byte[12];
		byteBuffer.get(iv);
		byte[] encrypted = new byte[byteBuffer.remaining()];
        byteBuffer.get(encrypted);
		Cipher cipher = this.getDesencriptador(iv);
		byte[] msgBytes = cipher.doFinal(encrypted);
		return new String(msgBytes, StandardCharsets.UTF_8);
	}

	
	private Cipher getEncriptador() throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		return this.generarCipher(Cipher.ENCRYPT_MODE, this.IV);
	}
	
	private Cipher getDesencriptador(byte [] iv) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		return this.generarCipher(Cipher.DECRYPT_MODE, iv);
	}
	
	private Cipher generarCipher(int mode, byte[] iv) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		GCMParameterSpec parameterSpec = new GCMParameterSpec(128, iv);
		SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
		cipher.init(mode, keySpec, parameterSpec);
		
		return cipher;
	}
}
