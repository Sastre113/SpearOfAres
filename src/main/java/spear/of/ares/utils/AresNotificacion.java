/**
 * 
 */
package spear.of.ares.utils;

import spear.of.ares.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:18:44 - 03/02/2022
 *
 */
public enum AresNotificacion {

	ERROR_GENERICO(-1, "Error inesperado en la aplicación"), 
	OK(0, "Petición realizada con exito"),
	PT_ERR_VALIDACION(1000, "La petición no es correcta");

	private int codigo;
	private String msg;

	AresNotificacion(int codigo, String msg) {
		this.codigo = codigo;
		this.msg = msg;
	}

	public RespuestaDTO construir() {
		return new RespuestaDTO(String.valueOf(this.codigo), this.msg);
	}
	
	public RespuestaDTO construir(String msgPersonalizado) {
		return new RespuestaDTO(String.valueOf(this.codigo), msgPersonalizado);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
