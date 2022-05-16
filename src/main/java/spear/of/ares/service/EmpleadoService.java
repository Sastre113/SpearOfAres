package spear.of.ares.service;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import spear.of.ares.dao.IEmpleadoDAO;
import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.model.dto.Empleado.peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaObtenerEmpleadoDTO;
import spear.of.ares.model.entity.TbEmpleado;
import spear.of.ares.utils.AresNotificacion;
import spear.of.ares.utils.AresUtils;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:36:35 - 30/01/2022
 *
 */
@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private IEmpleadoDAO empleadoDAO;
	
	@Override
	public RespuestaInsertarEmpleadoDTO insertarEmpleado(PeticionInsertarEmpleadoDTO peticionDTO) throws AresException {
		AresUtils.validarPeticion(peticionDTO);
		
		TbEmpleado empleadoEntity = this.maptoEntity(peticionDTO.getEmpleado());
		this.empleadoDAO.save(empleadoEntity);
		
		RespuestaInsertarEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaInsertarEmpleadoDTO.class);
		respuesta.setIdEmpleado(empleadoEntity.getIdEmpleado());

		return respuesta;
	}
	
	@Override
	public RespuestaObtenerEmpleadoDTO obtenerEmpleadoPorId(String idEmpleado) throws AresException {
		
		if(!StringUtils.hasLength(idEmpleado)) {
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION);
		}
		
		RespuestaObtenerEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaObtenerEmpleadoDTO.class);
		respuesta.setEmpleadoDTO(this.mapEntityToDTO(this.empleadoDAO.findById(idEmpleado).get()));
		
		return respuesta;
	}

	@Override
	public RespuestaModificarEmpleadoDTO modificarEmpleado(PeticionModificarEmpleado peticionDTO) throws AresException {
		AresUtils.validarPeticion(peticionDTO);
		
		TbEmpleado empleadoEntity = this.empleadoDAO.findById(peticionDTO.getIdEmpleado()).get();
		EmpleadoDTO empleadoOriginal = this.mapEntityToDTO(empleadoEntity);
		
		empleadoEntity.setNombre(peticionDTO.getNombre());
		if(peticionDTO.getFechaNacimiento() != null) {
			empleadoEntity.setFechaNacimiento(peticionDTO.getFechaNacimiento());
		}
		
		this.empleadoDAO.save(empleadoEntity);
		
		
		RespuestaModificarEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaModificarEmpleadoDTO.class);
		respuesta.setEmpleadoOriginal(empleadoOriginal);
		respuesta.setEmpleadoModificado(this.mapEntityToDTO(empleadoEntity));
		
		return respuesta;
	}

	@Override
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(String idEmpleado) throws AresException {

		if(!StringUtils.hasLength(idEmpleado)) {
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION);
		}
		
		TbEmpleado empleadoEntity;
		try {
			empleadoEntity = this.empleadoDAO.findById(idEmpleado).get();
		} catch (NoSuchElementException e) {
			throw new AresException(AresNotificacion.PT_ERR_DATOS_NO_ENCONTRADOS);
		}

		this.empleadoDAO.deleteById(idEmpleado);			
		RespuestaEliminarEmpleadoDTO respuesta = AresNotificacion.OK.construir(RespuestaEliminarEmpleadoDTO.class);
		respuesta.setEmpleadoEliminado(this.mapEntityToDTO(empleadoEntity));
		
		return respuesta;
	}
	
	@Override
	public RespuestaListarEmpleadosDTO listarEmpleados() throws AresException {
		RespuestaListarEmpleadosDTO respuesta = AresNotificacion.OK.construir(RespuestaListarEmpleadosDTO.class);
		respuesta.setListaEmpleado(new ArrayList<EmpleadoDTO>());
		this.empleadoDAO.findAll().forEach(empleadoEntity -> respuesta.getListaEmpleado().add(this.mapEntityToDTO(empleadoEntity)));
		
		return respuesta;
	}

	/*
	 * 
	 * Mapeadores
	 * 
	 */

	private TbEmpleado maptoEntity(EmpleadoDTO empleadoDTO) {
		TbEmpleado empleadoEntity = new TbEmpleado();

		empleadoEntity.setIdEmpleado(UUID.randomUUID().toString());
		empleadoEntity.setDni(empleadoDTO.getDni());
		empleadoEntity.setNombre(empleadoDTO.getNombre());
		empleadoEntity.setFechaNacimiento(empleadoDTO.getFechaNacimiento());

		return empleadoEntity;
	}
	
	private EmpleadoDTO mapEntityToDTO(TbEmpleado empleadoEntity) {
		EmpleadoDTO empleadoDTO = new EmpleadoDTO();
		
		empleadoDTO.setIdEmpleado(empleadoEntity.getIdEmpleado());
		empleadoDTO.setDni(empleadoEntity.getDni());
		empleadoDTO.setFechaNacimiento(empleadoEntity.getFechaNacimiento());
		empleadoDTO.setNombre(empleadoEntity.getNombre());
		
		return empleadoDTO;
	}
}
