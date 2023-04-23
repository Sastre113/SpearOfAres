/**
 * 
 */
package spear.of.ares.model.dto.relEmpleadoEmpresa;

import java.util.ArrayList;
import java.util.List;

import spear.of.ares.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:42:16 - 02/10/2022
 *
 */
public class RespuestaListarRelacionesDTO extends RespuestaDTO {

	private List<RelacionDTO> listaRelacion;

	public List<RelacionDTO> getListaRelacion() {
		if(this.listaRelacion == null) {
			this.listaRelacion = new ArrayList<>();
		}
		
		return listaRelacion;
	}
}
