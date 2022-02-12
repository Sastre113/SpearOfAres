package spear.of.ares.service.mapper;


import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import spear.of.ares.model.dto.Empleado.EmpleadoDTO;
import spear.of.ares.model.entity.TbEmpleado;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-12T01:24:43+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class EmpleadoMapperImpl implements EmpleadoMapper {

    @Override
    public TbEmpleado dtoToEntity(EmpleadoDTO empleadoDTO) {
        if ( empleadoDTO == null ) {
            return null;
        }

        TbEmpleado tbEmpleado = new TbEmpleado();

        tbEmpleado.setIdEmpleado( empleadoDTO.getIdEmpleado() );
        tbEmpleado.setDni( empleadoDTO.getDni() );
        tbEmpleado.setNombre( empleadoDTO.getNombre() );
        tbEmpleado.setFechaNacimiento( empleadoDTO.getFechaNacimiento() );

        return tbEmpleado;
    }

    @Override
    public EmpleadoDTO entityToDto(TbEmpleado empleadoEntity) {
        if ( empleadoEntity == null ) {
            return null;
        }

        EmpleadoDTO empleadoDTO = new EmpleadoDTO();

        empleadoDTO.setIdEmpleado( empleadoEntity.getIdEmpleado() );
        empleadoDTO.setDni( empleadoEntity.getDni() );
        empleadoDTO.setNombre( empleadoEntity.getNombre() );
        empleadoDTO.setFechaNacimiento( empleadoEntity.getFechaNacimiento() );

        return empleadoDTO;
    }
}
