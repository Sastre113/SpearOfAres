package spear.of.ares.dao;

import org.springframework.data.repository.CrudRepository;

import spear.of.ares.model.entity.TbEmpleado;

/** 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:22:32 - 28/09/2022
 */
public interface IEmpleadoDAO extends CrudRepository<TbEmpleado, String> {

}
