package spear.of.ares.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import spear.of.ares.excepcion.AresException;
/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:43:03 - 03/02/2022
 *
 */
public final class AresUtils {

	public static <T> void validarPeticion(T peticionDTO) throws AresException {
		Set<ConstraintViolation<T>> errores = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(peticionDTO);
		
		if (!errores.isEmpty()) {
			StringBuilder msgError = new StringBuilder("");
			errores.forEach(constraintVioltation -> msgError.append(String.format("{%s: %s}",
					constraintVioltation.getPropertyPath(), constraintVioltation.getMessage())));
			
			throw new AresException(AresNotificacion.PT_ERR_VALIDACION, msgError.toString());
		}
	}
		
	public static LocalDate convertirDateToLocalTime(Date fecha) {
		if(fecha == null) {
			return null;
		}
		
		return Instant.ofEpochMilli(fecha.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static Date convertirLocalTimeToDate(LocalDate fecha) {
		return new Date(fecha.toEpochDay());
	}
}