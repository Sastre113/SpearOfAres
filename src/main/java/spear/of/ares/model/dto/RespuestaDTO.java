/**
 * 
 */
package spear.of.ares.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:54:38 - 29/01/2022
 *
 */
public class RespuestaDTO {

	private String codigo;
	private String mensaje;
	private String mensajeExtendido;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensajeExtendido() {
		return mensajeExtendido;
	}

	public void setMensajeExtendido(String mensajeExtendido) {
		this.mensajeExtendido = mensajeExtendido;
	}
}
