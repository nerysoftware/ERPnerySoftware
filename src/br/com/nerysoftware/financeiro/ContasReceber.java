/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nerysoftware.financeiro;

import br.com.nerysoftware.connection.ConnectionDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import br.com.nerysoftware.os.OC;
import br.com.nerysoftware.os.OrdenCarregamento;
import br.com.nerysoftware.os.orden_carregamento;
import br.com.nerysoftware.produtos.FrmListaProd;
import static br.com.nerysoftware.vendas.FrmCaixa.tabela;


import br.com.nerysoftware.vendas.VendasSql;

/**
 *
 * @author alvaro
 */
public final class ContasReceber extends javax.swing.JFrame {

  

    /**
     * Creates new form CantasReceber
     */
    public ContasReceber() {
        initComponents();
        TabelaTitulo.getTableHeader().setDefaultRenderer(new br.com.nerysoftware.financeiro.EstiloTabelaHeaderCP());
        TabelaTitulo.setDefaultRenderer(Object.class, new br.com.nerysoftware.financeiro.EstiloTabelaRendererCP());       
        TabelaTitulo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
        
        limparCampos();
    }
   //METODO DE SOMA
    public void getSum(){
     double count=0;
       for (int i=0; i<=TabelaTitulo.getRowCount()-1;i++) {
       count+=Double.parseDouble(TabelaTitulo.getValueAt(i, 4).toString());
    }   
      total.setText(String.valueOf(count));
    }
    
    void limparCampos() {
        if (TabelaTitulo.getSelectedRow() > -1) {
            TabelaTitulo.removeRowSelectionInterval(TabelaTitulo.getSelectedRow(), TabelaTitulo.getSelectedRow());
        }
        data.setDate(null);
        buscar.setText("");
        FinanceiroSql.listar("");
    }
    
 public void baixar(){
   try {
      for (int i = 0; i < TabelaTitulo.getRowCount(); i++) {
      
    
            Connection con = ConnectionDB.getConnection();
            PreparedStatement p = con.prepareStatement(" update vendas set situacao = ? where numero_ven = ? ");
             
            
             p.setString(2, id.getText());
             p.setString(1 , STATUS.getText());
            // p.setString(1,(String) TabelaTitulo.getValueAt(i, 0));
            // p.setString(1,(String) TabelaTitulo.getValueAt(i, 3));
                       
         
                
             p.execute();      
	     p.close();
         
              readJTableForDesc(buscar.getText()); 
            
            }  
            
            
             
             
            
        } catch (SQLException ex) {
            Logger.getLogger(ContasReceber.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Dados Alterados Com Sucesso");
        
 } 
    
    
  public void calcular() {
         Double soma = 0.0;
  for (int i = 0 ; i < TabelaTitulo.getColumnCount() ; i++)
  {
     if (TabelaTitulo.getValueAt(i, 0).equals(true))
     {
      Double valor =(Double) TabelaTitulo.getValueAt(i, 3 );
      soma += valor;
     }
   total.setText(String.valueOf(soma));
  //valorTotal = 0;
}
 
}
   
  
  public void readJTableForDesc(String desc){
        DefaultTableModel modelo = (DefaultTableModel) TabelaTitulo.getModel();
        modelo.setNumRows(0);
        FinanceiroSql pdao = new FinanceiroSql();
       
        for (Financeiro p : pdao.readForDesc(desc)) {
        
            modelo.addRow(new Object[]{
            p.getPrimaryKey(),
            p.getCliente(),
            p.getData(),
            p.getSituacao(),
            p.getTotal()
         
            
           
       });
    
    
    }
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar = new app.bolivia.swing.JCTextField();
        codigoL1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTitulo = new javax.swing.JTable();
        data = new com.toedter.calendar.JDateChooser();
        buscF = new javax.swing.JButton();
        ventasH = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        NomeT1 = new javax.swing.JLabel();
        ComboBoxVendedor = new org.bolivia.combo.SComboBoxBlue();
        STATUS = new javax.swing.JTextField();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contas a Receber");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setBackground(new java.awt.Color(34, 102, 145));
        buscar.setBorder(null);
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setOpaque(false);
        buscar.setPhColor(new java.awt.Color(255, 255, 255));
        buscar.setPlaceholder("NOME DO CLIENTE");
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, -1));

        codigoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/buscarL.png"))); // NOI18N
        jPanel1.add(codigoL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, 52));

        TabelaTitulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NÚMERO VENDA", "CLIENTE", "DATA", "SITUAÇÃO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaTituloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaTitulo);
        if (TabelaTitulo.getColumnModel().getColumnCount() > 0) {
            TabelaTitulo.getColumnModel().getColumn(0).setResizable(false);
            TabelaTitulo.getColumnModel().getColumn(1).setResizable(false);
            TabelaTitulo.getColumnModel().getColumn(2).setResizable(false);
            TabelaTitulo.getColumnModel().getColumn(3).setResizable(false);
            TabelaTitulo.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 950, 290));

        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 30));

        buscF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/buscaF1.png"))); // NOI18N
        buscF.setToolTipText("Buscar");
        buscF.setBorder(null);
        buscF.setBorderPainted(false);
        buscF.setContentAreaFilled(false);
        buscF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscF.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/buscaF2.png"))); // NOI18N
        buscF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscFActionPerformed(evt);
            }
        });
        jPanel1.add(buscF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        ventasH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ventasH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/vendasH.png"))); // NOI18N
        ventasH.setToolTipText("Buscar");
        ventasH.setBorder(null);
        ventasH.setBorderPainted(false);
        ventasH.setContentAreaFilled(false);
        ventasH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventasH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventasH.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/vendasH1.png"))); // NOI18N
        ventasH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventasH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasHActionPerformed(evt);
            }
        });
        jPanel1.add(ventasH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagar.png"))); // NOI18N
        eliminar.setText("BAIXAR");
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar.png"))); // NOI18N
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar.png"))); // NOI18N
        limpiar.setText("Limpar Campos");
        limpiar.setBorder(null);
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar1.png"))); // NOI18N
        limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        total.setBackground(new java.awt.Color(254, 254, 254));
        total.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 140, 30));

        NomeT1.setBackground(new java.awt.Color(254, 254, 254));
        NomeT1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        NomeT1.setForeground(new java.awt.Color(240, 240, 240));
        NomeT1.setText("Total :");
        jPanel1.add(NomeT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        ComboBoxVendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ABERTO", "BAIXADO", " " }));
        ComboBoxVendedor.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel1.add(ComboBoxVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 120, -1));

        STATUS.setEditable(false);
        STATUS.setText("BAIXADO");
        jPanel1.add(STATUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 60, 20));

        id.setEditable(false);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscFActionPerformed
        if (data.getDate() == null) {
            FinanceiroSql.listar("");
        } else {
            String formato = data.getDateFormatString();
            Date date = data.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            FinanceiroSql.listar(String.valueOf(sdf.format(date)));
        }
        getSum();
    }//GEN-LAST:event_buscFActionPerformed

    private void ventasHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasHActionPerformed
        Date sistemaData = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataH = formato.format(sistemaData);
        FinanceiroSql.listar(dataH);
        data.setDate(null);
    }//GEN-LAST:event_ventasHActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limparCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // getSum();
    }//GEN-LAST:event_formWindowOpened

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      baixar();

    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          readJTableForDesc(buscar.getText()); 
getSum();
            }

                    // TODO add your handling code here:
    }//GEN-LAST:event_buscarKeyPressed

    private void TabelaTituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaTituloMouseClicked
id.setText(TabelaTitulo.getValueAt(TabelaTitulo.getSelectedRow(),0).toString());  
//STATUS.setText(TabelaTitulo.getValueAt(TabelaTitulo.getSelectedRow(),3).toString());  // TODO add your handling code here:
    }//GEN-LAST:event_TabelaTituloMouseClicked


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
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContasReceber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.bolivia.combo.SComboBoxBlue ComboBoxVendedor;
    private javax.swing.JLabel NomeT1;
    private javax.swing.JTextField STATUS;
    public static javax.swing.JTable TabelaTitulo;
    private javax.swing.JButton buscF;
    private app.bolivia.swing.JCTextField buscar;
    private javax.swing.JLabel codigoL1;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel total;
    private javax.swing.JButton ventasH;
    // End of variables declaration//GEN-END:variables
}
