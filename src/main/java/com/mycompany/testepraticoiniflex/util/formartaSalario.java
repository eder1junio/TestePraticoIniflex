/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.util;

import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author allis
 */
public class formartaSalario extends DefaultTableCellRenderer{
     private static final NumberFormat formatter = new DecimalFormat ("R$ #,##0.00");

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
       
        if (value instanceof Double) {
            value = formatter.format(value);
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}

    

