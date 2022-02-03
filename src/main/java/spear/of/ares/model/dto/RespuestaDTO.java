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

	public RespuestaDTO() {
		
	}
	
	public RespuestaDTO(String codigo, String mensaje) {
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

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
