/**
 * 
 */
package spear.of.ares.model.dto.peticion;

import spear.of.ares.model.dto.RespuestaDTO;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:15:18 - 27/09/2022
 *
 */
public class Respuesta<Id, O> extends RespuestaDTO {

	private Id idEntity;
	private O datos;

	public Id getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(Id idEntity) {
		this.idEntity = idEntity;
	}

	public O getDatos() {
		return datos;
	}

	public void setDatos(O datos) {
		this.datos = datos;
	}
}
