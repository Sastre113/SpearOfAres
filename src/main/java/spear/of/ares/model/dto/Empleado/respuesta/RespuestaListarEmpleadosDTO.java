/**
 * 
 */
package spear.of.ares.model.dto.Empleado.respuesta;

import java.util.List;

import spear.of.ares.model.dto.RespuestaDTO;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com> Creado 22:48:45 - 26/01/2022
 *
 */
public class RespuestaListarEmpleadosDTO extends RespuestaDTO {

	private List<EmpleadoDTO> listaEmpleado;

	public List<EmpleadoDTO> getListaEmpleado() {
		return listaEmpleado;
	}

	public void setListaEmpleado(List<EmpleadoDTO> listaEmpleado) {
		this.listaEmpleado = listaEmpleado;
	}
}
