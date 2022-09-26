/**
 * 
 */
package spear.of.ares.service;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:07:05 - 27/09/2022
 * @param <T>
 *
 */
public interface ICrud<T,R> {

	public default R insertar(T peticio) {
		throw new UnsupportedOperationException();
	}
	public default R modificar(T peticio){
		throw new UnsupportedOperationException();
	}
	public default R eliminar(T peticio){
		throw new UnsupportedOperationException();
	}
	public default R obtener(T peticio){
		throw new UnsupportedOperationException();
	}
}
