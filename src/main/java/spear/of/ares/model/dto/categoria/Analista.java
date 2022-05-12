/**
 * 
 */
package spear.of.ares.model.dto.categoria;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:11:49 - 12/05/2022
 *
 */
public class Analista extends AbstractCategoriaDTO {

	private String tipoAnalista;
	private String especialidad;
	private Boolean baseDatosRelacional;
	private Boolean baseDatosNoRelacional;

	public String getTipoAnalista() {
		return tipoAnalista;
	}

	public void setTipoAnalista(String tipoAnalista) {
		this.tipoAnalista = tipoAnalista;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Boolean getBaseDatosRelacional() {
		return baseDatosRelacional;
	}

	public void setBaseDatosRelacional(Boolean baseDatosRelacional) {
		this.baseDatosRelacional = baseDatosRelacional;
	}

	public Boolean getBaseDatosNoRelacional() {
		return baseDatosNoRelacional;
	}

	public void setBaseDatosNoRelacional(Boolean baseDatosNoRelacional) {
		this.baseDatosNoRelacional = baseDatosNoRelacional;
	}
}
