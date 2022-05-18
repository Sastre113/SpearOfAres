package spear.of.ares.model.dto.maquinaRefresco;

import java.util.Date;
import java.util.HashMap;

import spear.of.ares.service.MaquinaRefrescoService;

public class MaquinaRefresco {

	private final String id;
	private final String marca;
	private final Date fechaVenta;
	private final HashMap<String, Integer> productos;
	
	private MaquinaRefresco(Builder builder) {
		this.id = builder.id;
		this.marca = builder.marca;
		this.fechaVenta = builder.fechaVenta;
		this.productos = builder.productos;
	}
	
	public void añadirProducto(String nombre, Integer cantidad) {
		if(this.productos.containsKey(nombre)) {
			 Integer nuevaCantidad = this.productos.get(nombre) + cantidad;
			 this.productos.put(nombre, nuevaCantidad);
		} else {
			this.productos.put(nombre, cantidad);
		}
	}
	
	public String getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}
	
	public Date getFechaVenta() {
		return fechaVenta;
	}

	public HashMap<String, Integer> getProductos() {
		return productos;
	}
	
	public static class Builder{
		
		private String id;
		private String marca;
		private Date fechaVenta;
		private HashMap<String, Integer> productos;
		
		public Builder(String id, String marca) {
			this.id = id;
			this.marca = marca;
			this.productos = new HashMap<>();
		}
		
		public Builder fechaVenta(Date fechaVenta) {
			this.fechaVenta = fechaVenta;
			return this;
		}
		
		public Builder añadirProducto(HashMap<String, Integer> productos) {
			this.productos = productos;
			return this;
		}	
		
		public MaquinaRefresco build() {
			MaquinaRefresco maquinaRefresco = new MaquinaRefresco(this);
			return maquinaRefresco;
		}
	}
}
