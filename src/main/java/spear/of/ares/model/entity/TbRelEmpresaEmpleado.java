/**
 * 
 */
package spear.of.ares.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:37:00 - 30/01/2022
 *
 */
@Entity
@Table(name = "TB_REL_EMPRESA_EMPLEADO")
@Data
public class TbRelEmpresaEmpleado {

	@Id
	@Column(name = "id_relacion", updatable = false, nullable = false, length = 36)
	private String idRelacion;
	@Column(name = "id_empresa", updatable = false, nullable = false, length = 36)
	private String idEmpresa;
	@Column(name = "id_empleado", updatable = false, nullable = false, length = 36)
	private String idEmpleado;
	@Column(name = "tipo_puesto", updatable = false, nullable = false, length = 50)
	private String tipoPuesto;
	@Column(name = "fecha_alta", updatable = false, nullable = false)
	private Date fechaAlta;
	@Column(name = "fecha_baja", updatable = false, nullable = false)
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
