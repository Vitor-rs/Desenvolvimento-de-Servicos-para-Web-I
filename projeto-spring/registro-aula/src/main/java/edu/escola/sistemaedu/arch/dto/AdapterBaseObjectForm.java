/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package edu.escola.sistemaedu.arch.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author santos
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AdapterBaseObjectForm implements IBaseForm {

    @NotNull(message = "O nome não deve ser nulo")
    @NotEmpty(message = "O nome não deve ser vazio")
    @NotBlank(message = "O Nome não deve conter espa�os em branco.")
    @Length(min = 3, message = "O Nome deve conter ao menos 3 caracteres.")
    protected String nome;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String value) {
        this.nome = value;
    }
}