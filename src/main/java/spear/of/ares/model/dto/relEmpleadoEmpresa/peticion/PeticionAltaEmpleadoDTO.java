/**
 * 
 */
package spear.of.ares.model.dto.relEmpleadoEmpresa.peticion;

import javax.validation.constraints.NotEmpty;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:34:11 - 02/10/2022
 *
 */
public class PeticionAltaEmpleadoDTO {

	@NotEmpty
	private String idEmpresa;
	@NotEmpty
	private String idEmpleado;
	@NotEmpty
	private String tipoPuesto;

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getTipoPuesto() {
		return tipoPuesto;
	}

	public void setTipoPuesto(String tipoPuesto) {
		this.tipoPuesto = tipoPuesto;
	}
}
