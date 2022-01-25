/**
 * 
 */
package spear.of.ares.controller;


import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spear.of.ares.service.IGestionFacturaService;

@RestController
@RequestMapping(value="")
public class HelloWorldController {
	
	
	IGestionFacturaService gestionFacturaService;

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request) {
		Iterator<String> it = request.getParameterNames().asIterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		return "Hello world!";
	}	
	
	@RequestMapping(path = "/generarFactura", method = RequestMethod.GET)
	public String generarFactura(@RequestParam String tipoFactura) {
		
		try {		
			this.gestionFacturaService.generarFactura(tipoFactura);
			return "OK";
		} catch (Exception e) {
			return "KO";
		}
	}
	
}
