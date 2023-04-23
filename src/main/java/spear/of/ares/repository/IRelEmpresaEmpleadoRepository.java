/**
 * 
 */
package spear.of.ares.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spear.of.ares.model.entity.TbRelEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:48:40 - 02/10/2022
 *
 */
public interface IRelEmpresaEmpleadoRepository extends JpaRepository<TbRelEmpresaEmpleado, String> {

}
