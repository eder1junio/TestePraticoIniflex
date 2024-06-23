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
    public LocalDate dataNascimento;
    
    public pessoaModelo(String nome,LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNacimento) {
        this.dataNascimento = dataNacimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}
