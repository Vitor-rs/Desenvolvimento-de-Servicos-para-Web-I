/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.escola.sistemaedu.arch.service;

import edu.escola.sistemaedu.arch.BaseObjectNotFoundException;
import edu.escola.sistemaedu.arch.ISimpleMapper;
import edu.escola.sistemaedu.arch.MapperUtils;
import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * @param <T>
 * @param <K>
 * @param <F>
 * @param <R>
 * @author 1513003
 */
public abstract class AbstractService<T, K, F, R extends IArchRepository<T, K>>
        extends AdapterService<T, K, F, R> {

    protected R repository;
    protected ISimpleMapper<T, ?, F> mapper;

    @Override
    public void setMapper(ISimpleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Page<T> listar(Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @Override
    public List<T> listar() {
        return repository.findAll();
    }

    @Override
    public Optional<T> buscarPor(K id) {
        return repository.findById(id);
    }

    private void validate() {
        MapperUtils.validate(AbstractService.class, mapper);
    }

    @Override
    public T criar(F form) {
        this.validate();

        var t = mapper.formToEntity(form);
        return repository.save(t);
    }

    @Override
    public T atualizar(K id, F form) {
        this.validate();

        return repository.findById(id)
                .map(entity -> mapper.update(form, entity))
                .orElseThrow(() -> new BaseObjectNotFoundException(
                        String
                                .format("Não existe objeto da classe %s com o código %s.",
                                        this.getClass().getName(), id.toString())
                ));
    }

    @Override
    public T remover(K id) {
        return repository.findById(id)
                .map(entity -> {
                    repository.delete(entity);
                    return entity;
                })
                .orElseThrow(() -> new BaseObjectNotFoundException(
                        "Não é possível excluir o registro solicitado."
                ));
    }

}