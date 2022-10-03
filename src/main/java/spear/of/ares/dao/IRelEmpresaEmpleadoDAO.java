/**
 * 
 */
package spear.of.ares.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spear.of.ares.model.entity.TbRelEmpresaEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:48:40 - 02/10/2022
 *
 */
public interface IRelEmpresaEmpleadoDAO extends JpaRepository<TbRelEmpresaEmpleado, String> {
	
	@Query(" FROM TbRelEmpresaEmpleado "
		+ " WHERE idRelacion = :idRelacion"
		+ " OR empresa.idEmpresa = :idEmpresa")
	public List<TbRelEmpresaEmpleado> getRelaciones(String idRelacion, String idEmpresa);
}
