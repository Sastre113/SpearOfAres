/**
 * 
 */
package spear.of.ares.dao;

import org.springframework.data.repository.CrudRepository;

import spear.of.ares.model.entity.TbRelEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:48:40 - 02/10/2022
 *
 */
public interface IRelEmpresaEmpleadoDAO extends CrudRepository<TbRelEmpresaEmpleado, String> {

}
