/**
 * 
 */
package spear.of.ares.model.dto.Empleado.Peticion;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * Creado 22:48:19 - 26/01/2022
 *
 */
public class PeticionInsertarEmpleadoDTO {
	
	private interface IdEmpleado { String getIdEmpleado(); }
	private interface Dni { String getDni(); }
	private interface Nombre { String getNombre(); }
	private interface FechaNacimiento { Date getFechaNacimiento(); }
	
	
	public enum Peticion{;
		 @Getter @Setter @NoArgsConstructor
		public static class PeticionInsertarEmpleado implements Dni, Nombre, FechaNacimiento {
			
			String dni;
			String nombre;
			Date fechaNacimiento;
			
			public String getDni() {
				return dni;
			}
			public void setDni(String dni) {
				this.dni = dni;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public Date getFechaNacimiento() {
				return fechaNacimiento;
			}
			public void setFechaNacimiento(Date fechaNacimiento) {
				this.fechaNacimiento = fechaNacimiento;
			}
			
			
			
		}
	}
	
	public enum Respuesta{;
		public static class RespuestaInsertarEmpleado implements IdEmpleado, Dni, Nombre, FechaNacimiento {
			
			String idEmpleado;
			String dni;
			String nombre;
			Date fechaNacimiento;

			public String getIdEmpleado() {
				return idEmpleado;
			}

			public void setIdEmpleado(String idEmpleado) {
				this.idEmpleado = idEmpleado;
			}

			public String getDni() {
				return dni;
			}

			public void setDni(String dni) {
				this.dni = dni;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public Date getFechaNacimiento() {
				return fechaNacimiento;
			}
			
			public void setFechaNacimiento(Date fechaNacimiento) {
				this.fechaNacimiento = fechaNacimiento;
			}
			
		}
	}
}
