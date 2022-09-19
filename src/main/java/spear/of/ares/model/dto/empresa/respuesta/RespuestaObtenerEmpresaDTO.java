/**
 * 
 */
package spear.of.ares.model.dto.empresa.respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.empresa.EmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:38:36 - 20/09/2022
 *
 */
public class RespuestaObtenerEmpresaDTO extends RespuestaDTO {

	private EmpresaDTO empresa;

	public EmpresaDTO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

}
