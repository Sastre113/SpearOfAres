/**
 * 
 */
package spear.of.ares.excepcion;


import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1:11:51 - 19/02/2022
 *
 */
@Component 
public class FeignClientTesterExceptionHandler extends Throwable implements ErrorDecoder {
	
	private final ErrorDecoder.Default defaultDecoder = new Default();

	@Override
	public Exception decode(String methodKey, Response response) {

	        return defaultDecoder.decode(methodKey, response);
	}

}
