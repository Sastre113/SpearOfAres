/**
 * 
 */
package spear.of.ares.service.mapper;

import org.mapstruct.Mapper;

import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.model.entity.TbEmpleado;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 0:59:37 - 12/02/2022
 *
 */
@Mapper(componentModel = "Spring")
public interface EmpleadoMapper {
	public TbEmpleado dtoToEntity(EmpleadoDTO empleadoDTO);
	public EmpleadoDTO entityToDto(TbEmpleado empleadoEntity);
}
