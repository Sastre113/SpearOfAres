/**
 * 
 */
package spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.RelacionDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:33:45 - 02/10/2022
 *
 */
public class RespuestaAltaEmpleadoDTO extends RespuestaDTO {

	private RelacionDTO relacion;

	public RelacionDTO getRelacion() {
		return relacion;
	}

	public void setRelacion(RelacionDTO relacion) {
		this.relacion = relacion;
	}
}
