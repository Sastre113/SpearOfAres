/**
 * 
 */
package spear.of.ares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.excepcion.FeignClientTesterExceptionHandler;
import spear.of.ares.model.dto.HttpResponse;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.rest.IFeignClientTester;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:03:22 - 17/02/2022
 *
 */
@RestController
@RequestMapping(value = "/FeignClientTester")
public class FeignClientTesterController {

	@Autowired
	private IFeignClientTester feignClientTester;
	
	@GetMapping(path = "/getHttp/ok", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpOk() throws AresException {
		try {
			return this.feignClientTester.getHttpOk();
		} catch (Exception e) {
			throw new AresException(e);
		}
	}
	
	@GetMapping(path = "/getHttp/badRequest", produces = MediaType.APPLICATION_JSON_VALUE)
	@org.springframework.web.bind.annotation.ExceptionHandler({FeignClientTesterExceptionHandler.class})
	public ResponseEntity<HttpResponse> getHttpBadRequest(@RequestBody EmpleadoDTO peticionDTO) throws AresException {
		try {
			return this.feignClientTester.getHttpBadRequest(peticionDTO);
		} catch (Exception e) {
			throw new AresException(e);
		}
	}
	
	@GetMapping(path = "/getHttp/notFound", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpNotFound() throws AresException {
		try {
			return this.feignClientTester.getHttpNotFound();
		} catch (Exception e) {
			throw new AresException(e);
		}
	}
}
