/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package edu.escola.sistemaedu.arch;

import org.mapstruct.MappingTarget;
import org.springframework.data.domain.Page;

import java.util.List;


/**
 * @param <T>
 * @param <DTO>
 * @param <FORM>
 * @author nicho
 */
public interface ISimpleMapper<T, DTO, FORM> {

    public T formToEntity(FORM dto);

    public DTO entityToDto(T entity);

    public List<DTO> entityToDto(List<T> entity);

    public Page<DTO> entityToDto(Page<T> entity);

    public T update(FORM dto, @MappingTarget T entity);

    public FORM dtoToForm(DTO dto);

    public List<FORM> dtoToForm(List<DTO> dto);

    public Page<FORM> dtoToForm(Page<DTO> dto);

    FORM toDtoPage(Page<T> page);
}