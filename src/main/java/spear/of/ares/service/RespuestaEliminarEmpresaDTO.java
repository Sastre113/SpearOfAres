/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.empresa.EmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:38:24 - 20/09/2022
 *
 */
public class RespuestaEliminarEmpresaDTO extends RespuestaDTO {

	private EmpresaDTO empresaBorrada;

	public EmpresaDTO getEmpresaBorrada() {
		return empresaBorrada;
	}

	public void setEmpresaBorrada(EmpresaDTO empresaBorrada) {
		this.empresaBorrada = empresaBorrada;
	}
}
