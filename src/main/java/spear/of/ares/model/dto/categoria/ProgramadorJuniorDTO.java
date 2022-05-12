package spear.of.ares.model.dto.categoria;

import java.util.List;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:11:27 - 12/05/2022
 *
 */
public class ProgramadorJuniorDTO extends AbstractCategoriaDTO {

	private String estudios;
	private String[] intereses;
	private List<String> habilidades;

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String[] getIntereses() {
		return intereses;
	}

	public void setIntereses(String[] intereses) {
		this.intereses = intereses;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}
}
