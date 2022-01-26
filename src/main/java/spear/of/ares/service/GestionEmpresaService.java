package spear.of.ares.service;

import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaObtenerEmpleadoDTO;

public class GestionEmpresaService implements IGestionEmpresaService {

	@Override
	public PeticionInsertarEmpleadoDTO insertarEmpleado(PeticionInsertarEmpleadoDTO peticionDTO) {
		// TODO Auto-generated method stub
		return peticionDTO;
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
	public RespuestaObtenerEmpleadoDTO obtenerEmpleadoPorId(String idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(String idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

}
