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
 * @version 1:36:55 - 30/01/2022
 *
 */
@Entity
@Table(name = "TB_EMPRESA")
public class TbEmpresa {

	@Id
	@Column(name = "id_empresa", updatable = false, nullable = false, length = 36)
	private String idEmpresa;
	@Column(name = "nombre", length = 100)
	private String nombre;
	@Column(name = "propietario", nullable = false, length = 100)
	private String propietario;
	@Column(name = "cantidad_empleados")
	private int cantidadEmpleados;
	@Column(name = "fecha_creacion", updatable = false, nullable = false)
	private Date fechaCreacion;
	@Column(name = "fecha_desaparacion")
	private Date fechaDesaparacion;

	/**
	 * @return the idEmpresa
	 */
	public String getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the propietario
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	/**
	 * @return the cantidadEmpleados
	 */
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	/**
	 * @param cantidadEmpleados the cantidadEmpleados to set
	 */
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaDesaparacion
	 */
	public Date getFechaDesaparacion() {
		return fechaDesaparacion;
	}

	/**
	 * @param fechaDesaparacion the fechaDesaparacion to set
	 */
	public void setFechaDesaparacion(Date fechaDesaparacion) {
		this.fechaDesaparacion = fechaDesaparacion;
	}
}
