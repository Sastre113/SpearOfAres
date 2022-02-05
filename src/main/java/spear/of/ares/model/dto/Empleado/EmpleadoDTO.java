package spear.of.ares.model.dto.Empleado;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class EmpleadoDTO extends IdEmpleadoDTO {

	@NotNull @Size(min = 9, max = 9)
	private String dni;
	@NotNull @Size(max = 40) 
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
