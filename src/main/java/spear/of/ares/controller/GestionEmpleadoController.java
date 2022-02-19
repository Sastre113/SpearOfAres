package spear.of.ares.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.excepcion.FeignClientTesterExceptionHandler;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.Respuesta.RespuestaObtenerEmpleadoDTO;
import spear.of.ares.service.IGestionEmpresaService;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:49:34 - 30/01/2022
 *
 */

@RestController
@RequestMapping(value = "/gestionEmpleado")
public class GestionEmpleadoController {

	@Autowired
	private IGestionEmpresaService gestionEmpresaService;

	@PostMapping(path = "/insertarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaInsertarEmpleadoDTO> insertarEmpleado(RequestEntity<PeticionInsertarEmpleadoDTO> peticionDTO) {	
		try {
			return ResponseEntity.ok(this.gestionEmpresaService.insertarEmpleado(peticionDTO.getBody()));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaInsertarEmpleadoDTO.class));
		}	 
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
	public ResponseEntity<RespuestaObtenerEmpleadoDTO> obtenerEmpleadoPorId(@RequestParam String idEmpleado) {
		try {
			return ResponseEntity.ok(this.gestionEmpresaService.obtenerEmpleadoPorId(idEmpleado));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaObtenerEmpleadoDTO.class));
		}
	}

	@GetMapping(path = "/eliminarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaEliminarEmpleadoDTO eliminarEmpleado(@RequestParam String idEmpleado) {
		return this.gestionEmpresaService.eliminarEmpleado(idEmpleado);
	}

}
