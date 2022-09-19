package spear.of.ares.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spear.of.ares.model.entity.TbEmpresa;

@Repository
public interface IEmpresaRepository extends JpaRepository<TbEmpresa, String> {

	public List<TbEmpresa> findAll();
	public Optional<TbEmpresa> findById(String idEmpresa);
}
