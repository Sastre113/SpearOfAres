package spear.of.ares.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.RespuestaObtenerEmpleadoDTO;
import spear.of.ares.service.IGestionEmpresaService;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com> Creado 22:24:42 - 26/01/2022
 *
 */

@RestController
@RequestMapping(value = "/gestionEmpleado")
public class GestionEmpleadoController {

	@Autowired
	private IGestionEmpresaService gestionEmpresaService;

	/*
	 * TODO: Capturar excepciones
	 */
	@PostMapping(path = "/insertarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public PeticionInsertarEmpleadoDTO insertarEmpleado(@RequestBody PeticionInsertarEmpleadoDTO peticionDTO) {
		return this.gestionEmpresaService.insertarEmpleado(peticionDTO);
	}

	@PostMapping(path = "/modificarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaModificarEmpleadoDTO modificarEmpleado(@RequestBody PeticionModificarEmpleado peticionDTO) {
		return this.gestionEmpresaService.modificarEmpleado(peticionDTO);
	}

	@GetMapping(path = "/listarEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaListarEmpleadosDTO listarEmpleados() {
		return this.gestionEmpresaService.listarEmpleados();
	}

	@GetMapping(path = "/obtenerEmpleadoPorId", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaObtenerEmpleadoDTO obtenerEmpleadoPorId(@RequestParam String idEmpleado) {
		return this.gestionEmpresaService.obtenerEmpleadoPorId(idEmpleado);
	}

	@GetMapping(path = "/eliminarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(@RequestParam String idEmpleado) {
		return this.gestionEmpresaService.eliminarEmpleado(idEmpleado);
	}

}
