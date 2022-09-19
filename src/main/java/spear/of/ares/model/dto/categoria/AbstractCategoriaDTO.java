package spear.of.ares.model.dto.categoria;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:11:31 - 12/05/2022
 *
 */
public abstract class AbstractCategoriaDTO {

	private int id;
	private String nombre;
	private int nivel;
	private Double salarioBase;
	private Double salarioComplemento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioComplemento() {
		return salarioComplemento;
	}

	public void setSalarioComplemento(Double salarioComplemento) {
		this.salarioComplemento = salarioComplemento;
	}

}
