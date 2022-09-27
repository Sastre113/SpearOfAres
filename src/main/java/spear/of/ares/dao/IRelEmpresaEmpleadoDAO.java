/**
 * 
 */
package spear.of.ares.dao;

import org.springframework.data.repository.CrudRepository;

import spear.of.ares.model.entity.TbRelEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:26:45 - 27/09/2022
 *
 */
public interface IRelEmpresaEmpleadoDAO extends CrudRepository<TbRelEmpresaEmpleado, String> {

}
