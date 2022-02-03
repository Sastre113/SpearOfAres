/**
 * 
 */
package spear.of.ares.excepcion;

import java.lang.reflect.InvocationTargetException;

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

	public AresException() {
		this(AresNotificacion.ERROR_GENERICO.construir());
	}
	
	public AresException(AresNotificacion notificacion) {
		this(notificacion.construir());
	}
	
	public AresException(RespuestaDTO respuesta) {
		this(respuesta.getCodigo(), respuesta.getMensaje());
	}

	public AresException(String codigoError, String msgError) {
		this.respuesta = new RespuestaDTO(codigoError, msgError);
	}

	public RespuestaDTO getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(RespuestaDTO respuesta) {
		this.respuesta = respuesta;
	}
	
	public <T extends RespuestaDTO> T mapError(Class<T> clazz) {
		T error = null;
		
		try {	
			error = clazz.getDeclaredConstructor().newInstance();
			error.setCodigo(this.getRespuesta().getCodigo());
			error.setMensaje(this.getRespuesta().getMensaje());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		return error;
	}

}
