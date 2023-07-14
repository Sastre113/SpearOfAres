/**
 * 
 */
package spear.of.ares.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:36:46 - 30/01/2022
 *
 */
@Entity
@Table(name = "TB_EMPLEADO")
@NamedEntityGraph(
		name = "empleado-entity-graph",
		attributeNodes = {
				@NamedAttributeNode("dni"),
				@NamedAttributeNode("nombre"),
				@NamedAttributeNode("fechaNacimiento"),
				@NamedAttributeNode("relEmpresaEmpleado")
		}
)
public class TbEmpleado {

	@Id
	@Column(name = "id_empleado", nullable = false, length = 36)
	private String idEmpleado;

	@Column(name = "dni", nullable = false, length = 9)
	private String dni;
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@OneToMany(mappedBy = "empleado")
	private List<TbRelEmpresaEmpleado> relEmpresaEmpleado;

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

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

	public List<TbRelEmpresaEmpleado> getRelEmpresaEmpleado() {
		return relEmpresaEmpleado;
	}

	public void setRelEmpresaEmpleado(List<TbRelEmpresaEmpleado> relEmpresaEmpleado) {
		this.relEmpresaEmpleado = relEmpresaEmpleado;
	}

}
