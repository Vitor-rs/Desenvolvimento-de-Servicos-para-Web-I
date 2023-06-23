package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface DadoAcademicoMapper extends ISimpleMapper<DadoAcademico, DadoAcademicoDto, DadoAcademicoForm> {
    public static final DadoAcademicoMapper INSTANCE = Mappers.getMapper(DadoAcademicoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public DadoAcademico formToEntity(DadoAcademicoForm dto);


    @InheritConfiguration(name = "update")
    @Override
    public DadoAcademico update(DadoAcademicoForm dto, DadoAcademico entity);
}