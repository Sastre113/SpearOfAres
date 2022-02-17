package spear.of.ares.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import spear.of.ares.dao.IEmpleadoDAO;
import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaObtenerEmpleadoDTO;
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
public class GestionEmpresaService implements IGestionEmpresaService {

	@Autowired
	private IEmpleadoDAO empleadoDAO;
	
	@Override
	public RespuestaInsertarEmpleadoDTO insertarEmpleado(PeticionInsertarEmpleadoDTO peticionDTO) throws AresException {
		AresUtils.validarPeticion(peticionDTO);
		
		TbEmpleado empleadoEntity = this.maptoEntity(peticionDTO);
		
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
	public RespuestaModificarEmpleadoDTO modificarEmpleado(PeticionModificarEmpleado peticionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaListarEmpleadosDTO listarEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(String idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 
	 * Mapeadores
	 * 
	 */

	private TbEmpleado maptoEntity(PeticionInsertarEmpleadoDTO peticionDTO) {
		TbEmpleado empleadoEntity = new TbEmpleado();

		empleadoEntity.setIdEmpleado(UUID.randomUUID().toString());
		empleadoEntity.setDni(peticionDTO.getEmpleado().getDni());
		empleadoEntity.setNombre(peticionDTO.getEmpleado().getNombre());
		empleadoEntity.setFechaNacimiento(peticionDTO.getEmpleado().getFechaNacimiento());

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
