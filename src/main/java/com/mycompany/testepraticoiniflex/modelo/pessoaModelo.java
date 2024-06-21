/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.modelo;

import java.time.LocalDate;

/**
 *
 * @author ederjunio
 */
public class pessoaModelo {
    
    public String nome;
    public LocalDate dataNacimento;
    
    public pessoaModelo(String nome,LocalDate dataNacimento){
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

}
