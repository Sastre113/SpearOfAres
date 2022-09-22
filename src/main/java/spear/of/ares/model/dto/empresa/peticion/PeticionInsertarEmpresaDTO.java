/**
 * 
 */
package spear.of.ares.model.dto.empresa.peticion;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:37:05 - 20/09/2022
 *
 */
public class PeticionInsertarEmpresaDTO {

	@NotEmpty
	private String nombre;
	@NotEmpty
	private String propietario;
	@NotNull
	@Min(value = 1)
	private Integer cantidadEmpleados;

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

	public Integer getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(Integer cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
}
