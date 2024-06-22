/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.controle;

import com.mycompany.testepraticoiniflex.modelo.funcionarioModelo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


/**
 *
 * @author ederjunio
 */
public class funcionarioControle {
    
    
    public void calcularIdade(List<funcionarioModelo> cadastra){
        if (cadastra == null || cadastra.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "A lista de funcionários está vazia ou é nula.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
         LocalDate dataAtual = LocalDate.now();
        funcionarioModelo funcionarioIdadeMaio = null;
        int idadeMaior = 0;
        for(funcionarioModelo funcionario : cadastra){
           int idade = Period.between(funcionario.getDataNacimento(), dataAtual).getYears();
           if(idade > idadeMaior){
               idadeMaior = idade;
               funcionarioIdadeMaio = funcionario;
           }
              
           
        }JOptionPane.showMessageDialog(null,"Nome:"+funcionarioIdadeMaio.getNome()+" Idade :"+ idadeMaior,"Funcionario com Maio idade",JOptionPane.INFORMATION_MESSAGE);
    }
    public void salarioMinimo(List<funcionarioModelo> cadastra){
    BigDecimal salarioMinino = new BigDecimal(1212.00);
        
        int cont = 0;
        for(funcionarioModelo funcionario : cadastra){
            if(funcionario.getSalario().compareTo(salarioMinino) <= 0)
            {
                 cont ++;
            }
            BigDecimal salarioVesesMini = funcionario.getSalario().divide(salarioMinino,2,RoundingMode.HALF_UP);
            JOptionPane.showMessageDialog(null,"O  funcionarios "+funcionario.getNome()+ "ganha "+salarioVesesMini+" vezes o Salario Minimo ","Informação de Salario",JOptionPane.INFORMATION_MESSAGE);            
                
        }
        JOptionPane.showMessageDialog(null,cont +" funcionarios que ganham menos que R$1212,00","Informação de Salario",JOptionPane.INFORMATION_MESSAGE);
    }
    public void ordenaLista(List<funcionarioModelo> cadastra){
    Collections.sort(cadastra);
            StringBuilder mensagem = new StringBuilder();
            for(funcionarioModelo ordenalista : cadastra){
                mensagem.append("nome: ").append(ordenalista.getNome()).append(" Data de Nacimeno:")
                        .append(ordenalista.getDataNacimento()).append(" salario: ")
                        .append(ordenalista.getSalario()).append(" função: ").append(ordenalista.getFuncao()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensagem.toString(),"Lista Ordenada",JOptionPane.INFORMATION_MESSAGE);
            
            
    } 
    public void aniversarioOutubroDesenbro(List<funcionarioModelo> cadastra){
        List<funcionarioModelo> funcionarioAnivesarioMes = new ArrayList<>();
             StringBuilder mensagem = new StringBuilder();
            int mesAnivesarioOutubro = 10;
            int mesAnivesarioDesenbro = 12;
        for(funcionarioModelo funcionario :cadastra){
            if(funcionario.getDataNacimento().getMonthValue()== mesAnivesarioOutubro ||funcionario.getDataNacimento().getMonthValue() == mesAnivesarioDesenbro ){
                funcionarioAnivesarioMes.add(funcionario);
            }
           
         
        }
            mensagem.append("Anivesariante dos mês ").append(mesAnivesarioOutubro).append("e "+mesAnivesarioDesenbro).append(":\n");
            for (funcionarioModelo funcionariodoAnivesariante : funcionarioAnivesarioMes) {
            mensagem.append(funcionariodoAnivesariante.getNome()).append("\n");
            
            
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Funcionários por Mês", JOptionPane.INFORMATION_MESSAGE);
        
    }
    public void agrupaPorFuncao(List<funcionarioModelo> cadastra){
        Map<String, List<funcionarioModelo>> funcionariosPorFuncao = new HashMap<>();

        for (funcionarioModelo funcionario : cadastra) {
            String funcao = funcionario.getFuncao();
            List<funcionarioModelo> listaFuncionarios = funcionariosPorFuncao.getOrDefault(funcao, new ArrayList<>());
            listaFuncionarios.add(funcionario);
            funcionariosPorFuncao.put(funcao, listaFuncionarios);
        }
           StringBuilder mensagem = new StringBuilder();
           for (Map.Entry<String, List<funcionarioModelo>> entry : funcionariosPorFuncao.entrySet()) {
            String funcao = entry.getKey();
            List<funcionarioModelo> listaFuncionarios = entry.getValue();

            mensagem.append("Função: ").append(funcao).append("\n");
            for (funcionarioModelo funcionario : listaFuncionarios) {
                mensagem.append(funcionario.getNome()).append(" "+funcionario.getDataNacimento()).append(" "+funcionario.getSalario()).append("\n");
            }
            mensagem.append("---").append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Funcionários por Função", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public List<funcionarioModelo> aumentaSalario(List<funcionarioModelo> cadastra){
       
        String aumento = JOptionPane.showInputDialog("Poderia me informa qual a porcetagem de aumento nos salarios");
         
        if (aumento == null || aumento.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porcentagem de aumento não informada.", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        List<funcionarioModelo> funcionarioComAumento = new ArrayList<>();
        BigDecimal porcetagem = new BigDecimal(aumento);
        for(funcionarioModelo funcionario: cadastra){
            BigDecimal  aumentoSalario = BigDecimal.ZERO;
            BigDecimal salario = funcionario.getSalario();
            aumentoSalario = salario.multiply(porcetagem).divide(new BigDecimal("100"));
            BigDecimal totalsalario = salario.add(aumentoSalario);
            funcionario.setSalario(totalsalario);
            funcionarioComAumento.add(funcionario);
            
          
            JOptionPane.showMessageDialog(null, "O Funcionario "+funcionario.getNome()+"aumento o salario para "+funcionario.getSalario());
           
            
        }
        return funcionarioComAumento;
    }
    public void totalSalario(List<funcionarioModelo> cadastra){
       
        BigDecimal totalSalario = BigDecimal.ZERO;
        for( funcionarioModelo funciona :cadastra){
            BigDecimal salario1 = funciona.getSalario();
            totalSalario = totalSalario.add(salario1);
        }
        JOptionPane.showMessageDialog(null,"Total de Salario :"+totalSalario);
        
    }
}
