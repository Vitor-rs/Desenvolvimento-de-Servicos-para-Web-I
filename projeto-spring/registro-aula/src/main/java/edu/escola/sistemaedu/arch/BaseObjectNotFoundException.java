/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.escola.sistemaedu.arch;

/**
 * @author santos
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Objeto padr�o n�o encontrado")
public class BaseObjectNotFoundException extends ResponseStatusException {

    private static final long serialVersionUID = 1L;

    public BaseObjectNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}