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

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.Empleado.peticion.PeticionInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.peticion.PeticionModificarEmpleado;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaEliminarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaInsertarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaListarEmpleadosDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaModificarEmpleadoDTO;
import spear.of.ares.model.dto.Empleado.respuesta.RespuestaObtenerEmpleadoDTO;
import spear.of.ares.service.IEmpleadoService;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:49:34 - 30/01/2022
 *
 */

@RestController
@RequestMapping(value = "/gestionEmpleado")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService gestionEmpleadoService;
	
	@PostMapping(path = "/insertarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaInsertarEmpleadoDTO> insertarEmpleado(RequestEntity<PeticionInsertarEmpleadoDTO> peticionDTO) {	
		try {
			return ResponseEntity.ok(this.gestionEmpleadoService.insertarEmpleado(peticionDTO.getBody()));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaInsertarEmpleadoDTO.class));
		}	 
	}

	@PostMapping(path = "/modificarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaModificarEmpleadoDTO> modificarEmpleado(@RequestBody PeticionModificarEmpleado peticionDTO) {
		try {
			return ResponseEntity.ok(this.gestionEmpleadoService.modificarEmpleado(peticionDTO));
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaModificarEmpleadoDTO.class));
		}
	}

	@GetMapping(path = "/obtenerEmpleadoPorId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaObtenerEmpleadoDTO> obtenerEmpleadoPorId(@RequestParam String idEmpleado) {
		try {
			return ResponseEntity.ok(this.gestionEmpleadoService.obtenerEmpleadoPorId(idEmpleado));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaObtenerEmpleadoDTO.class));
		}
	}

	@GetMapping(path = "/eliminarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaEliminarEmpleadoDTO> eliminarEmpleado(@RequestParam String idEmpleado) {
		try {
			return ResponseEntity.ok(this.gestionEmpleadoService.eliminarEmpleado(idEmpleado));
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaEliminarEmpleadoDTO.class));
		}
	}
	
	@GetMapping(path = "/listarEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaListarEmpleadosDTO> listarEmpleados() {
		try {
			return  ResponseEntity.ok(this.gestionEmpleadoService.listarEmpleados());
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaListarEmpleadosDTO.class));
		}
	}

}
