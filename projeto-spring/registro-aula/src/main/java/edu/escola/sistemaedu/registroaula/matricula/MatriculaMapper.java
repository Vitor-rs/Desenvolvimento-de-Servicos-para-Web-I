package edu.escola.sistemaedu.registroaula.matricula;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface MatriculaMapper extends ISimpleMapper<Matricula, MatriculaDto, MatriculaForm> {

    public static final MatriculaMapper INSTANCE = Mappers.getMapper(MatriculaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Matricula formToEntity(MatriculaForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Matricula update(MatriculaForm dto, Matricula entity);
}