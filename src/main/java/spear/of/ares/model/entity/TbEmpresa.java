/**
 * 
 */
package spear.of.ares.model.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	@OneToMany(mappedBy = "empresa")
	private Set<TbRelEmpresaEmpleado> relEmpresaEmpleado;

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaDesaparacion() {
		return fechaDesaparacion;
	}

	public void setFechaDesaparacion(Date fechaDesaparacion) {
		this.fechaDesaparacion = fechaDesaparacion;
	}

	public Set<TbRelEmpresaEmpleado> getRelEmpresaEmpleado() {
		return relEmpresaEmpleado;
	}

	public void setRelEmpresaEmpleado(Set<TbRelEmpresaEmpleado> relEmpresaEmpleado) {
		this.relEmpresaEmpleado = relEmpresaEmpleado;
	}

}
