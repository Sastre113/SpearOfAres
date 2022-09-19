/**
 * 
 */
package spear.of.ares.model.dto.empresa;

import javax.validation.constraints.NotEmpty;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:48:58 - 20/09/2022
 *
 */
public class IdEmpresaDTO {

	@NotEmpty
	private String idEmpresa;

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

}
