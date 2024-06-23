/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testepraticoiniflex.util;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author allis
 */
public class formataData extends  DefaultTableCellRenderer{
    private static final DateTimeFormatter dataFormate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
        if (value instanceof LocalDate) {
            value = ((LocalDate) value).format(dataFormate);
            
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
    

