package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class ApostilaService extends AbstractBasicService<Apostila, Long, ApostilaForm, ApostilaRepository> {
        @Override
        public void setRepository(ApostilaRepository repository) {
            super.repository = repository;
            setMapper(ApostilaMapper.INSTANCE);
        }
}