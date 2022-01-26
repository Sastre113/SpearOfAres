/**
 * 
 */
package spear.of.ares.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TB_REL_EMPRESA_EMPLEADO")
@Data
public class TbRelEmpresaEmpleado {

	@EmbeddedId
	private TbRelEmpresaEmpleadoPK id;
	@Column(name="tipo_puesto", updatable=false, nullable = false, length=50)
	private String tipoPuesto;
	@Column(name="fecha_alta", updatable=false, nullable = false)
	private Date fechaAlta;
	@Column(name="fecha_baja", updatable=false, nullable = false)
	private Date fechaBaja;
}
