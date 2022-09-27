/**
 * 
 */
package spear.of.ares.model.dto.relEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:13:07 - 27/09/2022
 *
 */
public class RelEmpresaEmpleadoDTO {

	private String tipoPuesto;
	private String idEmpresa;
	private String idEmpleado;

	public String getTipoPuesto() {
		return tipoPuesto;
	}

	public void setTipoPuesto(String tipoPuesto) {
		this.tipoPuesto = tipoPuesto;
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

}
