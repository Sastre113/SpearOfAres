/**
 * 
 */
package spear.of.ares.model.dto.categoria.peticion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:27:43 - 16/05/2022
 *
 */
public abstract class AbstractPuestoDTO {

	private String nombre;
	private int nivel;
	private Double salarioBase;
	private Double salarioComplemento;

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
