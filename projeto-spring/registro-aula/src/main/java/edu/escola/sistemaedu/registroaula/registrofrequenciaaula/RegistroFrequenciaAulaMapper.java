package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.arch.BaseObjectMapper;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseObjectMapper.class)
public interface RegistroFrequenciaAulaMapper extends ISimpleMapper<RegistroFrequenciaAula, RegistroFrequenciaAulaDto, RegistroFrequenciaAulaForm> {

    public static final RegistroFrequenciaAulaMapper INSTANCE = Mappers.getMapper(RegistroFrequenciaAulaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public RegistroFrequenciaAula formToEntity(RegistroFrequenciaAulaForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public RegistroFrequenciaAula update(RegistroFrequenciaAulaForm dto, RegistroFrequenciaAula entity);
}