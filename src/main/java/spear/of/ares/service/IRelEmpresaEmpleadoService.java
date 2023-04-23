/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.relEmpleadoEmpresa.RespuestaListarRelacionesDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionBajaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionListarRelacionesDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaBajaEmpleadoDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:33:13 - 02/10/2022
 *
 */
public interface IRelEmpresaEmpleadoService {

	public RespuestaAltaEmpleadoDTO altaEmpleado(PeticionAltaEmpleadoDTO peticionDTO) throws AresException;
	public RespuestaBajaEmpleadoDTO bajaEmpleado(String idRelacion) throws AresException;
	public RespuestaListarRelacionesDTO listarRelaciones(PeticionListarRelacionesDTO peticionDTO) throws AresException;
}
