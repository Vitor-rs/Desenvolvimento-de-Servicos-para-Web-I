package edu.escola.sistemaedu.registroaula.professor;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(config = BaseObjectMapper.class)
public interface ProfessorMapper extends ISimpleMapper<Professor, ProfessorDto, ProfessorForm> {

    public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Professor formToEntity(ProfessorForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Professor update(ProfessorForm dto, Professor entity);
}