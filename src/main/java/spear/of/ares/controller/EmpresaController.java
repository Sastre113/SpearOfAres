/**
 * 
 */
package spear.of.ares.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.empresa.peticion.PeticionInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaEliminarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaInsertarEmpresaDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaListarEmpresasDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaMostrarEmpleadosDTO;
import spear.of.ares.model.dto.empresa.respuesta.RespuestaObtenerEmpresaDTO;
import spear.of.ares.service.IEmpresaService;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:51:16 - 26/01/2022
 *
 */

@RestController
@RequestMapping("/gestionEmpresa")
public class EmpresaController {

	private IEmpresaService empresaService;
	
	public EmpresaController(IEmpresaService empresaService) {
		super();
		this.empresaService = empresaService;
	}
	
	@PostMapping(path = "/insertarEmpresa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaInsertarEmpresaDTO> insertarEmpresa(@RequestBody PeticionInsertarEmpresaDTO peticionDTO) {	
		try {
			return ResponseEntity.ok(this.empresaService.insertarEmpresa(peticionDTO));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaInsertarEmpresaDTO.class));
		}	 
	}
	
	@DeleteMapping(path = "/eliminarEmpresa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaEliminarEmpresaDTO> eliminarEmpresa(@RequestParam String idEmpresa) {	
		try {
			return ResponseEntity.ok(this.empresaService.eliminarEmpresa(idEmpresa));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaEliminarEmpresaDTO.class));
		}	 
	}
	
	@GetMapping(path = "/obtenerEmpresaPorId", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaObtenerEmpresaDTO> obtenerEmpresaPorId(@RequestParam String idEmpresa) {	
		try {
			return ResponseEntity.ok(this.empresaService.obtenerEmpresaPorId(idEmpresa));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaObtenerEmpresaDTO.class));
		}	 
	}
	
	@GetMapping(path = "/listarEmpresas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaListarEmpresasDTO> listarEmpresas() {	
		try {
			return ResponseEntity.ok(this.empresaService.listarEmpresas());	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaListarEmpresasDTO.class));
		}	 
	}
	
	@GetMapping(path = "/mostrarEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaMostrarEmpleadosDTO> mostrarEmpleados(@RequestParam String idEmpresa) {	
		try {
			return ResponseEntity.ok(this.empresaService.mostrarEmpleados(idEmpresa));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaMostrarEmpleadosDTO.class));
		}	 
	}
}
