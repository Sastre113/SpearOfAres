/**
 * 
 */
package spear.of.ares.rest;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import spear.of.ares.model.dto.HttpResponse;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;


/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 20:51:28 - 17/02/2022
 *
 */

@FeignClient(value = "feignClientTester", url = "https://httpstat.us/")
public interface IFeignClientTester {
	
	@GetMapping(path = "200", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpOk();
	
	@GetMapping(path = "400", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpBadRequest(@RequestBody EmpleadoDTO peticionDTO);

	@GetMapping(path = "404", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpResponse> getHttpNotFound();
	
}
