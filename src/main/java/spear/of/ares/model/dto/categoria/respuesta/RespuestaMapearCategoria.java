/**
 * 
 */
package spear.of.ares.model.dto.categoria.respuesta;

import spear.of.ares.model.dto.categoria.AbstractCategoriaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:46:18 - 12/05/2022
 *
 */
public class RespuestaMapearCategoria<T extends AbstractCategoriaDTO> {

	private String id;
	private T objetoMapeado;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public T getObjetoMapeado() {
		return objetoMapeado;
	}

	public void setObjetoMapeado(T objetoMapeado) {
		this.objetoMapeado = objetoMapeado;
	}
}
