/**
 * 
 */
package spear.of.ares.model.dto;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22:35:02 - 17/02/2022
 *
 */
public class HttpResponse extends RespuestaDTO {
	
	private String code;
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
