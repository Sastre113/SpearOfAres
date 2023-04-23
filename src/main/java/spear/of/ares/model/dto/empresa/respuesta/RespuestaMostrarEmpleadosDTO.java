/**
 * 
 */
package spear.of.ares.model.dto.empresa.respuesta;

import java.util.List;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.model.dto.empresa.EmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:37:34 - 26/09/2022
 *
 */
public class RespuestaMostrarEmpleadosDTO extends RespuestaDTO {

	private EmpresaDTO empresa;
	private List<EmpleadoDTO> listaEmpleados;

	public EmpresaDTO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

	public List<EmpleadoDTO> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<EmpleadoDTO> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
}
