package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface DadoProfissionalMapper extends ISimpleMapper<DadoProfissional, DadoProfissionalDto, DadoProfissionalForm> {

    public static final DadoProfissionalMapper INSTANCE = Mappers.getMapper(DadoProfissionalMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public DadoProfissional formToEntity(DadoProfissionalForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public DadoProfissional update(DadoProfissionalForm dto, DadoProfissional entity);

}