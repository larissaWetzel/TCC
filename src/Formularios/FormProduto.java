package Formularios;

// pronto, por enquanto.

import java.sql.SQLException;
import tcc.DAO.ProdutoDAO;
import tcc.Util.Mensagens;
import tcc.telas.AdmFace;

public class FormProduto extends javax.swing.JFrame {

    private float p;
    private int q;
    private String n, t;

    public FormProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precoProd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botaoCadastrarProduto = new javax.swing.JButton();
        botaoLimparCampos = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        qntProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoP = new javax.swing.JRadioButton();
        botaoM = new javax.swing.JRadioButton();
        botaoG = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/produtos.png"))); // NOI18N
        jLabel1.setText("Cadastro de Produtos:");

        jLabel2.setText("Nome do Produto");

        nomeProd.setToolTipText("Insira o nome do produto");
        nomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço unitário");

        precoProd.setToolTipText("Insira o preço do produto");
        precoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoProdKeyTyped(evt);
            }
        });

        jLabel5.setText("Quantidade");

        botaoCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoCadastrarProduto.setText("Cadastrar");
        botaoCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarProdutoActionPerformed(evt);
            }
        });

        botaoLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        botaoLimparCampos.setText("Limpar Campos");
        botaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCamposActionPerformed(evt);
            }
        });

        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        qntProd.setToolTipText("Insira a quantidade");
        qntProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qntProdKeyTyped(evt);
            }
        });

        jLabel3.setText("Tamanho:");

        buttonGroup1.add(botaoP);
        botaoP.setText("Pequeno");
        botaoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoM);
        botaoM.setText("Médio");
        botaoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoG);
        botaoG.setText("Grande");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Ex.:50.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(qntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel5)))
                            .addGap(13, 13, 13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(botaoVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCadastrarProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimparCampos)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoP)
                .addGap(18, 18, 18)
                .addComponent(botaoM)
                .addGap(18, 18, 18)
                .addComponent(botaoG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoP)
                    .addComponent(botaoM)
                    .addComponent(botaoG))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparCampos)
                    .addComponent(botaoCadastrarProduto))
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdActionPerformed
        // vai passar o nome do produto por parametro pra classe Produto pra poder validar.
    }//GEN-LAST:event_nomeProdActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCamposActionPerformed
        nomeProd.setText("");
        precoProd.setText("");
        qntProd.setText("");
    }//GEN-LAST:event_botaoLimparCamposActionPerformed

    private void botaoCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutoActionPerformed
         String preco = precoProd.getText().trim();
        String qnt = qntProd.getText().trim();
        p = Float.parseFloat(preco);
        q = Integer.parseInt(qnt);
        n = nomeProd.getText().trim();

        if (n.isEmpty() || preco.isEmpty() || qnt.isEmpty() || buttonGroup1.isSelected(null)) {
            Mensagens.Aviso("Verifique se todos os campos foram preenchidos corretamente.");
        } else {
            if (botaoP.isSelected()) {
                t = "P";
            } else if (botaoM.isSelected()) {
                t = "M";
            } else if (botaoG.isSelected()) {
                t = "G";
            } 
            ProdutoDAO pDAO = new ProdutoDAO();
            try {
                pDAO.cadastraProdutos(p, q, n, t);
                Mensagens.Info("Produto cadastrado com sucesso");
                nomeProd.setText("");
                precoProd.setText("");
                qntProd.setText("");
                botaoG.setSelected(false);
                botaoM.setSelected(false);
                botaoP.setSelected(false);
                nomeProd.requestFocus();
            } catch (SQLException ex) {
                Mensagens.Erro("Erro com o banco de dados");
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_botaoCadastrarProdutoActionPerformed

    private void botaoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPActionPerformed

    private void botaoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMActionPerformed

    private void precoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoProdKeyTyped
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_precoProdKeyTyped

    private void qntProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntProdKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_qntProdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarProduto;
    private javax.swing.JRadioButton botaoG;
    private javax.swing.JButton botaoLimparCampos;
    private javax.swing.JRadioButton botaoM;
    private javax.swing.JRadioButton botaoP;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nomeProd;
    private javax.swing.JTextField precoProd;
    private javax.swing.JTextField qntProd;
    // End of variables declaration//GEN-END:variables
}
