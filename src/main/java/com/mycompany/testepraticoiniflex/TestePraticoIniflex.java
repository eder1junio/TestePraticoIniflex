/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testepraticoiniflex;

import com.mycompany.testepraticoiniflex.modelo.funcionarioModelo;
import com.mycompany.testepraticoiniflex.modelo.pessoaFuncionarioJFrame;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author ederjunio
 */
public class TestePraticoIniflex {

    public static void main(String[] args) {
         new pessoaFuncionarioJFrame().setVisible(true);
        
        /*
        List<funcionarioModelo> cadastra = new ArrayList<>();
        
        
        String nome = JOptionPane.showInputDialog("Qual o nome do funcionario ");
        String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (dd/MM/yyyy):");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        String salarioStr = JOptionPane.showInputDialog("Qual o salário do funcionário?");
        BigDecimal salario = new BigDecimal(salarioStr);
        String funcao = JOptionPane.showInputDialog("qual a função do funcionario");
        
        funcionarioModelo funcionario = new funcionarioModelo(nome, dataNascimento, salario, funcao);
        
        cadastra.add(funcionario);
        
        
        
        for(funcionarioModelo func : cadastra){
            System.out.println(func.nome);
        }
             BigDecimal totalSalario = BigDecimal.ZERO;
        for( funcionarioModelo funciona :cadastra){
                BigDecimal salario1 = funciona.getSalario();
             totalSalario = totalSalario.add(salario1);
             System.out.println(totalSalario);    
        }*/
    }
}
