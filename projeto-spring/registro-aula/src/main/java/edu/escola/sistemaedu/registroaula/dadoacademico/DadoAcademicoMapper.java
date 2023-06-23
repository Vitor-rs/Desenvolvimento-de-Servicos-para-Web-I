package edu.escola.sistemaedu.registroaula.dadoacademico;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DadoAcademicoMapper {
    DadoAcademicoMapper INSTANCE = Mappers.getMapper(DadoAcademicoMapper.class);

    @Mapping(target = "dadoAcademicoId", ignore = true)
    DadoAcademico toDadoAcademico(DadoAcademicoDto dto);

    DadoAcademicoDto toDadoAcademicoDto(DadoAcademico entity);
}