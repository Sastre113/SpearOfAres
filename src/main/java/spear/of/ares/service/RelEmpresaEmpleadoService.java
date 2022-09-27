/**
 * 
 */
package spear.of.ares.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import spear.of.ares.dao.IEmpleadoDAO;
import spear.of.ares.dao.IRelEmpresaEmpleadoDAO;
import spear.of.ares.model.dto.peticion.Peticion;
import spear.of.ares.model.dto.peticion.Respuesta;
import spear.of.ares.model.dto.relEmpresaEmpleado.RelEmpresaEmpleadoDTO;
import spear.of.ares.model.dto.relEmpresaEmpleado.RespuestaRelEmpresaEmpleadoDTO;
import spear.of.ares.model.entity.TbRelEmpresaEmpleado;
import spear.of.ares.repository.IEmpresaRepository;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:11:12 - 27/09/2022
 * @param <O>
 * @param <T>
 * @param <R>
 *
 */
@Service("relEmpresaEmpleadoService")
public class RelEmpresaEmpleadoService implements Crud<String, RelEmpresaEmpleadoDTO, RespuestaRelEmpresaEmpleadoDTO> {

	private IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO;
	private IEmpleadoDAO empleadoDAO;
	private IEmpresaRepository empresaRepository;
	
	public RelEmpresaEmpleadoService(IRelEmpresaEmpleadoDAO relEmpresaEmpleadoDAO, IEmpleadoDAO empleadoDAO,
			IEmpresaRepository empresaRepository) {
		super();
		this.relEmpresaEmpleadoDAO = relEmpresaEmpleadoDAO;
		this.empleadoDAO = empleadoDAO;
		this.empresaRepository = empresaRepository;
	}

	@Override
	public Respuesta<String, RespuestaRelEmpresaEmpleadoDTO> insertar(Peticion<String, RelEmpresaEmpleadoDTO> peticion) {
		// TODO Auto-generated method stub
		
		
		TbRelEmpresaEmpleado entity = new TbRelEmpresaEmpleado();
		entity.setIdRelacion(UUID.randomUUID().toString());
		entity.setTipoPuesto(peticion.getDatos().getTipoPuesto());
		entity.setFechaAlta(new Date());
		entity.setEmpresa(this.empresaRepository.getById(peticion.getDatos().getIdEmpresa()));
		entity.setEmpleado(this.empleadoDAO.findById(peticion.getDatos().getIdEmpleado()).orElseThrow());
		
		this.relEmpresaEmpleadoDAO.save(entity);
		
		return null;
	}

	@Override
	public Respuesta<String, RespuestaRelEmpresaEmpleadoDTO> obtener(Peticion<String, RelEmpresaEmpleadoDTO> peticion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta<String, RespuestaRelEmpresaEmpleadoDTO> modificar(Peticion<String, RelEmpresaEmpleadoDTO> peticion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta<String, RespuestaRelEmpresaEmpleadoDTO> borrar(Peticion<String, RelEmpresaEmpleadoDTO> peticion) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
