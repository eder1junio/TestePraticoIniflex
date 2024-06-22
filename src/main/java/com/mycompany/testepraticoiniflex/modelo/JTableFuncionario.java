/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Senac
 */
public class JTableFuncionario extends AbstractTableModel{ 

    private ArrayList<funcionarioModelo> listaDeFuncionarios;
    private String[] colunas = {"Nome", "Data de Nascimento", "Função", "Salario"};
    
    
      public JTableFuncionario(){
        this.listaDeFuncionarios = new ArrayList<>();
    }
    
    public funcionarioModelo getFuncionario(int rowIndex){
        return this.listaDeFuncionarios.get(rowIndex);
    }

    public void addFuncionario(funcionarioModelo funcionario){
        this.listaDeFuncionarios.add(funcionario);
        fireTableDataChanged();
    }
    

    public void removeFuncionario(int rowIndex){
        this.listaDeFuncionarios.remove(rowIndex);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.listaDeFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            //switch na coluna
        switch (columnIndex) {

            //coluna do nnome do funcionario
            case 0:
                return this.listaDeFuncionarios.get(rowIndex).getNome();

            //coluna Data de Nascimento
            case 1:
                return this.listaDeFuncionarios.get(rowIndex).getDataNacimento();
            //Coluna Função 
            case 2:
                return this.listaDeFuncionarios.get(rowIndex).getFuncao();
                        //Coluna Função 
            case 3:
                return this.listaDeFuncionarios.get(rowIndex).getSalario();

            default:
                return this.listaDeFuncionarios.get(rowIndex);
        }

    
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }
    
    
    
}
