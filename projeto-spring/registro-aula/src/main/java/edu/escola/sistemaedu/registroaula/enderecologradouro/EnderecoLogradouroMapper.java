package edu.escola.sistemaedu.registroaula.enderecologradouro;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface EnderecoLogradouroMapper extends ISimpleMapper<EnderecoLogradouro, EnderecoLogradouroDto, EnderecoLogradouroForm> {

    public static final EnderecoLogradouroMapper INSTANCE = Mappers.getMapper(EnderecoLogradouroMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public EnderecoLogradouro formToEntity(EnderecoLogradouroForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public EnderecoLogradouro update(EnderecoLogradouroForm dto, EnderecoLogradouro entity);

}