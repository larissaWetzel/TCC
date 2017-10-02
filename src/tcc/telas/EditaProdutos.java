package tcc.telas;

import java.sql.SQLException;
import tcc.DAO.ProdutoDAO;
import tcc.DTO.ProdutoDTO;
import tcc.Util.Mensagens;

public class EditaProdutos extends javax.swing.JFrame {

    private static ProdutoDTO produtoDTO;
    private String novoNome;
    private int novoQnt, cod;
    private float novoPreco;

    ProdutoDAO pDAO = new ProdutoDAO();

    public EditaProdutos() {
        initComponents();
        PanelAlteraProd.setVisible(false);
        botaoAlteraProduto.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buscaCodigoProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoProcura = new javax.swing.JButton();
        PanelAlteraProd = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        boxNome = new javax.swing.JCheckBox();
        boxQnt = new javax.swing.JCheckBox();
        boxPreco = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        novoNomeProd = new javax.swing.JTextField();
        novoQntProd = new javax.swing.JTextField();
        novoPrecoProd = new javax.swing.JTextField();
        botaoAlteraProduto = new javax.swing.JButton();
        botaoVolta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex - Alteração");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/alterar.png"))); // NOI18N
        jLabel1.setText("Alteração de produtos");

        buscaCodigoProd.setToolTipText("Insira o código do produto");
        buscaCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCodigoProdActionPerformed(evt);
            }
        });

        jLabel2.setText("Insira o código do produto:");

        botaoProcura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/busca.png"))); // NOI18N
        botaoProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione os campos a serem alterados do produto: ");

        boxNome.setText("Nome");
        boxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNomeActionPerformed(evt);
            }
        });

        boxQnt.setText("Quantidade");
        boxQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxQntActionPerformed(evt);
            }
        });

        boxPreco.setText("Preço");
        boxPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPrecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome do Produto:  ");

        jLabel5.setText("Quantidade: ");

        jLabel6.setText("Preço:");

        javax.swing.GroupLayout PanelAlteraProdLayout = new javax.swing.GroupLayout(PanelAlteraProd);
        PanelAlteraProd.setLayout(PanelAlteraProdLayout);
        PanelAlteraProdLayout.setHorizontalGroup(
            PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                        .addComponent(boxNome)
                        .addGap(10, 10, 10)
                        .addComponent(boxQnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxPreco))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(novoPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanelAlteraProdLayout.setVerticalGroup(
            PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlteraProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNome)
                    .addComponent(boxQnt)
                    .addComponent(boxPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(novoNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(novoQntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAlteraProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(novoPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoAlteraProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoAlteraProduto.setText("Alterar");
        botaoAlteraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlteraProdutoActionPerformed(evt);
            }
        });

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(buscaCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoProcura))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelAlteraProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoAlteraProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoVolta)))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(buscaCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(PanelAlteraProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlteraProduto)
                    .addComponent(botaoVolta))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCodigoProdActionPerformed

    }//GEN-LAST:event_buscaCodigoProdActionPerformed

    private void botaoProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraActionPerformed

        String cod = buscaCodigoProd.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            buscaCodigoProd.requestFocus();
        } else {
            int c = Integer.parseInt(cod);
            try {
                if (pDAO.verificaCod(c)) {
                    botaoProcura.setEnabled(false);
                    PanelAlteraProd.setVisible(true);
                    botaoAlteraProduto.setEnabled(true);
                    novoNomeProd.setEditable(false);
                    novoQntProd.setEditable(false);
                    novoPrecoProd.setEditable(false);
                } else {
                    Mensagens.Aviso("O código informado não existe ou não esta cadastrado no banco de dados");
                    buscaCodigoProd.requestFocus();
                }
                produtoDTO = pDAO.pegaBD(c);
                novoNomeProd.setText(produtoDTO.getNomeProd());
                novoQntProd.setText("" + produtoDTO.getQntProd());
                novoPrecoProd.setText("" + produtoDTO.getPrecoProd());

            } catch (SQLException ex) {
                Mensagens.Erro("Erro com o banco de dados");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_botaoProcuraActionPerformed

    private void botaoAlteraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlteraProdutoActionPerformed
        if (buscaCodigoProd.isEnabled()) {
            buscaCodigoProd.setEnabled(false);
            if (boxNome.isSelected()) {
                if (novoNomeProd.getText().isEmpty()) {
                    Mensagens.Aviso("Informe o novo nome para alterar");
                    return;
                } else {
                    novoNome = novoNomeProd.getText();
                }

            } else {
                novoNome = produtoDTO.getNomeProd();
            }

            if (boxQnt.isSelected()) {
                if (novoQntProd.getText().isEmpty()) {
                    Mensagens.Aviso("Informe a nova quantidade para alterar");
                    return;
                } else {
                    novoQnt = Integer.parseInt(novoQntProd.getText());
                }
            } else {
                novoQnt = produtoDTO.getQntProd();
            }

            if (boxPreco.isSelected()) {
                if (novoPrecoProd.getText().isEmpty()) {
                    Mensagens.Aviso("Informe o novo preço para alterar");
                    return;
                } else {
                    novoPreco = Float.valueOf(novoPrecoProd.getText());
                }
            } else {
                novoPreco = produtoDTO.getPrecoProd();
            }

            cod = Integer.parseInt(buscaCodigoProd.getText());
            try {
                pDAO.alteraProd(novoNome, novoQnt, novoPreco, cod);
                Mensagens.Info("Dados atualizados com sucesso.");
                buscaCodigoProd.setEditable(true);
                buscaCodigoProd.setText("");
                botaoProcura.setEnabled(true);
                novoQntProd.setText("");
                novoNomeProd.setText("");
                novoPrecoProd.setEditable(false);
                novoNomeProd.setEditable(false);
                novoPrecoProd.setText("");
                boxNome.setSelected(false);
                boxQnt.setSelected(false);
                boxPreco.setSelected(false);
            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro no Banco de Dados");
            }
        }


    }//GEN-LAST:event_botaoAlteraProdutoActionPerformed

    private void boxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNomeActionPerformed
        if (boxNome.isSelected()) {
            novoNomeProd.setEditable(true);
        } else {
            novoNomeProd.setEditable(false);
        }
    }//GEN-LAST:event_boxNomeActionPerformed

    private void boxQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxQntActionPerformed
        if (boxQnt.isSelected()) {
            novoQntProd.setEditable(true);
        } else {
            novoQntProd.setEditable(false);
        }
    }//GEN-LAST:event_boxQntActionPerformed

    private void boxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPrecoActionPerformed
        if (boxPreco.isSelected()) {
            novoPrecoProd.setEditable(true);
        } else {
            novoPrecoProd.setEditable(false);
        }
    }//GEN-LAST:event_boxPrecoActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAlteraProd;
    private javax.swing.JButton botaoAlteraProduto;
    private javax.swing.JButton botaoProcura;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JCheckBox boxNome;
    private javax.swing.JCheckBox boxPreco;
    private javax.swing.JCheckBox boxQnt;
    private javax.swing.JTextField buscaCodigoProd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField novoNomeProd;
    private javax.swing.JTextField novoPrecoProd;
    private javax.swing.JTextField novoQntProd;
    // End of variables declaration//GEN-END:variables
}
