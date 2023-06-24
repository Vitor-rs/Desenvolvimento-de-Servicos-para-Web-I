package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface ContratoMapper extends ISimpleMapper<Contrato, ContratoDto, ContratoForm> {

    public static final ContratoMapper INSTANCE = Mappers.getMapper(ContratoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Contrato formToEntity(ContratoForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Contrato update(ContratoForm dto, Contrato entity);
}