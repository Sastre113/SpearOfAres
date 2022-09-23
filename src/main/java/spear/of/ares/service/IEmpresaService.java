/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.empresa.peticion.PeticionInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaEliminarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaListarEmpresasDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaObtenerEmpresaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:33:40 - 20/09/2022
 *
 */
public interface IEmpresaService {
	
	public RespuestaInsertarEmpresaDTO insertarEmpresa(PeticionInsertarEmpresaDTO peticioDTO) throws AresException;
	public RespuestaEliminarEmpresaDTO eliminarEmpresa(String idEmpresa) throws AresException;
	public RespuestaObtenerEmpresaDTO obtenerEmpresaPorId(String idEmpresa) throws AresException;
	public RespuestaListarEmpresasDTO listarEmpresas() throws AresException;
}
