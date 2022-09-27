/**
 * 
 */
package spear.of.ares.service;

import spear.of.ares.model.dto.peticion.Peticion;
import spear.of.ares.model.dto.peticion.Respuesta;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:24:15 - 27/09/2022
 *
 */
public interface Crud<Id,Obj,R> {
	
	public Respuesta<Id, R> insertar(Peticion<Id,Obj> peticion);
	public Respuesta<Id, R> obtener(Peticion<Id,Obj> peticion);
	public Respuesta<Id, R> modificar(Peticion<Id,Obj> peticion);
	public Respuesta<Id, R> borrar(Peticion<Id,Obj> peticion );
	
}
