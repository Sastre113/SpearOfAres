/**
 * 
 */
package spear.of.ares.repository;

import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;

import spear.of.ares.model.entity.TbEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 21:00:25 - 14/07/2023
 *
 */
@NamedEntityGraphs({
    @NamedEntityGraph(name = "empleado-entity-graph", attributeNodes = {
        @NamedAttributeNode("relEmpresaEmpleado")
    })
})
public interface IEmpleadoRep extends JpaRepository<TbEmpleado, String>{

	@EntityGraph(value = "empleado-entity-graph", type = EntityGraphType.LOAD)
	TbEmpleado findByIdEmpleado(String idEmpleado);
}
