package spear.of.ares.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.dao.IEmpleadoDAO;
import spear.of.ares.dao.IEmpresaDAO;
import spear.of.ares.model.entity.TbEmpleado;

@RestController
@RequestMapping(value="/gestionEmpresas")
public class GestionEmpresaController {

	IEmpleadoDAO empleadoDAO;
	IEmpresaDAO empresaDAO;
	
	
	public GestionEmpresaController(IEmpleadoDAO empleadoDAO, IEmpresaDAO empresaDAO) {
		this.empleadoDAO = empleadoDAO;
		this.empresaDAO = empresaDAO;
	}


	@PostMapping(path = "/insertarEmpleado", produces = MediaType.APPLICATION_JSON_VALUE)
	public TbEmpleado insertarEmpleado(@RequestBody  TbEmpleado nuevoEmpleado) {
		
		nuevoEmpleado.setIdEmpleado(UUID.randomUUID().toString());
		this.empleadoDAO.save(nuevoEmpleado);
		
		return nuevoEmpleado;
	}
	

	@GetMapping(path = "/getEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TbEmpleado> getEmpleados() {
		return (List<TbEmpleado>) this.empleadoDAO.findAll();
	}
}
