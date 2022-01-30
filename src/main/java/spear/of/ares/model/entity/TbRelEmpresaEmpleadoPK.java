/**
 * 
 */
package spear.of.ares.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:37:06 - 30/01/2022
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
