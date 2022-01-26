package spear.of.ares.service;

import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaObtenerEmpleadoDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 *
 */
public interface IGestionEmpresaService {

	public PeticionInsertarEmpleadoDTO insertarEmpleado(PeticionInsertarEmpleadoDTO peticionDTO);
	public RespuestaModificarEmpleadoDTO modificarEmpleado(PeticionModificarEmpleado peticionDTO);
	public RespuestaListarEmpleadosDTO listarEmpleados();
	public RespuestaObtenerEmpleadoDTO obtenerEmpleadoPorId(String idEmpleado);
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(String idEmpleado);

}
