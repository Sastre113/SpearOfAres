/**
 * 
 */
package spear.of.ares.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import spear.of.ares.controller.RespuestaListarRelacionesDTO;
import spear.of.ares.dao.IEmpleadoDAO;
import spear.of.ares.dao.IRelEmpresaEmpleadoDAO;
import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.relEmpleadoEmpresa.RelacionDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionListarRelacionesDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaBajaEmpleadoDTO;
import spear.of.ares.model.entity.TbRelEmpresaEmpleado;
import spear.of.ares.repository.IEmpresaRepository;
import spear.of.ares.utils.AresNotificacion;
import spear.of.ares.utils.AresUtils;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:44:03 - 02/10/2022
 *
 */
@Service("GestionRelEmpresaEmpleadoService")
public class RelEmpresaEmpleadosService implements IRelEmpresaEmpleadoService {

	private IEmpleadoDAO empleadoDAO;
	private IEmpresaRepository empresaRepository;
	private IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO;

	public RelEmpresaEmpleadosService(IEmpleadoDAO empleadoDAO, IEmpresaRepository empresaRepository,
			IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO) {
		super();
		this.empleadoDAO = empleadoDAO;
		this.empresaRepository = empresaRepository;
		this.relEmpresaEmpleadoDAO = relEmpresaEmpleadoDAO;
	}


	@Override
	public RespuestaAltaEmpleadoDTO altaEmpleado(PeticionAltaEmpleadoDTO peticionDTO) throws AresException {
		AresUtils.validarPeticion(peticionDTO);
		
		TbRelEmpresaEmpleado relacionEntity = new TbRelEmpresaEmpleado();
		relacionEntity.setEmpleado(this.empleadoDAO.findById(peticionDTO.getIdEmpleado()).orElseThrow());
		relacionEntity.setEmpresa(this.empresaRepository.findById(peticionDTO.getIdEmpresa()).orElseThrow());
		relacionEntity.setIdRelacion(UUID.randomUUID().toString());
		relacionEntity.setTipoPuesto(peticionDTO.getTipoPuesto());
		relacionEntity.setFechaAlta(new Date());
		this.relEmpresaEmpleadoDAO.save(relacionEntity);
		
		RespuestaAltaEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaAltaEmpleadoDTO.class);
		respuesta.setRelacion(this.mapEntityToDTO(relacionEntity));
		return respuesta;
	}


	@Override
	public RespuestaBajaEmpleadoDTO bajaEmpleado(String idRelacion) throws AresException {
		TbRelEmpresaEmpleado relacionEntity = this.relEmpresaEmpleadoDAO.findById(idRelacion).orElseThrow();
		relacionEntity.setFechaBaja(new Date());
		this.relEmpresaEmpleadoDAO.save(relacionEntity);
		
		
		RespuestaBajaEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaBajaEmpleadoDTO.class);
		respuesta.setRelacion(this.mapEntityToDTO(relacionEntity));
		return respuesta;
	}

	@Override
	public RespuestaListarRelacionesDTO listarRelaciones(PeticionListarRelacionesDTO peticionDTO) throws AresException {
		/*
		RespuestaListarRelacionesDTO respuesta = AresNotificacion.OK.construir(RespuestaListarRelacionesDTO.class);
		listaResultado.forEach(relacionEntity -> respuesta.getListaRelacion().add(this.mapEntityToDTO(relacionEntity)));
		return respuesta;
		*/
	}
	
	

	private RelacionDTO mapEntityToDTO(TbRelEmpresaEmpleado relacionEntity) {
		RelacionDTO relacion = new RelacionDTO();
		relacion.setIdRelacion(relacionEntity.getIdRelacion());
		relacion.setIdEmpresa(relacionEntity.getEmpresa().getIdEmpresa());
		relacion.setIdEmpleado(relacionEntity.getEmpleado().getIdEmpleado());
		relacion.setTipoPuesto(relacionEntity.getTipoPuesto());
		relacion.setFechaAlta(relacionEntity.getFechaAlta());
		relacion.setFechaBaja(relacionEntity.getFechaBaja());
		
		return relacion;
	}

}
