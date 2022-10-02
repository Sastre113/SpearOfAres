/**
 * 
 */
package spear.of.ares.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionBajaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.peticion.PeticionListarRelacionesDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaAltaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpleadoEmpresa.respuesta.RespuestaBajaEmpleadoDTO;
import spear.of.ares.service.IRelEmpresaEmpleadoService;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:37:02 - 27/09/2022
 *
 */
@RestController
@RequestMapping("/gestionRelacionEmpresaEmpleado")
public class RelEmpresaEmpleadoController {

	private IRelEmpresaEmpleadoService relEmpresaEmpleadoService;
	
	public RelEmpresaEmpleadoController(IRelEmpresaEmpleadoService relEmpresaEmpleadoService) {
		this.relEmpresaEmpleadoService = relEmpresaEmpleadoService;
	}

	@PostMapping(path = "/altaEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaAltaEmpleadoDTO> altaEmpleado(@RequestBody PeticionAltaEmpleadoDTO peticionDTO) {	
		try {
			return ResponseEntity.ok(this.relEmpresaEmpleadoService.altaEmpleado(peticionDTO));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaAltaEmpleadoDTO.class));
		}	 
	}
	
	@PostMapping(path = "/bajaEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaBajaEmpleadoDTO> bajaEmpleado(@RequestBody PeticionBajaEmpleadoDTO peticionDTO) {	
		try {
			return ResponseEntity.ok(this.relEmpresaEmpleadoService.bajaEmpleado(peticionDTO));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaBajaEmpleadoDTO.class));
		}	 
	}	
	
	@PostMapping(path = "/listarRelEmpresaEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaListarRelacionesDTO> listarRelaciones(@RequestBody PeticionListarRelacionesDTO peticionDTO) {	
		try {
			return ResponseEntity.ok(this.relEmpresaEmpleadoService.listarRelaciones(peticionDTO));	
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(RespuestaListarRelacionesDTO.class));
		}	 
	}	
	
}
