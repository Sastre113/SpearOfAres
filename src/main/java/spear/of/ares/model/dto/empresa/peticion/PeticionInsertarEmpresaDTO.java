/**
 * 
 */
package spear.of.ares.model.dto.empresa.peticion;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import spear.of.ares.model.dto.empresa.EmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:37:05 - 20/09/2022
 *
 */
public class PeticionInsertarEmpresaDTO {

	@Valid @NotNull
	private EmpresaDTO empresa;

	public EmpresaDTO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}
}
