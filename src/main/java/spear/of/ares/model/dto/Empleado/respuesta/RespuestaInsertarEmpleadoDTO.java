package spear.of.ares.model.dto.Empleado.respuesta;

import spear.of.ares.model.dto.RespuestaDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:52:57 - 29/01/2022
 *
 */
public class RespuestaInsertarEmpleadoDTO extends RespuestaDTO {

	private String idEmpleado;

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
}
