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

    public T dtoToEntity(DTO dto);

    public DTO toDto(T entity);

    public T update(FORM dto, @MappingTarget T entity);

    public List<T> toEntityList(List<DTO> items);

    public List<DTO> toDtoList(List<T> items);

    public default Page<DTO> toDtoPage(Page<T> items) {
        return items.map(entity -> toDto(entity));
    }

}