/**
 * 
 */
package spear.of.ares.model.dto.Empleado.respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com> Creado 22:48:53 - 26/01/2022
 *
 */
public class RespuestaObtenerEmpleadoDTO extends RespuestaDTO {

	private EmpleadoDTO empleadoDTO;

	public EmpleadoDTO getEmpleadoDTO() {
		return empleadoDTO;
	}

	public void setEmpleadoDTO(EmpleadoDTO empleadoDTO) {
		this.empleadoDTO = empleadoDTO;
	}
}
