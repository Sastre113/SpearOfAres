/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.controller.RespuestaListarRelacionesDTO;
import spear.of.ares.dao.IRelEmpresaEmpleadoDAO;
import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionBajaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionListarRelacionesDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaBajaEmpleadoDTO;
import spear.of.ares.model.entity.TbRelEmpresaEmpleado;
import spear.of.ares.utils.AresUtils;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:44:03 - 02/10/2022
 *
 */
public class RelEmpresaEmpleadosService implements IRelEmpresaEmpleadoService {

	private IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO;
	
	public RelEmpresaEmpleadosService(IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO) {
		super();
		this.relEmpresaEmpleadoDAO = relEmpresaEmpleadoDAO;
	}

	@Override
	public RespuestaAltaEmpleadoDTO altaEmpleado(PeticionAltaEmpleadoDTO peticionDTO) throws AresException {
		// TODO Auto-generated method stub
		AresUtils.validarPeticion(peticionDTO);
		
		
		TbRelEmpresaEmpleado relacionEntity = new TbRelEmpresaEmpleado();
		this.relEmpresaEmpleadoDAO.save(relacionEntity);
		RespuestaAltaEmpleadoDTO respuesta = new RespuestaAltaEmpleadoDTO();
		
		
		return respuesta;
	}

	@Override
	public RespuestaBajaEmpleadoDTO bajaEmpleado(PeticionBajaEmpleadoDTO peticionDTO) throws AresException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaListarRelacionesDTO listarRelaciones(PeticionListarRelacionesDTO peticionDTO) throws AresException {
		// TODO Auto-generated method stub
		return null;
	}

}
