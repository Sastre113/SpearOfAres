/**
 * 
 */
package spear.of.ares.model.dto.categoria;

import spear.of.ares.utils.AresBuilder;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 23:39:45 - 16/05/2022
 *
 */
public enum ECategoria{
	
	ANALISTA(AnalistaDTO.class, "20000") {
		@Override
		public ECategoria build() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	JUNIOR(ProgramadorJuniorDTO.class, "1500") {
		@Override
		public ECategoria build() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	SENIOR(ProgramadorSeniorDTO.class, "30000") {
		@Override
		public ECategoria build() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private Class<? extends AbstractCategoriaDTO> clazz;
	private String salarioBruto;
	
	<T extends AbstractCategoriaDTO> ECategoria(Class<T> clazz, String salarioBruto){
		this.clazz = clazz;
		this.salarioBruto = salarioBruto;
	}
	

	public static void build(ECategoria eCategoria) {
		// TODO Auto-generated method stub
		eCategoria.build();
	}
	
	public abstract ECategoria build();
}
