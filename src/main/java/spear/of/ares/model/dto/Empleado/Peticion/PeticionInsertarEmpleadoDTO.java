/**
 * 
 */
package spear.of.ares.model.dto.Empleado.Peticion;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import spear.of.ares.model.dto.Empleado.EmpleadoDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:49:40 - 29/01/2022
 *
 */
public class PeticionInsertarEmpleadoDTO {

	@Valid @NotNull
	private EmpleadoDTO empleado;
	
	public EmpleadoDTO getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoDTO empleado) {
		this.empleado = empleado;
	}
}
