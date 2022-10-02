/**
 * 
 */
package spear.of.ares.model.dto.relEmpleadoEmpresa.peticion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:42:08 - 02/10/2022
 *
 */
public class PeticionListarRelacionesDTO {

	private String idRelacion;
	private String idEmpresa;
	private String idEmpleado;
	private String tipoPuesto;

	public String getIdRelacion() {
		return idRelacion;
	}

	public void setIdRelacion(String idRelacion) {
		this.idRelacion = idRelacion;
	}

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
