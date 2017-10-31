package Formularios;

import java.sql.SQLException;
import tcc.DAO.ClienteDAO;
import tcc.Util.Mensagens;
import tcc.telas.AdmFace;
import tcc.Util.Validacao;

public class FormCliente extends javax.swing.JFrame {

    private String n;
    private String f;
    private String c;
    private String email;
    private String e;

    public FormCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        foneCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        celularCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        volta = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        botaoCadastrarCliente = new javax.swing.JButton();
        enderecoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/usuario.png"))); // NOI18N
        jLabel1.setText("Cadastro de Clientes: ");

        jLabel2.setText("Nome Completo");
        jLabel2.setToolTipText("");

        nomeCliente.setToolTipText("Insira o nome completo do cliente");
        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        emailCliente.setToolTipText("Insira o email do cliente");
        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone *");
        jLabel4.setToolTipText("");

        foneCliente.setToolTipText("Digite o telefone do cliente. Modelo:(12)12345678 ");
        foneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foneClienteActionPerformed(evt);
            }
        });
        foneCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                foneClienteKeyTyped(evt);
            }
        });

        jLabel5.setText("Celular *");

        celularCliente.setToolTipText("Digite o celular do cliente. Modelo(12)123456789");
        celularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularClienteActionPerformed(evt);
            }
        });
        celularCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularClienteKeyTyped(evt);
            }
        });

        jLabel6.setText("Endereço");

        volta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });

        limpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        limpa.setText("Limpar campos");
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });

        botaoCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoCadastrarCliente.setText("Cadastrar");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        enderecoCliente.setToolTipText("Insira o nome da rua e o número");
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("* somente números");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(celularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(limpa)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(celularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpa)
                    .addComponent(botaoCadastrarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(volta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed

    }//GEN-LAST:event_nomeClienteActionPerformed


    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed

    }//GEN-LAST:event_emailClienteActionPerformed

    private void foneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foneClienteActionPerformed

    }//GEN-LAST:event_foneClienteActionPerformed

    private void celularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularClienteActionPerformed

    }//GEN-LAST:event_celularClienteActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        //volta para o menu AdmFace:
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_voltaActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        // Limpar campos
        nomeCliente.setText("");
        foneCliente.setText("");
        celularCliente.setText("");
        emailCliente.setText("");
        enderecoCliente.setText("");
    }//GEN-LAST:event_limpaActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        n = nomeCliente.getText().trim();
        f = foneCliente.getText().trim();
        c = celularCliente.getText().trim();
        email = emailCliente.getText().trim();
        e = enderecoCliente.getText().trim();
        if (n.isEmpty() || f.isEmpty() || c.isEmpty() || email.isEmpty() || e.isEmpty()) {
            Mensagens.Aviso("Alguns dados não foram preenchidos corretamente");
        } else {
            if (f.length() != 12) {
                Mensagens.Aviso(foneCliente.getToolTipText());
                foneCliente.requestFocus();
            } else {
                if (c.length() != 13) {
                    Mensagens.Aviso(celularCliente.getToolTipText());
                    celularCliente.requestFocus();
                } else {
                    ClienteDAO cDAO = new ClienteDAO();
                    try {
                        cDAO.cadastraClientes(n, f, c, email, e);
                        Mensagens.Info("Cliente cadastrado com sucesso");
                        nomeCliente.requestFocus();
                        nomeCliente.setText("");
                        foneCliente.setText("");
                        celularCliente.setText("");
                        emailCliente.setText("");
                        enderecoCliente.setText("");
                        nomeCliente.requestFocus();
                    } catch (SQLException ex) {
                        Mensagens.Erro("Erro com o banco de dados");
                        ex.printStackTrace();
                    }

                }
            }

        }

    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed
        Validacao.validaTextos(enderecoCliente);
        enderecoCliente.getText();
    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void foneClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_foneClienteKeyTyped
        String caracteres = "0987654321()";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_foneClienteKeyTyped

    private void celularClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularClienteKeyTyped
        String caracteres = "0987654321()";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_celularClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JTextField celularCliente;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JTextField enderecoCliente;
    private javax.swing.JTextField foneCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton limpa;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
