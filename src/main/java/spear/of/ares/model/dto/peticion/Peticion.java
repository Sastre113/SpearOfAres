/**
 * 
 */
package spear.of.ares.model.dto.peticion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:30:53 - 27/09/2022
 *
 */
public class Peticion<Id, O> {

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
