package tcc.telas;

//Falta redimencionar, precisa da logo.

import Formularios.FormCliente;
import Formularios.FormProduto;


public class AdmFace extends javax.swing.JFrame {

    public AdmFace() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel4 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        botaoCadastraClientes = new javax.swing.JButton();
        botaoCadastraProdutos = new javax.swing.JButton();
        botaoRelatorio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientes = new javax.swing.JMenu();
        cadastraCliente = new javax.swing.JMenuItem();
        editaCliente = new javax.swing.JMenuItem();
        excluiCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        verClientes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        sairItemMenu = new javax.swing.JMenuItem();
        produtos = new javax.swing.JMenu();
        cadastraProd = new javax.swing.JMenuItem();
        editaProd = new javax.swing.JMenuItem();
        excluiProd = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        consulta = new javax.swing.JMenuItem();
        ralatorios = new javax.swing.JMenu();
        relatorios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        imprime = new javax.swing.JMenuItem();
        malha = new javax.swing.JMenu();
        reserva = new javax.swing.JMenu();
        estoque = new javax.swing.JMenu();
        atualiza = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex");
        setBackground(new java.awt.Color(255, 153, 153));

        botaoCadastraClientes.setText("Casdatrar Cliente");
        botaoCadastraClientes.setPreferredSize(new java.awt.Dimension(127, 23));
        botaoCadastraClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraClientesActionPerformed(evt);
            }
        });

        botaoCadastraProdutos.setText("Cadastrar Produto");
        botaoCadastraProdutos.setMaximumSize(new java.awt.Dimension(81, 23));
        botaoCadastraProdutos.setMinimumSize(new java.awt.Dimension(81, 23));
        botaoCadastraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraProdutosActionPerformed(evt);
            }
        });

        botaoRelatorio.setText("Relatórios");
        botaoRelatorio.setPreferredSize(new java.awt.Dimension(127, 23));
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/logotipo1.jpg"))); // NOI18N

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        clientes.setText("Clientes");

        cadastraCliente.setText("Cadastrar Cliente...");
        cadastraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraClienteActionPerformed(evt);
            }
        });
        clientes.add(cadastraCliente);

        editaCliente.setText("Editar Cliente...");
        editaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaClienteActionPerformed(evt);
            }
        });
        clientes.add(editaCliente);

        excluiCliente.setText("Excluir Cliente...");
        clientes.add(excluiCliente);
        clientes.add(jSeparator1);

        verClientes.setText("Ver Clientes...");
        clientes.add(verClientes);
        clientes.add(jSeparator3);

        sairItemMenu.setText("Sair");
        clientes.add(sairItemMenu);

        jMenuBar1.add(clientes);

        produtos.setText("Produtos");

        cadastraProd.setText("Cadastrar Produto...");
        cadastraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraProdActionPerformed(evt);
            }
        });
        produtos.add(cadastraProd);

        editaProd.setText("Editar Produto...");
        editaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaProdActionPerformed(evt);
            }
        });
        produtos.add(editaProd);

        excluiProd.setText("Excluir Produto...");
        produtos.add(excluiProd);
        produtos.add(jSeparator4);

        consulta.setText("Consultar Produto...");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        produtos.add(consulta);

        jMenuBar1.add(produtos);

        ralatorios.setText("Relatórios");

        relatorios.setText("Ver Relatórios...");
        relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosActionPerformed(evt);
            }
        });
        ralatorios.add(relatorios);
        ralatorios.add(jSeparator2);

        imprime.setText("Imprimir...");
        ralatorios.add(imprime);

        jMenuBar1.add(ralatorios);

        malha.setText("Malha");
        jMenuBar1.add(malha);

        reserva.setText("Reservas");
        jMenuBar1.add(reserva);

        estoque.setText("Estoque");

        atualiza.setText("Atualizar Vendas...");
        estoque.add(atualiza);

        jMenuBar1.add(estoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(botaoCadastraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCadastraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoCadastraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraClienteActionPerformed
        FormCliente formCliente = new FormCliente();
        formCliente.setVisible(true);
        
    }//GEN-LAST:event_cadastraClienteActionPerformed

    private void relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosActionPerformed
        
    }//GEN-LAST:event_relatoriosActionPerformed

    private void botaoCadastraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraProdutosActionPerformed
        FormProduto formProduto = new FormProduto();
        formProduto.setVisible(true);
    }//GEN-LAST:event_botaoCadastraProdutosActionPerformed

    private void botaoCadastraClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraClientesActionPerformed
         FormCliente formCliente = new FormCliente();
         formCliente.setVisible(true);
    }//GEN-LAST:event_botaoCadastraClientesActionPerformed

    private void cadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraProdActionPerformed
        FormProduto formProduto = new FormProduto();
        formProduto.setVisible(true);
        
    }//GEN-LAST:event_cadastraProdActionPerformed

    private void editaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaClienteActionPerformed
       
    }//GEN-LAST:event_editaClienteActionPerformed

    private void editaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaProdActionPerformed
        
    }//GEN-LAST:event_editaProdActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        
    }//GEN-LAST:event_consultaActionPerformed

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed
        Relatorios r = new Relatorios();
        r.setVisible(true);
        
    }//GEN-LAST:event_botaoRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(AdmFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem atualiza;
    private javax.swing.JButton botaoCadastraClientes;
    private javax.swing.JButton botaoCadastraProdutos;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JMenuItem cadastraCliente;
    private javax.swing.JMenuItem cadastraProd;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem consulta;
    private javax.swing.JMenuItem editaCliente;
    private javax.swing.JMenuItem editaProd;
    private javax.swing.JMenu estoque;
    private javax.swing.JMenuItem excluiCliente;
    private javax.swing.JMenuItem excluiProd;
    private javax.swing.JMenuItem imprime;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu malha;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu produtos;
    private javax.swing.JMenu ralatorios;
    private javax.swing.JMenuItem relatorios;
    private javax.swing.JMenu reserva;
    private javax.swing.JMenuItem sairItemMenu;
    private javax.swing.JMenuItem verClientes;
    // End of variables declaration//GEN-END:variables
}
