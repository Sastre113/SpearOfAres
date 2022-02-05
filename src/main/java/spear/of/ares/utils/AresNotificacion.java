/**
 * 
 */
package spear.of.ares.utils;

import java.lang.reflect.InvocationTargetException;

import org.springframework.http.HttpStatus;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:18:44 - 03/02/2022
 *
 */
public enum AresNotificacion {

	ERROR_GENERICO(-1, HttpStatus.INTERNAL_SERVER_ERROR, "Error inesperado en la aplicación"),
	OK(0, HttpStatus.OK, "Petición realizada con exito"),
	PT_ERR_VALIDACION(1000, HttpStatus.BAD_REQUEST, "La petición no es correcta");

	private int codigo;
	private HttpStatus httpStatus;
	private String msg;

	AresNotificacion(int codigo, HttpStatus httpStatus, String msg) {
		this.codigo = codigo;
		this.httpStatus = httpStatus;
		this.msg = msg;
	}
	
	public RespuestaDTO construir() {
		return this.construir("");
	}
	
	public RespuestaDTO construir(String msgExtendido) {
		RespuestaDTO respuestaDTO = new RespuestaDTO();
		
		respuestaDTO.setCodigo(this.getCodigoStr());
		respuestaDTO.setMensaje(this.msg);
		respuestaDTO.setMensajeExtendido(msgExtendido);
		
		return respuestaDTO;
	}
	
	
	public <T extends RespuestaDTO> T construir(Class<T> clazz) throws AresException{
		return this.construir(clazz, this.msg);
	}
	
	public <T extends RespuestaDTO> T construir(Class<T> clazz, String msg) throws AresException{
		try {
			
			T objetoT = clazz.getConstructor().newInstance();
			objetoT.setCodigo(this.getCodigoStr());
			objetoT.setMensaje(this.msg);
			objetoT.setMensajeExtendido(msg);
			
			return objetoT;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new AresException(e);
		}
	}
	
	public String getCodigoStr() {
		return String.valueOf(this.codigo);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
