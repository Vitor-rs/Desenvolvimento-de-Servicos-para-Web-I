/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package edu.escola.sistemaedu.arch.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;


/**
 * @param <T>
 * @param <K>
 * @param <DTO>
 * @param <LEANDTO>
 * @param <F>
 * @author nicho
 */
public interface ILeanController<T, K, DTO, LEANDTO, F>
        extends ISimpleController<T, K, DTO, F> {

    public ResponseEntity<Page<LEANDTO>> listarLean(Pageable paginacao);

    public List<LEANDTO> listarLean();
}