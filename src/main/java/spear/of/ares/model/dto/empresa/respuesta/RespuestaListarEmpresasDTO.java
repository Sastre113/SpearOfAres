/**
 * 
 */
package spear.of.ares.model.dto.empresa.respuesta;

import java.util.List;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.empresa.EmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:38:48 - 20/09/2022
 *
 */
public class RespuestaListarEmpresasDTO extends RespuestaDTO {

	private List<EmpresaDTO> listaEmpresa;

	public List<EmpresaDTO> getListaEmpresa() {
		return listaEmpresa;
	}

	public void setListaEmpresa(List<EmpresaDTO> listaEmpresa) {
		this.listaEmpresa = listaEmpresa;
	}
}
 