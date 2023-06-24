package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;

public class ContratoService extends AbstractBasicService<Contrato, Long, ContratoForm, ContratoRepository> {
        @Override
        public void setRepository(ContratoRepository repository) {
            super.repository = repository;
            setMapper(ContratoMapper.INSTANCE);
        }
}