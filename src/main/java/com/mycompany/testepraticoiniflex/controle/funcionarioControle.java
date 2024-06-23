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
    
    
    public void calcularIdade(List<funcionarioModelo> cadastrar){
        if (cadastrar == null || cadastrar.isEmpty()){
             
            JOptionPane.showMessageDialog(null, "A lista de funcionários está vazia ou é nula.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
         LocalDate dataAtual = LocalDate.now();
        funcionarioModelo funcionarioIdadeMaior = null;
        int idadeMaior = 0;
        for(funcionarioModelo funcionario : cadastrar){
           int idade = Period.between(funcionario.getDataNascimento(), dataAtual).getYears();
           if(idade > idadeMaior){
               idadeMaior = idade;
               funcionarioIdadeMaior = funcionario;
           }
              
           
        }JOptionPane.showMessageDialog(null,"Nome:"+funcionarioIdadeMaior.getNome()+" Idade:"+ idadeMaior," Funcionário com Maior idade",JOptionPane.INFORMATION_MESSAGE);
    }
    public void salarioMinimo(List<funcionarioModelo> cadastrar){
    BigDecimal salarioMinino = new BigDecimal(1212.00);
        
        int cont = 0;
        for(funcionarioModelo funcionario : cadastrar){
            if(funcionario.getSalario().compareTo(salarioMinino) <= 0)
            {
                 cont ++;
            }
            BigDecimal salarioVesesMini = funcionario.getSalario().divide(salarioMinino,2,RoundingMode.HALF_UP);
            JOptionPane.showMessageDialog(null,"Os  funcionários "+funcionario.getNome()+ 
                    " ganha "+salarioVesesMini+" vezes o Salário Mínimo ","Informação de Salário",
                    JOptionPane.INFORMATION_MESSAGE);            
                
        }
        JOptionPane.showMessageDialog(null,cont +" funcionários que ganham menos que R$ 1212,00","Informação de Salário",
                JOptionPane.INFORMATION_MESSAGE);
    }
    public void ordenaLista(List<funcionarioModelo> cadastrar){
    Collections.sort(cadastrar);
            StringBuilder mensagem = new StringBuilder();
            for(funcionarioModelo ordenalista : cadastrar){
                mensagem.append("nome: ").append(ordenalista.getNome()).append(" Data de Nascimento:")
                        .append(ordenalista.getDataNascimento()).append(" salário: ")
                        .append(ordenalista.getSalario()).append(" função: ").append(ordenalista.getFuncao()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensagem.toString(),"Lista Ordenada",JOptionPane.INFORMATION_MESSAGE);
            
            
    } 
    public void aniversarioOutubroDezembro(List<funcionarioModelo> cadastra){
        List<funcionarioModelo> funcionarioAniversarioMes = new ArrayList<>();
             StringBuilder mensagem = new StringBuilder();
            int mesAniversarioOutubro = 10;
            int mesAniversarioDezembro = 12;
        for(funcionarioModelo funcionario :cadastra){
            if(funcionario.getDataNascimento().getMonthValue()== mesAniversarioOutubro ||
                    funcionario.getDataNascimento().getMonthValue() == mesAniversarioDezembro ){
                funcionarioAniversarioMes.add(funcionario);
            }
           
         
        }
            mensagem.append("Aniversariante dos mês ").append(mesAniversarioOutubro).append(" e "+mesAniversarioDezembro).append(":\n");
            for (funcionarioModelo funcionariodoAnivesariante : funcionarioAniversarioMes) {
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
                mensagem.append(funcionario.getNome()).append(" "+funcionario.getDataNascimento()).append(" "+funcionario.getSalario()).append("\n");
            }
            mensagem.append("---").append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Funcionários por Função", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public List<funcionarioModelo> aumentaSalario(List<funcionarioModelo> cadastrar){
       
        String aumento = JOptionPane.showInputDialog(" Porcentagem de aumento salarial");
         
        if (aumento == null || aumento.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porcentagem de aumento não informada.", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
        List<funcionarioModelo> funcionarioComAumento = new ArrayList<>();
        BigDecimal porcetagem = new BigDecimal(aumento);
        for(funcionarioModelo funcionario: cadastrar){
            BigDecimal  aumentoSalario = BigDecimal.ZERO;
            BigDecimal salario = funcionario.getSalario();
            aumentoSalario = salario.multiply(porcetagem).divide(new BigDecimal("100"));
            BigDecimal totalsalario = salario.add(aumentoSalario);
            funcionario.setSalario(totalsalario);
            funcionarioComAumento.add(funcionario);
            
          
            JOptionPane.showMessageDialog(null, "Salário do funcionário "+funcionario.getNome()+" atualizado em  R$ "+funcionario.getSalario());
           
            
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
    public void deletarFuncionario (List<funcionarioModelo>cadastra,String nome){
            for(int i =0;i<cadastra.size();i++)
                if(cadastra.get(i).getNome().equals(nome)){
                    cadastra.remove(i);
                }
                
           
            
        }
        
        
    }
    

