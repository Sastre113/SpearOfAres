package spear.of.ares.controller;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.model.dto.categoria.AbstractCategoriaDTO;
import spear.of.ares.model.dto.categoria.peticion.PeticionMapearCategoria;
import spear.of.ares.model.dto.categoria.respuesta.RespuestaMapearCategoria;
import spear.of.ares.service.ICategoriaService;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:38:34 - 12/05/2022
 *
 */
@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

	private ICategoriaService categoriaService;
	
	public CategoriaController(ICategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@SuppressWarnings("unchecked")
	@PostMapping(path = "/analista")
	public <T extends AbstractCategoriaDTO> ResponseEntity<RespuestaMapearCategoria<T>> mapearAnalista(RequestEntity<PeticionMapearCategoria<T>> peticionDTO) {
		return ResponseEntity.ok(this.categoriaService.mapearCategoria(peticionDTO));
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(path = "/junior")
	public <T extends AbstractCategoriaDTO> ResponseEntity<RespuestaMapearCategoria<T>> mapearJunior(RequestEntity<PeticionMapearCategoria<T>> peticionDTO) {
		return ResponseEntity.ok(this.categoriaService.mapearCategoria(peticionDTO));
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(path = "/senior")
	public <T extends AbstractCategoriaDTO> ResponseEntity<RespuestaMapearCategoria<T>> mapearSenior(RequestEntity<PeticionMapearCategoria<T>> peticionDTO) {
		return ResponseEntity.ok(this.categoriaService.mapearCategoria(peticionDTO));
	}

	
}
