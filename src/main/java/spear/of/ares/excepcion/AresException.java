/**
 * 
 */
package spear.of.ares.excepcion;

import java.lang.reflect.InvocationTargetException;

import org.springframework.http.HttpStatus;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.utils.AresNotificacion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 2:02:16 - 03/02/2022
 *
 */
public class AresException extends Exception {
	
	private static final long serialVersionUID = -3478045201590762680L;
	private RespuestaDTO respuesta;
	private HttpStatus httpStatus;

	public AresException() {
		this(AresNotificacion.ERROR_GENERICO.construir());
		httpStatus = AresNotificacion.ERROR_GENERICO.getHttpStatus();
	}
	
	public AresException(Exception e) {
		this(e.getClass().getCanonicalName(), e.getMessage(), null);
	}
	
	public AresException(AresNotificacion notificacion) {
		this(notificacion.construir(), null);
		httpStatus = notificacion.getHttpStatus();
	}
	
	public AresException(AresNotificacion notificacion, String msgExtendido) {
		this(notificacion.construir(), msgExtendido);
		httpStatus = notificacion.getHttpStatus();
	}
	
	private AresException(RespuestaDTO respuesta) {
		this(respuesta.getCodigo(), respuesta.getMensaje(), respuesta.getMensajeExtendido());
	}
	
	private AresException(RespuestaDTO respuesta, String msgExtendido) {
		this(respuesta.getCodigo(), respuesta.getMensaje(), msgExtendido);
	}

	private AresException(String codigoError, String msg, String msgExtendido) {
		RespuestaDTO respuesta = new RespuestaDTO();
		
		respuesta.setCodigo(codigoError);
		respuesta.setMensaje(msg);
		respuesta.setMensajeExtendido(this.getMessage());
		
		this.respuesta = respuesta;
	}
	
	public <T extends RespuestaDTO> T mapError(Class<T> clazz) {
		T error = null;
		
		try {	
			error = clazz.getDeclaredConstructor().newInstance();
			error.setCodigo(this.getRespuesta().getCodigo());
			error.setMensaje(this.getRespuesta().getMensaje());
			error.setMensajeExtendido(this.getRespuesta().getMensajeExtendido());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return error;
	}
	

	public RespuestaDTO getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(RespuestaDTO respuesta) {
		this.respuesta = respuesta;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
