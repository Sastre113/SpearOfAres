/**
 * 
 */
package spear.of.ares.model.dto.categoria.peticion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:29:37 - 16/05/2022
 *
 */
public class AnalistaDTO extends AbstractPuestoDTO {

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
