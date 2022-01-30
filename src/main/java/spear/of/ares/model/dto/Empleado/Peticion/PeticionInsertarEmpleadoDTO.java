/**
 * 
 */
package spear.of.ares.model.dto.Empleado.Peticion;

import java.util.Date;

import javax.validation.constraints.NotBlank;


/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:49:40 - 29/01/2022
 *
 */
public class PeticionInsertarEmpleadoDTO {

	@NotBlank
	private String dni;
	@NotBlank
	private String nombre;
	private Date fechaNacimiento;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
