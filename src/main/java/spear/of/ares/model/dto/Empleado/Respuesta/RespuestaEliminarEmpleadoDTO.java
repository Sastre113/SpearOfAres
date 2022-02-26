/**
 * 
 */
package spear.of.ares.model.dto.Empleado.Respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 10:44:03 - 26/02/2022
 *
 */
public class RespuestaEliminarEmpleadoDTO extends RespuestaDTO {

	private EmpleadoDTO empleadoEliminado;

	public EmpleadoDTO getEmpleadoEliminado() {
		return empleadoEliminado;
	}

	public void setEmpleadoEliminado(EmpleadoDTO empleadoEliminado) {
		this.empleadoEliminado = empleadoEliminado;
	}

}
