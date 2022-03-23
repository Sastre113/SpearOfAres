package spear.of.ares.service;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaObtenerEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;

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
