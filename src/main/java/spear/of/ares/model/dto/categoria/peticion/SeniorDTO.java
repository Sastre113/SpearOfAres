/**
 * 
 */
package spear.of.ares.model.dto.categoria.peticion;

import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:29:09 - 16/05/2022
 *
 */
public class SeniorDTO extends AbstractPuestoDTO {

	private int tiempoExperiencia;
	private Double salarioBono;
	private List<String> conocimientos;

	public int getTiempoExperiencia() {
		return tiempoExperiencia;
	}

	public void setTiempoExperiencia(int tiempoExperiencia) {
		this.tiempoExperiencia = tiempoExperiencia;
	}

	public Double getSalarioBono() {
		return salarioBono;
	}

	public void setSalarioBono(Double salarioBono) {
		this.salarioBono = salarioBono;
	}

	public List<String> getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(List<String> conocimientos) {
		this.conocimientos = conocimientos;
	}

}
