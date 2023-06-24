package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface CursoMapper extends ISimpleMapper<Curso, CursoDto, CursoForm> {

    public static final CursoMapper INSTANCE = Mappers.getMapper(CursoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Curso formToEntity(CursoForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Curso update(CursoForm dto, Curso entity);
}