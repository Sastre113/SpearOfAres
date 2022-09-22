/**
 * 
 */
package spear.of.ares.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
import spear.of.ares.utils.AresUtils;

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
		AresUtils.validarPeticion(peticioDTO);
		TbEmpresa empresaEntity = new TbEmpresa();
		empresaEntity.setIdEmpresa(UUID.randomUUID().toString());
		empresaEntity.setNombre(peticioDTO.getNombre());
		empresaEntity.setPropietario(peticioDTO.getPropietario());
		empresaEntity.setCantidadEmpleados(peticioDTO.getCantidadEmpleados());
		empresaEntity.setFechaCreacion(new Date());
		
		this.empresaRepository.save(empresaEntity);
		
		RespuestaInsertarEmpresaDTO respuesta = AresNotificacion.OK.construir(RespuestaInsertarEmpresaDTO.class);
		respuesta.setEmpresa(empresaEntity);
		
		return respuesta;
	}

	@Override
	public RespuestaEliminarEmpresaDTO eliminarEmpresa(String idEmpresa) throws AresException {
		if(!StringUtils.hasLength(idEmpresa)) {
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION, "Se debe indicar idEmpresa");
		}
		
		Optional<TbEmpresa> optEmpresaEntity = this.empresaRepository.findById(idEmpresa);
		this.empresaRepository.delete(optEmpresaEntity.orElseThrow());

		RespuestaEliminarEmpresaDTO respuesta = AresNotificacion.OK.construir(RespuestaEliminarEmpresaDTO.class);		
		return respuesta;
	}

	@Override
	public RespuestaObtenerEmpresaDTO obtenerEmpresaPorId(String idEmpresa) throws AresException {
		if(!StringUtils.hasLength(idEmpresa)) {
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION);
		}
		
		Optional<TbEmpresa> empresaEntity = this.empresaRepository.findById(idEmpresa);
		RespuestaObtenerEmpresaDTO respuesta = AresNotificacion.OK.construir(RespuestaObtenerEmpresaDTO.class);
		respuesta.setEmpresa(this.mapEntityToDTO(empresaEntity.orElseThrow()));

		return respuesta;
	}

	@Override
	public RespuestaListarEmpresasDTO listarEmpresas() throws AresException {
		List<EmpresaDTO> listaEmpresa = new ArrayList<>();
		this.empresaRepository.findAll().forEach(empresaEntity -> listaEmpresa.add(this.mapEntityToDTO(empresaEntity)));
		RespuestaListarEmpresasDTO respuesta =  AresNotificacion.OK.construir(RespuestaListarEmpresasDTO.class);
		respuesta.setListaEmpresa(listaEmpresa);
		
		return respuesta;
	}


	private EmpresaDTO mapEntityToDTO(TbEmpresa empresaEntity) {
		EmpresaDTO empresaDTO = new EmpresaDTO();
		empresaDTO.setIdEmpresa(empresaEntity.getIdEmpresa());
		empresaDTO.setNombre(empresaEntity.getNombre());
		empresaDTO.setPropietario(empresaEntity.getPropietario());
		empresaDTO.setCantidadEmpleados(empresaEntity.getCantidadEmpleados());
		empresaDTO.setFechaCreacion(AresUtils.convertirDateToLocalTime(empresaEntity.getFechaCreacion()));
		empresaDTO.setFechaDesaparicion(AresUtils.convertirDateToLocalTime(empresaEntity.getFechaDesaparacion()));

		return empresaDTO;
	}
	
	private TbEmpresa mapDtoToEntity(EmpresaDTO empresaDTO) {
		TbEmpresa empresaEntity = new TbEmpresa();
		empresaEntity.setIdEmpresa(empresaDTO.getIdEmpresa());
		empresaEntity.setNombre(empresaDTO.getNombre());
		empresaEntity.setPropietario(empresaDTO.getPropietario());
		empresaEntity.setCantidadEmpleados(empresaDTO.getCantidadEmpleados());
		empresaEntity.setFechaCreacion(AresUtils.convertirLocalTimeToDate(empresaDTO.getFechaCreacion()));
		empresaEntity.setFechaDesaparacion(AresUtils.convertirLocalTimeToDate(empresaDTO.getFechaDesaparicion()));

		return empresaEntity;
	}
}
