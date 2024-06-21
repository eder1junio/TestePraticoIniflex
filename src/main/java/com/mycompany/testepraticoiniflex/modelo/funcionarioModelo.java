/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author ederjunio
 */
public class funcionarioModelo extends pessoaModelo{
    
    public BigDecimal salario;
    public String funcao;
    
    public funcionarioModelo(String nome,LocalDate dataNacimento,BigDecimal salario,String funcao){
        super(nome,dataNacimento);
        this.funcao = funcao;
        this.salario = salario;
        
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }
    
    public BigDecimal aumentaSalario(BigDecimal salario){
        BigDecimal aumento = new BigDecimal("1.1");
         salario = salario.multiply(aumento);
         return salario;
    }
    
    
   
}
