package spear.of.ares.model.dto.Empleado;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Past;

public class EmpleadoDTO extends IdEmpleadoDTO {

	@NotEmpty @Pattern(regexp="\\d{8}[A-HJ-NP-TV-Z]", flags={Flag.CASE_INSENSITIVE})
	private String dni;
	@NotEmpty @Size(max = 40) 
	private String nombre;
	@Past
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
