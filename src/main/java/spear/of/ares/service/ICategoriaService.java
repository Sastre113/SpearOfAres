/**
 * 
 */
package spear.of.ares.service;

import org.springframework.http.RequestEntity;

import spear.of.ares.model.dto.categoria.AbstractCategoriaDTO;
import spear.of.ares.model.dto.categoria.peticion.PeticionMapearCategoria;
import spear.of.ares.model.dto.categoria.respuesta.RespuestaMapearCategoria;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:45:39 - 12/05/2022
 *
 */
public interface ICategoriaService {
	// public <T extends AbstractCategoriaDTO> RespuestaMapearCategoria mapearCategoria(RequestEntity<PeticionMapearCategoria<T>> peticionDTO);
}
