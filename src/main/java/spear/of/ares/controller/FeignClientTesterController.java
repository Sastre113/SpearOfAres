/**
 * 
 */
package spear.of.ares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.excepcion.AresException;
import spear.of.ares.excepcion.FeignClientTesterExceptionHandler;
import spear.of.ares.model.dto.HttpResponse;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.rest.IFeignClientTester;
import spear.of.ares.utils.AresUtilsHttp;
import spear.of.ares.utils.YamlPropertySourceFactory;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:03:22 - 17/02/2022
 *
 */
@RestController
@RequestMapping(value = "/FeignClientTester")
@PropertySource(value = "classpath:db/messages.yml", factory = YamlPropertySourceFactory.class)
public class FeignClientTesterController {

	@Autowired
	private IFeignClientTester feignClientTester;
	
	@Value("${querySql.select}")
	private String query1;
	@Value("${querySql.select2}")
	private String query2;
	
	@GetMapping(path = "/getHttp/ok", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpOk() throws AresException {
		try {
			return this.feignClientTester.getHttpOk();
		} catch (Exception e) {
			throw new AresException(e);
		}
	}
	
	@GetMapping(path = "/getHttp/badRequest", produces = MediaType.APPLICATION_JSON_VALUE)
	@ExceptionHandler({FeignClientTesterExceptionHandler.class})
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
		} catch (Exception e) {;
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(AresUtilsHttp.construirHttpResponse(HttpStatus.NOT_FOUND.value()));
		}
	}
}
