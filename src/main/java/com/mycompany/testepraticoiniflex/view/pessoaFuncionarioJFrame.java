/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.testepraticoiniflex.view;

import com.mycompany.testepraticoiniflex.controle.funcionarioControle;
import com.mycompany.testepraticoiniflex.modelo.JTableFuncionario;
import com.mycompany.testepraticoiniflex.modelo.funcionarioModelo;
import java.awt.ComponentOrientation;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author ederjunio
 */
public class pessoaFuncionarioJFrame extends javax.swing.JFrame {
    List<funcionarioModelo> cadastra = new ArrayList<>();
    private JTableFuncionario tableModel;
    MaskFormatter mFdata;
   
    
    /**
     * Creates new form pessoaFuncionarioJFrame
     */
    public pessoaFuncionarioJFrame() {
        
        try {
         mFdata = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            System.out.println("Erro ao formatar a data");
        }
    
        
        initComponents();
        this.tableModel = new JTableFuncionario();
        
        //seta o modelo a tabela
        this.jTableFuncionario.setModel(this.tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        salvajButton1 = new javax.swing.JButton();
        nomejLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salariojLabel3 = new javax.swing.JLabel();
        funcaojLabel4 = new javax.swing.JLabel();
        nomejTextField1 = new javax.swing.JTextField();
        datajTextField2 = new javax.swing.JTextField();
        salariojTextField3 = new javax.swing.JTextField();
        funcaojTextField4 = new javax.swing.JTextField();
        deletarjButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totaljButton1 = new javax.swing.JButton();
        aumentaSalariojButton1 = new javax.swing.JButton();
        agrupaFuncaojButton2 = new javax.swing.JButton();
        AnivesariojButton3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ordenajButton4 = new javax.swing.JButton();
        verificajButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data DE Nacimento", "Função", "Salario"
            }
        ));
        jScrollPane1.setViewportView(jTableFuncionario);

        salvajButton1.setText("SALVAR");
        salvajButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvajButton1ActionPerformed(evt);
            }
        });

        nomejLabel1.setText("Nome ");

        jLabel2.setText("Data De Nacimento ");

        salariojLabel3.setText("Salario");

        funcaojLabel4.setText("Função");

        nomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomejTextField1ActionPerformed(evt);
            }
        });

        deletarjButton2.setText("DELETAR");
        deletarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarjButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cadastro de Funcionario ");

        totaljButton1.setText("TOTAL DE SALARIO");
        totaljButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaljButton1ActionPerformed(evt);
            }
        });

        aumentaSalariojButton1.setText("AUMENTO DE SALARIO");
        aumentaSalariojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentaSalariojButton1ActionPerformed(evt);
            }
        });

        agrupaFuncaojButton2.setText("AGRUPA POR FUNÇÃO");
        agrupaFuncaojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrupaFuncaojButton2ActionPerformed(evt);
            }
        });

        AnivesariojButton3.setText("Anivesariate do Mês");
        AnivesariojButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnivesariojButton3ActionPerformed(evt);
            }
        });

        jButton3.setText("Fucionario com Maior idade");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ordenajButton4.setText("Ordena Lista");
        ordenajButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenajButton4ActionPerformed(evt);
            }
        });

        verificajButton4.setText("Verifica Salario");
        verificajButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificajButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(deletarjButton2)
                                .addGap(18, 18, 18)
                                .addComponent(agrupaFuncaojButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(totaljButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnivesariojButton3)
                                .addGap(29, 29, 29)
                                .addComponent(verificajButton4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(salvajButton1)
                                .addGap(18, 18, 18)
                                .addComponent(aumentaSalariojButton1)
                                .addGap(18, 18, 18)
                                .addComponent(ordenajButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomejLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(funcaojLabel4)
                                    .addComponent(salariojLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salariojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(funcaojTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel1)
                    .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(datajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcaojLabel4)
                    .addComponent(funcaojTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salariojLabel3)
                    .addComponent(salariojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totaljButton1)
                            .addComponent(AnivesariojButton3)
                            .addComponent(verificajButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletarjButton2)
                            .addComponent(agrupaFuncaojButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aumentaSalariojButton1)
                            .addComponent(salvajButton1)
                            .addComponent(ordenajButton4))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomejTextField1ActionPerformed

    private void salvajButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvajButton1ActionPerformed
      
       try{
       String nome = this.nomejTextField1.getText();
       String datastr = this.datajTextField2.getText();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate data = LocalDate.parse(datastr, formatter);
       String dataFormatada = data.format(formatter);
       String salarioStr = this.salariojTextField3.getText();
        NumberFormat format = NumberFormat.getInstance(new Locale("pt", "BR"));
        Number number = format.parse(salarioStr);
        BigDecimal salario = BigDecimal.valueOf(number.doubleValue());
       //BigDecimal salario = new BigDecimal(salarioStr);
       String funcao = this.funcaojTextField4.getText();

        funcionarioModelo funcionario = new funcionarioModelo(nome, data, salario, funcao);
        cadastra.add(funcionario);
        
        this.tableModel.addFuncionario(funcionario);
        
       } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao converter o salário: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_salvajButton1ActionPerformed

    private void deletarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarjButton2ActionPerformed
       int linhaDelete = this.jTableFuncionario.getSelectedRow();
       this.tableModel.removeFuncionario(linhaDelete);
      
       
    }//GEN-LAST:event_deletarjButton2ActionPerformed

    private void totaljButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaljButton1ActionPerformed
        
    funcionarioControle totalSalario = new funcionarioControle();
    totalSalario.totalSalario(cadastra);
// TODO add your handling code here:

    }//GEN-LAST:event_totaljButton1ActionPerformed

    private void aumentaSalariojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentaSalariojButton1ActionPerformed

       funcionarioControle aumentaSalario = new funcionarioControle();
       List<funcionarioModelo> funcionarioComAumento = aumentaSalario.aumentaSalario(cadastra);
        
        for(int i=0;i<funcionarioComAumento.size();i++){
            this.tableModel.setValueAt(funcionarioComAumento.get(i).getSalario(), i, 3);
            
            
        }this.tableModel.fireTableDataChanged();
       
        
// TODO add your handling code here:
    }//GEN-LAST:event_aumentaSalariojButton1ActionPerformed

    private void agrupaFuncaojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrupaFuncaojButton2ActionPerformed
         funcionarioControle agrupaPorFuncao = new funcionarioControle();
         agrupaPorFuncao.agrupaPorFuncao(cadastra);
        
    }//GEN-LAST:event_agrupaFuncaojButton2ActionPerformed

    private void AnivesariojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnivesariojButton3ActionPerformed
             funcionarioControle aniversario = new funcionarioControle();
        aniversario.aniversarioOutubroDesenbro(cadastra);

        // TODO add your handling code here:
    }//GEN-LAST:event_AnivesariojButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   
        funcionarioControle metodo = new funcionarioControle();
        metodo.calcularIdade(cadastra);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ordenajButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenajButton4ActionPerformed
            funcionarioControle funcionario = new funcionarioControle();
            funcionario.ordenaLista(cadastra);
            // TODO add your handling code here:
    }//GEN-LAST:event_ordenajButton4ActionPerformed

    private void verificajButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificajButton4ActionPerformed
       
        funcionarioControle salarioDivSalarioMinimo = new funcionarioControle();
        salarioDivSalarioMinimo.salarioMinimo(cadastra);

    }//GEN-LAST:event_verificajButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pessoaFuncionarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pessoaFuncionarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pessoaFuncionarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pessoaFuncionarioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                new pessoaFuncionarioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnivesariojButton3;
    private javax.swing.JButton agrupaFuncaojButton2;
    private javax.swing.JButton aumentaSalariojButton1;
    private javax.swing.JTextField datajTextField2;
    private javax.swing.JButton deletarjButton2;
    private javax.swing.JLabel funcaojLabel4;
    private javax.swing.JTextField funcaojTextField4;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JLabel nomejLabel1;
    private javax.swing.JTextField nomejTextField1;
    private javax.swing.JButton ordenajButton4;
    private javax.swing.JLabel salariojLabel3;
    private javax.swing.JTextField salariojTextField3;
    private javax.swing.JButton salvajButton1;
    private javax.swing.JButton totaljButton1;
    private javax.swing.JButton verificajButton4;
    // End of variables declaration//GEN-END:variables

   
}
