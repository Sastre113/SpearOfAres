package spear.of.ares.dao;

import org.springframework.data.repository.CrudRepository;

import spear.of.ares.model.entity.TbEmpleado;

public interface IEmpleadoDAO extends CrudRepository<TbEmpleado, String> {

}
