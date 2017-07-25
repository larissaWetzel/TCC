package Formularios;

import tcc.Produto;
import tcc.telas.AdmFace;

public class FormProduto extends javax.swing.JFrame {

    public FormProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeProd = new javax.swing.JTextField();
        codProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qntProd = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        referenciaProd = new javax.swing.JTextField();
        botaoCadastrarProduto = new javax.swing.JButton();
        botaoLimparCampos = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/produtos.png"))); // NOI18N
        jLabel1.setText("Cadastro de Produtos:");

        jLabel2.setText("Nome do Produto");

        nomeProd.setToolTipText("Insira o nome do produto");
        nomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdActionPerformed(evt);
            }
        });

        codProd.setToolTipText("Insira o código do produto");
        codProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Código do Produto");

        jLabel4.setText("Preço unitário");

        preco.setToolTipText("Insira o preço do produto");

        jLabel5.setText("Quantidade");

        qntProd.setToolTipText("");

        jLabel6.setText("Referência");

        referenciaProd.setToolTipText("Insira a referência do produto");

        botaoCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoCadastrarProduto.setText("Cadastrar");

        botaoLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        botaoLimparCampos.setText("Limpar Campos");

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(botaoCadastrarProduto)
                                .addGap(18, 18, 18)
                                .addComponent(botaoLimparCampos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(codProd)
                                    .addComponent(preco)
                                    .addComponent(qntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referenciaProd))))
                        .addGap(18, 18, 18)
                        .addComponent(botaoVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(referenciaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarProduto)
                    .addComponent(botaoLimparCampos)
                    .addComponent(botaoVoltar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdActionPerformed
        // vai passar o nome do produto por parametro pra classe Produto pra poder validar.
        Produto cadastroProd = new Produto();
        cadastroProd.CadastroProd(nomeProd.getText());
    }//GEN-LAST:event_nomeProdActionPerformed

    private void codProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdActionPerformed
        //Não sei pq ta dando erro aqui.
        Produto cadastroProd = new Produto();
        cadastroProd.CadastroProd(codProd.getText());
        
    }//GEN-LAST:event_codProdActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarProduto;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField codProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeProd;
    private javax.swing.JTextField preco;
    private javax.swing.JSpinner qntProd;
    private javax.swing.JTextField referenciaProd;
    // End of variables declaration//GEN-END:variables
}
