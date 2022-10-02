/**
 * 
 */
package spear.of.ares.model.dto.relEmpleadoEmpresa;

import java.util.Date;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:53:22 - 02/10/2022
 *
 */
public class RelacionDTO {

	private String idRelacion;
	private String idEmpresa;
	private String idEmpleado;
	private String tipoPuesto;
	private Date fechaAlta;
	private Date fechaBaja;

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

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
