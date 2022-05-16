package spear.of.ares.model.dto.maquinaRefresco;

import java.util.HashMap;

public class MaquinaRefresco {

	private String id;
	private String marca;
	private HashMap<String, Integer> productos;
	
	
	private static class MaquinaRefrescoBuilder{
		
		private String id;
		private String marca;
		private HashMap<String, Integer> productos;
		
		private MaquinaRefrescoBuilder() {}
		
		private void id(String id) {
			this.id = id;
		}
		
		private void marca(String marca) {
			this.marca = marca;
		}
		
		private void añadirProducto(String nombre, Integer cantidad) {
			if(this.productos.containsKey(nombre)) {
				//TODO
			} else {			
				this.productos.put(nombre, cantidad);				
			}
		}		
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public HashMap<String, Integer> getProductos() {
		return productos;
	}

	public void setProductos(HashMap<String, Integer> productos) {
		this.productos = productos;
	}
}
