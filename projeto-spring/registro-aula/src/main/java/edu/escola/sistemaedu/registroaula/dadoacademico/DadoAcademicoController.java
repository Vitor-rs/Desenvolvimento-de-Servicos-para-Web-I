package edu.escola.sistemaedu.registroaula.dadoacademico.controller;

import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademicoDto;
import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dado-academico")
public class DadoAcademicoController {
    private final DadoAcademicoService dadoAcademicoService;

    public DadoAcademicoController(DadoAcademicoService dadoAcademicoService) {
        this.dadoAcademicoService = dadoAcademicoService;
    }

    @PostMapping
    public ResponseEntity<DadoAcademicoDto> createDadoAcademico(@RequestBody DadoAcademicoDto dto) {
        DadoAcademicoDto createdDto = dadoAcademicoService.createDadoAcademico(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadoAcademicoDto> getDadoAcademicoById(@PathVariable("id") Long id) {
        DadoAcademicoDto dto = dadoAcademicoService.getDadoAcademicoById(id);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DadoAcademicoDto> updateDadoAcademico(
            @PathVariable("id") Long id,
            @RequestBody DadoAcademicoDto dto
    ) {
        DadoAcademicoDto updatedDto = dadoAcademicoService.updateDadoAcademico(id, dto);
        return ResponseEntity.ok(updatedDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDadoAcademico(@PathVariable("id") Long id) {
        dadoAcademicoService.deleteDadoAcademico(id);
        return ResponseEntity.noContent().build();
    }
}