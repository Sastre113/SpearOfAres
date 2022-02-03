package spear.of.ares;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.model.dto.RespuestaDTO;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:43:03 - 03/02/2022
 *
 */
public final class AresUtils {

	protected <T extends RespuestaDTO> T construirRespuesta(String codigo, String msg, Class<T> objetoRespuesta) {
		RespuestaDTO respuesta = new RespuestaDTO();

		return null;
	}

	public static <T> void validarPeticion(T peticionDTO) throws AresException {
		Set<ConstraintViolation<T>> errores = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(peticionDTO);

		if (!errores.isEmpty()) {
			StringBuilder msgError = new StringBuilder("Bad Request: ");
			errores.forEach(constraintVioltation -> msgError.append(String.format("{%s: %s}",
					constraintVioltation.getPropertyPath(), constraintVioltation.getMessage())));
			
			throw new AresException("400", msgError.toString());
		}

	}
}