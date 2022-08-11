package spear.of.ares.service;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.Empleado.peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaObtenerEmpleadoDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:36:28 - 30/01/2022
 *
 */
public interface IEmpleadoService {

	public RespuestaInsertarEmpleadoDTO insertarEmpleado(PeticionInsertarEmpleadoDTO peticionDTO) throws AresException;
	public RespuestaModificarEmpleadoDTO modificarEmpleado(PeticionModificarEmpleado peticionDTO) throws AresException;
	public RespuestaObtenerEmpleadoDTO obtenerEmpleadoPorId(String idEmpleado) throws AresException;
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(String idEmpleado) throws AresException;
	public RespuestaListarEmpleadosDTO listarEmpleados() throws AresException;

}
