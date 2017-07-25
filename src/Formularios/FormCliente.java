package Formularios;


import tcc.telas.AdmFace;
import tcc.Cliente;
import tcc.Util.Validacao;

public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form formCliente
     */
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
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoCliente = new javax.swing.JTextArea();
        volta = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        botaoCadastrarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel4.setText("Telefone");
        jLabel4.setToolTipText("");

        foneCliente.setToolTipText("Ex.: (47) 9999-9999");
        foneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foneClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Celular");

        celularCliente.setToolTipText("Ex.: (47) 91234-5678");
        celularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço");

        enderecoCliente.setColumns(20);
        enderecoCliente.setRows(5);
        enderecoCliente.setToolTipText("Insira o nome da rua e o número");
        jScrollPane1.setViewportView(enderecoCliente);

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

        jLabel9.setText("CPF");

        cpfCliente.setToolTipText("Digite o CPF do cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCadastrarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(limpa)
                                .addGap(31, 31, 31)
                                .addComponent(volta)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(nomeCliente)
                            .addComponent(emailCliente)
                            .addComponent(foneCliente)
                            .addComponent(celularCliente)
                            .addComponent(cpfCliente))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(foneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(celularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volta)
                    .addComponent(limpa)
                    .addComponent(botaoCadastrarCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed
        //Validar nome do cliente;
        Validacao.validaTextos(nomeCliente);
        
    }//GEN-LAST:event_nomeClienteActionPerformed


    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailClienteActionPerformed

    private void foneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foneClienteActionPerformed
        
    }//GEN-LAST:event_foneClienteActionPerformed

    private void celularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularClienteActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_celularClienteActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        //volta para o menu AdmFace:
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_voltaActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpaActionPerformed

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
              
    Cliente cc = new Cliente();
    cc.cadastroCliente();
    
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed
    

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JTextField celularCliente;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JTextArea enderecoCliente;
    private javax.swing.JTextField foneCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpa;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
