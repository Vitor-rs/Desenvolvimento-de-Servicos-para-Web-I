package edu.escola.sistemaedu.registroaula.dadoacademico;

import org.springframework.stereotype.Service;

@Service
public class DadoAcademicoService {


    private final DadoAcademicoRepository dadoAcademicoRepository;
    private final DadoAcademicoMapper dadoAcademicoMapper;

    public DadoAcademicoService(DadoAcademicoRepository dadoAcademicoRepository, DadoAcademicoMapper dadoAcademicoMapper) {
        this.dadoAcademicoRepository = dadoAcademicoRepository;
        this.dadoAcademicoMapper = dadoAcademicoMapper;
    }

    public DadoAcademicoDto createDadoAcademico(DadoAcademicoDto dto) {
        DadoAcademico dadoAcademico = dadoAcademicoMapper.toDadoAcademico(dto);
        dadoAcademico = dadoAcademicoRepository.save(dadoAcademico);
        return dadoAcademicoMapper.toDadoAcademicoDto(dadoAcademico);
    }

    public DadoAcademicoDto getDadoAcademicoById(Long dadoAcademicoId) {
        DadoAcademico dadoAcademico = dadoAcademicoRepository.findById(dadoAcademicoId)
                .orElseThrow(() -> new DadoAcademicoNotFoundException(dadoAcademicoId));
        return dadoAcademicoMapper.toDadoAcademicoDto(dadoAcademico);
    }

    public DadoAcademicoDto updateDadoAcademico(Long dadoAcademicoId, DadoAcademicoDto dto) {
        DadoAcademico dadoAcademico = dadoAcademicoRepository.findById(dadoAcademicoId)
                .orElseThrow(() -> new DadoAcademicoNotFoundException(dadoAcademicoId));
        dadoAcademicoMapper.toDadoAcademico(dto);
        dadoAcademico = dadoAcademicoRepository.save(dadoAcademico);
        return dadoAcademicoMapper.toDadoAcademicoDto(dadoAcademico);
    }

    public void deleteDadoAcademico(Long dadoAcademicoId) {
        if (!dadoAcademicoRepository.existsById(dadoAcademicoId)) {
            throw new DadoAcademicoNotFoundException(dadoAcademicoId);
        }
        dadoAcademicoRepository.deleteById(dadoAcademicoId);
    }
}