package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class RegistroFrequenciaAulaService extends AbstractBasicService<RegistroFrequenciaAula, Long, RegistroFrequenciaAulaForm, RegistroFrequenciaAulaRepository> {
    @Override
    public void setRepository(RegistroFrequenciaAulaRepository repository) {
        super.repository = repository;
        setMapper(RegistroFrequenciaAulaMapper.INSTANCE);
    }
}