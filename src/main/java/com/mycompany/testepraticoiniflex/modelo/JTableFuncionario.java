/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.modelo;

import com.mycompany.testepraticoiniflex.util.formartaSalario;
import com.mycompany.testepraticoiniflex.util.formataData;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Senac
 */
public class JTableFuncionario extends AbstractTableModel{ 

    private ArrayList<funcionarioModelo> listaDeFuncionarios;
    private String[] colunas = {"Nome", "Data de Nascimento", "Função", "Salário"};
    
    
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
                return this.listaDeFuncionarios.get(rowIndex).getDataNascimento();
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
    
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 3) {
            return Double.class; 
        }
        return super.getColumnClass(columnIndex);
    }
    public void setColumnRenderer(JTable table) {
       
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(3).setCellRenderer(new formartaSalario());
    }
     public void setColumnRendererDate(JTable table) {
       
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(1).setCellRenderer(new formataData());
    } 
     
     public Class<?> getColumnClassDate(int columnIndex) {
        if (columnIndex == 1) { 
            return LocalDate.class;
        }
        
        return super.getColumnClass(columnIndex);
    }
    
    
    }
    
    
    

