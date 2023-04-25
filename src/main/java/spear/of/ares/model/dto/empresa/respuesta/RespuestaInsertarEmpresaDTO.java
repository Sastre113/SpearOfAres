/**
 * 
 */
package spear.of.ares.model.dto.empresa.respuesta;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.entity.TbEmpresa;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:38:02 - 20/09/2022
 *
 */
public class RespuestaInsertarEmpresaDTO extends RespuestaDTO {

	private TbEmpresa empresa;

	public TbEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(TbEmpresa empresa) {
		this.empresa = empresa;
	}
}
