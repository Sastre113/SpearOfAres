/**
 * 
 */
package spear.of.ares.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author Miguel
 *
 */
@Embeddable
@Data
public class TbRelEmpresaEmpleadoPK implements Serializable{
	
	@Column(name="id_relacion", updatable=false, nullable = false, length=36)
	private String idRelacion;
	@Column(name="id_empresa", updatable=false, nullable = false, length=36)
	private String idEmpresa;
	@Column(name="id_empleado", updatable=false, nullable = false, length=36)
	private String idEmpleado;
	
}
