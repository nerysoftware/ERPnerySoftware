/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.nerysoftware.produtos;

/**
 *
 * @author agn_a
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
    }

  public void limparCampos(){
      ean.setText("");
      nome.setText("");
      valorcompra.setText("");
      porcentagem.setText("");
      valorvenda.setText("");
      estoque.setText("");
      tipo.setSelectedItem("DIVERSOS");
      un.setSelectedItem("UN");
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tipo = new org.bolivia.combo.SComboBoxBlue();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        porcentagem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        valorcompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        valorvenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deletar = new javax.swing.JButton();
        un = new org.bolivia.combo.SComboBoxBlue();
        deletar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ean = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        excluirT = new javax.swing.JButton();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setBackground(new java.awt.Color(0, 102, 153));
        codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setOpaque(false);
        codigo.setPlaceholder("CODIGO");
        codigo.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        tipo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel2.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        nome.setBackground(new java.awt.Color(0, 102, 153));
        nome.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 220, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel1.setText("CÓDIGO DE INTERNO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        porcentagem.setBackground(new java.awt.Color(0, 102, 153));
        porcentagem.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        porcentagem.setForeground(new java.awt.Color(255, 255, 255));
        porcentagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        porcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                porcentagemKeyPressed(evt);
            }
        });
        jPanel2.add(porcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 90, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel2.setText("MARGEM DE LUCRO %");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 130, -1));

        valorcompra.setBackground(new java.awt.Color(0, 102, 153));
        valorcompra.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        valorcompra.setForeground(new java.awt.Color(255, 255, 255));
        valorcompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(valorcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 80, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("VALOR DE CUSTO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 110, -1));

        valorvenda.setBackground(new java.awt.Color(0, 102, 153));
        valorvenda.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        valorvenda.setForeground(new java.awt.Color(255, 255, 255));
        valorvenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(valorvenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 90, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel4.setText("VALOR DE VENDA");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 110, -1));

        estoque.setBackground(new java.awt.Color(0, 102, 153));
        estoque.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        estoque.setForeground(new java.awt.Color(255, 255, 255));
        estoque.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ESTOQUE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        deletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/Enviar.png"))); // NOI18N
        deletar.setBorder(null);
        deletar.setBorderPainted(false);
        deletar.setContentAreaFilled(false);
        deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nfce/cancelar2.png"))); // NOI18N
        deletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });
        jPanel2.add(deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 60, 100));

        un.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UN", "CX", "LT", "KG" }));
        un.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel2.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 140, -1));

        deletar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/Enviar.png"))); // NOI18N
        deletar1.setBorder(null);
        deletar1.setBorderPainted(false);
        deletar1.setContentAreaFilled(false);
        deletar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nfce/cancelar2.png"))); // NOI18N
        deletar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar1ActionPerformed(evt);
            }
        });
        jPanel2.add(deletar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 60, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TIPO DE PRODUTO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("UNIDADE DE MEDIDA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        ean.setBackground(new java.awt.Color(0, 102, 153));
        ean.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        ean.setForeground(new java.awt.Color(255, 255, 255));
        ean.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(ean, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 220, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel9.setText("NOME / DESCRIÇÃO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel8.setText("CÓDIGO DE BARRA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis1.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis2.png"))); // NOI18N
        registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        atualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar.png"))); // NOI18N
        atualizar.setBorder(null);
        atualizar.setBorderPainted(false);
        atualizar.setContentAreaFilled(false);
        atualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        atualizar.setLabel("Atualizar");
        atualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar1.png"))); // NOI18N
        atualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar1.png"))); // NOI18N
        atualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagar.png"))); // NOI18N
        excluir.setBorder(null);
        excluir.setBorderPainted(false);
        excluir.setContentAreaFilled(false);
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluir.setLabel("Excluir");
        excluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagar1.png"))); // NOI18N
        excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar.png"))); // NOI18N
        limpar.setBorder(null);
        limpar.setBorderPainted(false);
        limpar.setContentAreaFilled(false);
        limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpar.setLabel("Limpar Campos");
        limpar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar1.png"))); // NOI18N
        limpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        excluirT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        excluirT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagarT.png"))); // NOI18N
        excluirT.setBorder(null);
        excluirT.setBorderPainted(false);
        excluirT.setContentAreaFilled(false);
        excluirT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirT.setLabel("Excluir Tudo");
        excluirT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagarT1.png"))); // NOI18N
        excluirT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirTActionPerformed(evt);
            }
        });

        calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/calculator_78382 (1).png"))); // NOI18N
        calcular.setText("Calcular %");
        calcular.setBorder(null);
        calcular.setBorderPainted(false);
        calcular.setContentAreaFilled(false);
        calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/1486504359-calculate-business-finance-calculator-device-math_81327.png"))); // NOI18N
        calcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atualizar)
                .addGap(10, 10, 10)
                .addComponent(excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpar)
                .addGap(18, 18, 18)
                .addComponent(excluirT)
                .addGap(26, 26, 26)
                .addComponent(calcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcular)
                    .addComponent(registrar)
                    .addComponent(atualizar)
                    .addComponent(excluir)
                    .addComponent(limpar)
                    .addComponent(excluirT))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoKeyReleased

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoKeyTyped

    private void porcentagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcentagemKeyPressed
            // TODO add your handling code here:
    }//GEN-LAST:event_porcentagemKeyPressed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
     
    }//GEN-LAST:event_deletarActionPerformed

    private void deletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar1ActionPerformed
  
    }//GEN-LAST:event_deletar1ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

       
    }//GEN-LAST:event_registrarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
       
    }//GEN-LAST:event_atualizarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        
    }//GEN-LAST:event_excluirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
     limparCampos();
    }//GEN-LAST:event_limparActionPerformed

    private void excluirTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirTActionPerformed

        
    }//GEN-LAST:event_excluirTActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
       
    }//GEN-LAST:event_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.JButton calcular;
    public static final app.bolivia.swing.JCTextField codigo = new app.bolivia.swing.JCTextField();
    private javax.swing.JButton deletar;
    private javax.swing.JButton deletar1;
    private javax.swing.JTextField ean;
    private javax.swing.JTextField estoque;
    private javax.swing.JButton excluir;
    private javax.swing.JButton excluirT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField porcentagem;
    private javax.swing.JButton registrar;
    private org.bolivia.combo.SComboBoxBlue tipo;
    private org.bolivia.combo.SComboBoxBlue un;
    private javax.swing.JTextField valorcompra;
    private javax.swing.JTextField valorvenda;
    // End of variables declaration//GEN-END:variables
}
