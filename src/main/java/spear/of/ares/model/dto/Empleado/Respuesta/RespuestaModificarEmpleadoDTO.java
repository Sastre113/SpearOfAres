/**
 * 
 */
package spear.of.ares.model.dto.Empleado.Respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 10:22:42 - 26/02/2022
 *
 */
public class RespuestaModificarEmpleadoDTO extends RespuestaDTO {

	private EmpleadoDTO empleadoOriginal;
	private EmpleadoDTO empleadoModificado;

	public EmpleadoDTO getEmpleadoOriginal() {
		return empleadoOriginal;
	}

	public void setEmpleadoOriginal(EmpleadoDTO empleadoOriginal) {
		this.empleadoOriginal = empleadoOriginal;
	}

	public EmpleadoDTO getEmpleadoModificado() {
		return empleadoModificado;
	}

	public void setEmpleadoModificado(EmpleadoDTO empleadoModificado) {
		this.empleadoModificado = empleadoModificado;
	}
}
