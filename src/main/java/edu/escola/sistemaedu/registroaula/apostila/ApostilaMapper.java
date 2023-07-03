package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface ApostilaMapper extends ISimpleMapper<Apostila, ApostilaDto, ApostilaForm> {

    public static final ApostilaMapper INSTANCE = Mappers.getMapper(ApostilaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Apostila formToEntity(ApostilaForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Apostila update(ApostilaForm dto, Apostila entity);
}