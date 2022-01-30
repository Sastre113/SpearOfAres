/**
 * 
 */
package spear.of.ares.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:54:38 - 29/01/2022
 *
 */
public abstract class RespuestaDTO {

	private String codigo;
	private String mensaje;

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
}
