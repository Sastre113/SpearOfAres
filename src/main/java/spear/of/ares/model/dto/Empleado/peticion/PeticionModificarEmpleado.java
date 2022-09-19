/**
 * 
 */
package spear.of.ares.model.dto.Empleado.peticion;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 10:25:22 - 26/02/2022
 *
 */
public class PeticionModificarEmpleado {

	@NotEmpty
	private String idEmpleado;
	@NotEmpty
	@Size(max = 40)
	private String nombre;
	@Past
	private Date fechaNacimiento;

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
