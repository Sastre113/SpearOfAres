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
import spear.of.ares.model.dto.peticion.Peticion;
import spear.of.ares.model.dto.peticion.Respuesta;
import spear.of.ares.model.dto.relEmpresaEmpleado.RelEmpresaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpresaEmpleado.RespuestaRelEmpresaEmpleadoDTO;
import spear.of.ares.service.IRelEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:37:02 - 27/09/2022
 *
 */
@RestController
@RequestMapping("/gestionRelacionEmpresaEmpleado")
public class RelEmpresaEmpleadoController {

	private IRelEmpresaEmpleado relEmpresaEmpleadoService;

	public RelEmpresaEmpleadoController(IRelEmpresaEmpleado relEmpresaEmpleadoService) {
		super();
		this.relEmpresaEmpleadoService = relEmpresaEmpleadoService;
	}
	
	
	@PostMapping(path = "/insertarEmpresa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Respuesta<String, RespuestaRelEmpresaEmpleadoDTO>> insertarEmpresa(@RequestBody Peticion<String, RelEmpresaEmpleadoDTO> peticionDTO) {	
		try {
			return ResponseEntity.ok(this.relEmpresaEmpleadoService.insertar(peticionDTO));
		} catch (AresException e) {
			return ResponseEntity.status(e.getHttpStatus()).body(e.mapError(Respuesta.class));
		}	 
	}
}
