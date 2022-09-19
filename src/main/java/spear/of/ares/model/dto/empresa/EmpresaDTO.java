/**
 * 
 */
package spear.of.ares.model.dto.empresa;

import java.time.LocalDate;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:37:28 - 20/09/2022
 *
 */
public class EmpresaDTO extends IdEmpresaDTO {

	private String nombre;
	private String propietario;
	private int cantidadEmpleados;
	private LocalDate fechaCreacion;
	private LocalDate fechaDesaparicion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDate getFechaDesaparicion() {
		return fechaDesaparicion;
	}

	public void setFechaDesaparicion(LocalDate fechaDesaparicion) {
		this.fechaDesaparicion = fechaDesaparicion;
	}
}
