/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.peticion.Peticion;
import spear.of.ares.model.dto.peticion.Respuesta;
import spear.of.ares.model.dto.relEmpresaEmpleado.RelEmpresaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpresaEmpleado.RespuestaRelEmpresaEmpleadoDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:04:57 - 27/09/2022
 *
 */
public interface IRelEmpresaEmpleado  {
	
	public Respuesta<String, RespuestaRelEmpresaEmpleadoDTO> insertar(Peticion<String, RelEmpresaEmpleadoDTO> peticion) throws AresException;
}
