/**
 * 
 */
package spear.of.ares.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.empresa.EmpresaDTO;
import spear.of.ares.model.dto.empresa.peticion.PeticionInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaListarEmpresasDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaObtenerEmpresaDTO;
import spear.of.ares.model.entity.TbEmpresa;
import spear.of.ares.repository.IEmpresaRepository;
import spear.of.ares.utils.AresNotificacion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:56:34 - 20/09/2022
 *
 */
@Service("EmpresaService")
public class EmpresaService implements IEmpresaService {

	private IEmpresaRepository empresaRepository;
	
	public EmpresaService(IEmpresaRepository empresaRepository) {
		super();
		this.empresaRepository = empresaRepository;
	}

	@Override
	public RespuestaInsertarEmpresaDTO insertarEmpresa(PeticionInsertarEmpresaDTO peticioDTO) throws AresException {
		// TODO Auto-generated method stub
		throw new AresException(new UnsupportedOperationException());
	}

	@Override
	public RespuestaEliminarEmpresaDTO eliminarEmpresa(String idEmpresa) throws AresException {
		// TODO Auto-generated method stub
		
		throw new AresException(new UnsupportedOperationException());
	}

	@Override
	public RespuestaObtenerEmpresaDTO obtenerEmpresaPorId(String idEmpresa) throws AresException {
		// TODO Auto-generated method stub
		if(!StringUtils.hasLength(idEmpresa)) {
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION);
		}
		
		Optional<TbEmpresa> empresaEntity = this.empresaRepository.findById(idEmpresa);
		
		
		RespuestaObtenerEmpresaDTO respuesta = new RespuestaObtenerEmpresaDTO();
		if(empresaEntity.isPresent()) {
			
			EmpresaDTO empresaDTO = this.mapToDTO(empresaEntity.get());
			respuesta.setEmpresa(empresaDTO);			
		}
		
		return respuesta;
	}

	@Override
	public RespuestaListarEmpresasDTO listarEmpresas() throws AresException {
		// TODO Auto-generated method stub
		throw new AresException(new UnsupportedOperationException());
	}


	private EmpresaDTO mapToDTO(TbEmpresa empresaEntity) {
		// TODO Auto-generated method stub
		EmpresaDTO empresaDTO = new EmpresaDTO();
		empresaDTO.setIdEmpresa(empresaEntity.getIdEmpresa());
		empresaDTO.setNombre(empresaEntity.getNombre());
		empresaDTO.setPropietario(empresaEntity.getPropietario());
		empresaDTO.setCantidadEmpleados(empresaEntity.getCantidadEmpleados());
		/*empresaDTO.setFechaCreacion(null);
		empresaDTO.setFechaDesaparicion(null);
		*/
		
		return empresaDTO;
	}
}
