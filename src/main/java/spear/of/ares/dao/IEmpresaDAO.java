package spear.of.ares.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spear.of.ares.model.entity.TbEmpresa;

@Repository
public interface IEmpresaDAO extends JpaRepository<TbEmpresa, String> {

	List<TbEmpresa> findAll();
	Optional<TbEmpresa> findById(String idEmpresa);
}
