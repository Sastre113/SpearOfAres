/**
 * 
 */
package spear.of.ares.excepcion;

import feign.Response;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:29:34 - 19/02/2022
 *
 */
public interface FeignClientExcepcionHandler {
	public Exception handle(Response response);
}
