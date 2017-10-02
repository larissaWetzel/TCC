package tcc.telas;

import java.sql.SQLException;
import tcc.DAO.ClienteDAO;
import tcc.DTO.ClienteDTO;
import tcc.Util.Mensagens;

public class EditaClientes extends javax.swing.JFrame {

    ClienteDAO cDAO = new ClienteDAO();
    ClienteDTO cDTO = new ClienteDTO();
    private String novoN, novoEn, novoEm, novoT, novoC, cod;
    
   

    public EditaClientes() {
        initComponents();
        PanelCliente.setVisible(false);
        botaoAlteraCliente.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buscaCodCliente = new javax.swing.JTextField();
        botaoProcura = new javax.swing.JButton();
        PanelCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        boxNome = new javax.swing.JCheckBox();
        boxTelefone = new javax.swing.JCheckBox();
        boxCelular = new javax.swing.JCheckBox();
        boxEndereco = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        boxEmail = new javax.swing.JCheckBox();
        novoNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        novoTelefone = new javax.swing.JTextField();
        novoCelular = new javax.swing.JTextField();
        novoEmail = new javax.swing.JTextField();
        novoEndereco = new javax.swing.JTextField();
        botaoVolta = new javax.swing.JButton();
        botaoAlteraCliente = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex - Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/alterar.png"))); // NOI18N
        jLabel2.setText("Alteração de Clientes");

        jLabel1.setText("Insira o código do cliente: ");

        buscaCodCliente.setToolTipText("Insira o código do cliente");

        botaoProcura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/busca.png"))); // NOI18N
        botaoProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione os campos a serem alterados do cliente: ");

        boxNome.setText("Nome");
        boxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNomeActionPerformed(evt);
            }
        });

        boxTelefone.setText("Telefone");
        boxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTelefoneActionPerformed(evt);
            }
        });

        boxCelular.setText("Celular");
        boxCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCelularActionPerformed(evt);
            }
        });

        boxEndereco.setText("Endereço");
        boxEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome do cliente: ");

        boxEmail.setText("Email");
        boxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEmailActionPerformed(evt);
            }
        });

        novoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoNomeActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone: ");

        jLabel6.setText("Celular: ");

        jLabel7.setText("Endereço: ");

        jLabel8.setText("Email: ");

        novoTelefone.setToolTipText("Ex.: 4712345678");

        novoCelular.setToolTipText("Ex.: 47912345678");

        novoEmail.setToolTipText("Ex.: email@gmail.com");

        novoEndereco.setToolTipText("");

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addComponent(boxNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxEmail))
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(novoNome)
                                .addGap(91, 91, 91)))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(novoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(novoTelefone))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(novoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 132, Short.MAX_VALUE))))
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNome)
                    .addComponent(boxTelefone)
                    .addComponent(boxCelular)
                    .addComponent(boxEndereco)
                    .addComponent(boxEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(novoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(novoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        botaoAlteraCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoAlteraCliente.setText("Alterar");
        botaoAlteraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteraClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscaCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProcura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAlteraCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVolta)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscaCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVolta)
                    .addComponent(botaoAlteraCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoNomeActionPerformed
       
    }//GEN-LAST:event_novoNomeActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltaActionPerformed

    private void botaoProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraActionPerformed
       
        cod = buscaCodCliente.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            buscaCodCliente.requestFocus();
        } else {
            int c = Integer.parseInt(cod);
            try {
                if (cDAO.verificaCod(c)) {
                    botaoProcura.setEnabled(false);
                    PanelCliente.setVisible(true);
                    botaoAlteraCliente.setEnabled(true);
                    novoNome.setEditable(false);
                    novoTelefone.setEditable(false);
                    novoCelular.setEditable(false);
                    novoEmail.setEditable(false);
                    novoEndereco.setEditable(false);
                } else {
                    Mensagens.Aviso("O código informado não existe ou não esta cadastrado no banco de dados");
                    buscaCodCliente.requestFocus();
                }
                cDTO = cDAO.pegaBD(c);
                novoNome.setText(cDTO.getNomeCliente());
                novoTelefone.setText( cDTO.getFoneCliente());
                novoCelular.setText( cDTO.getCelularCliente());
                novoEndereco.setText( cDTO.getEnderecoCliente());
                novoEmail.setText("" + cDTO.getEmailCliente());

            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro com o Banco de Dados");
            }
        }
    }//GEN-LAST:event_botaoProcuraActionPerformed

    private void botaoAlteraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlteraClienteActionPerformed
        cod = buscaCodCliente.getText();
        if (buscaCodCliente.isEnabled()) {
            buscaCodCliente.setEditable(false);
            if (boxNome.isSelected()) {
                if (novoNome.getText().isEmpty()) {
                    Mensagens.Aviso("Informe o novo nome para alterar");
                    return;
                } else {
                    novoN = novoNome.getText();
                }
            } else {
                novoN = cDTO.getNomeCliente();
            }
             
            //Telefone
            if (boxTelefone.isSelected()) {
                if (novoTelefone.getText().isEmpty()) {
                    Mensagens.Aviso("Informe um novo telefone \n " + novoTelefone.getToolTipText());
                    return;
                } else {
                    novoT = novoTelefone.getText();
                }
            } else {
                novoT = cDTO.getFoneCliente();
            }
            
            //Celular
            if (boxCelular.isSelected()) {
                if (novoCelular.getText().isEmpty()) {
                    Mensagens.Aviso("Informe um novo celular \n " + novoCelular.getToolTipText());
                    return;
                } else {
                    novoC = novoCelular.getText();
                }
            } else {
                novoC = cDTO.getCelularCliente();
            }
            
            //Email
            if(boxEmail.isSelected()){
                if(novoEmail.getText().isEmpty()){
                    Mensagens.Aviso("Informe o novo email para alterar");
                    return;
                } else {
                    novoEm = novoEmail.getText();
                }
            } else {
                novoEm = cDTO.getEmailCliente();
            }
            
            //Endereço
            if(boxEndereco.isSelected()){
                if(novoEndereco.getText().isEmpty()){
                   Mensagens.Aviso("Informe o novo endereço para alterar");
                   return; 
                } else {
                    novoEn = novoEndereco.getText();
                }
            } else {
                novoEn = cDTO.getEnderecoCliente();
            }
                     
            
            try {
                cDAO.alteraCliente(novoN, novoT, novoC, novoEm, novoEn, cod);
                Mensagens.Info("Dados atualizados com sucesso.");
                buscaCodCliente.setEditable(true);
                buscaCodCliente.setText("");
                botaoProcura.setEnabled(true);
                novoNome.setText("");
                novoTelefone.setText("");
                novoCelular.setText("");
                novoEmail.setText("");
                novoEndereco.setText("");
                novoNome.setEditable(false);
                novoTelefone.setEditable(false);
                novoCelular.setEditable(false);
                novoEmail.setEditable(false);
                novoEndereco.setEditable(false);
                boxNome.setSelected(false);
                boxTelefone.setSelected(false);
                boxCelular.setSelected(false);
                boxEndereco.setSelected(false);
                boxEmail.setSelected(false);
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro com o Banco de Dados");
            }
        }
    }//GEN-LAST:event_botaoAlteraClienteActionPerformed

    private void boxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNomeActionPerformed
        if (boxNome.isSelected()) {
            novoNome.setEditable(true);
        } else {
            novoNome.setEditable(false);
        }
    }//GEN-LAST:event_boxNomeActionPerformed

    private void boxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTelefoneActionPerformed
       if (boxTelefone.isSelected()) {
            novoTelefone.setEditable(true);
        } else {
            novoTelefone.setEditable(false);
        }
    }//GEN-LAST:event_boxTelefoneActionPerformed

    private void boxCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCelularActionPerformed
        if (boxCelular.isSelected()) {
            novoCelular.setEditable(true);
        } else {
            novoCelular.setEditable(false);
        }
    }//GEN-LAST:event_boxCelularActionPerformed

    private void boxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEnderecoActionPerformed
        if (boxEndereco.isSelected()) {
            novoEndereco.setEditable(true);
        } else {
            novoEndereco.setEditable(false);
        }
    }//GEN-LAST:event_boxEnderecoActionPerformed

    private void boxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEmailActionPerformed
        if (boxEmail.isSelected()) {
            novoEmail.setEditable(true);
        } else {
            novoEmail.setEditable(false);
        }
    }//GEN-LAST:event_boxEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JButton botaoAlteraCliente;
    private javax.swing.JButton botaoProcura;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JCheckBox boxCelular;
    private javax.swing.JCheckBox boxEmail;
    private javax.swing.JCheckBox boxEndereco;
    private javax.swing.JCheckBox boxNome;
    private javax.swing.JCheckBox boxTelefone;
    private javax.swing.JTextField buscaCodCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField novoCelular;
    private javax.swing.JTextField novoEmail;
    private javax.swing.JTextField novoEndereco;
    private javax.swing.JTextField novoNome;
    private javax.swing.JTextField novoTelefone;
    // End of variables declaration//GEN-END:variables
}
