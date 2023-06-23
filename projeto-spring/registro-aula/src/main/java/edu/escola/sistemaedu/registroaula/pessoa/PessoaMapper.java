package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface PessoaMapper extends ISimpleMapper<Pessoa, PessoaDto, PessoaForm> {

    public static final PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Pessoa formToEntity(PessoaForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Pessoa update(PessoaForm dto, Pessoa entity);
}