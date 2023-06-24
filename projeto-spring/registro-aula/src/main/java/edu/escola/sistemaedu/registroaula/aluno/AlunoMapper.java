package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface AlunoMapper extends ISimpleMapper<Aluno, AlunoDto, AlunoForm> {
    public static final AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Aluno formToEntity(AlunoForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Aluno update(AlunoForm dto, Aluno entity);
}