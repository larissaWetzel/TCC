package tcc.telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcc.DAO.ProdutoDAO;
import tcc.DTO.ProdutoDTO;
import tcc.Util.Mensagens;

public class Baixa extends javax.swing.JFrame {

    private String cod;
    ProdutoDAO pDAO = new ProdutoDAO();
    ProdutoDTO pDTO = new ProdutoDTO();

    public Baixa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscaCodProd = new javax.swing.JTextField();
        botaoBusca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeQnt = new javax.swing.JTextField();
        botaoRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelDados = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        tamanho = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botaoVolta = new javax.swing.JButton();
        campoQnd = new javax.swing.JTextField();
        campoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código do produto:");

        jLabel2.setText("Atualização do estoque");

        buscaCodProd.setToolTipText("Informe o código do produto a ser removido de estoque:");

        botaoBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/busca.png"))); // NOI18N
        botaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaActionPerformed(evt);
            }
        });

        jLabel3.setText("Dados:");

        jLabel4.setText("Quantidade a ser vendida do estoque:");

        botaoRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoveActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade retirada do estoque: ");

        jLabel6.setText("total vendido");

        jLabel7.setText("adicionar no relatório diario e mensal");

        nome.setEditable(false);

        qtd.setEditable(false);
        qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdActionPerformed(evt);
            }
        });

        preco.setEditable(false);

        tamanho.setEditable(false);

        jLabel10.setText("Qtd:");

        jLabel11.setText("Tam:");

        jLabel8.setText("Nome:");

        jLabel9.setText("Preço:");

        javax.swing.GroupLayout PanelDadosLayout = new javax.swing.GroupLayout(PanelDados);
        PanelDados.setLayout(PanelDadosLayout);
        PanelDadosLayout.setHorizontalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelDadosLayout.setVerticalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        campoQnd.setEditable(false);
        campoQnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQndActionPerformed(evt);
            }
        });

        campoTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaCodProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoBusca)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoQnd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(removeQnt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoRemove)))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVolta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBusca)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(buscaCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoRemove)
                    .addComponent(removeQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoQnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(botaoVolta)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaActionPerformed
        cod = buscaCodProd.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            buscaCodProd.requestFocus();
        } else {

            int c = Integer.parseInt(cod);
            try {
                if (pDAO.verificaCod(c)) {

                } else {
                    Mensagens.Aviso("O código informado não existe ou não esta cadastrado no banco de dados");
                    buscaCodProd.requestFocus();
                }
                pDTO = pDAO.pegaBD(c);
                PanelDados.setVisible(true);
                nome.setText(pDTO.getNomeProd());
                String p = Float.toString(pDTO.getPrecoProd());
                String q = Integer.toString(pDTO.getQntProd());
                qtd.setText(q);
                preco.setText(p);
                tamanho.setText(pDTO.getTamProd());

            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro com o banco de dados");
            }
        }
    }//GEN-LAST:event_botaoBuscaActionPerformed

    private void botaoRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoveActionPerformed
        int qnt = Integer.parseInt(removeQnt.getText());
        int c = Integer.parseInt(buscaCodProd.getText());
        try {
            if (qnt <= pDTO.getQntProd() && qnt >= 1) {
                int qntAnt =  pDTO.getQntProd();
                int total =  qntAnt - qnt;
                pDAO.baixaEstoque(total,c);
                Mensagens.Info("Estoque atualizado \n"
                        + "Quantidade atual: " + total);
                
            } else {
                Mensagens.Aviso("Quantidade inválida \n"
                        + "Deve ser maior que 1 e menor que " + pDTO.getQntProd() + ".");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Mensagens.Erro("Erro com o banco de dados");
        }

    }//GEN-LAST:event_botaoRemoveActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltaActionPerformed

    private void qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdActionPerformed

    private void campoQndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQndActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDados;
    private javax.swing.JButton botaoBusca;
    private javax.swing.JButton botaoRemove;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JTextField buscaCodProd;
    private javax.swing.JTextField campoQnd;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtd;
    private javax.swing.JTextField removeQnt;
    private javax.swing.JTextField tamanho;
    // End of variables declaration//GEN-END:variables
}
