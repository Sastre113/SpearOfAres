package spear.of.ares.model.dto.Empleado;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class EmpleadoDTO extends IdEmpleadoDTO {

	@NotNull
	private String dni;
	private String nombre;
	private Date fechaNacimiento;
	
	public EmpleadoDTO() {
	}

	public EmpleadoDTO(@NotNull String dni, String nombre, Date fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
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
