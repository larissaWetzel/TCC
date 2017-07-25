package tcc.telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcc.DAO.ProdutoDAO;
import tcc.Util.Mensagens;

public class BuscaProdutos extends javax.swing.JFrame {

    private int c;

    public BuscaProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscaCodigoProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoEditaCliente = new javax.swing.JButton();
        botaoExcluiProd = new javax.swing.JButton();
        volta = new javax.swing.JButton();
        botaoProcura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex - Produtos");

        buscaCodigoProd.setToolTipText("Insira o código do produto");
        buscaCodigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCodigoProdActionPerformed(evt);
            }
        });

        jLabel2.setText("Busca de Produtos:");

        jLabel1.setText("Insira o código do produto:");

        botaoEditaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/alterar.png"))); // NOI18N
        botaoEditaCliente.setText("Alterar Produto");
        botaoEditaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditaClienteActionPerformed(evt);
            }
        });

        botaoExcluiProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        botaoExcluiProd.setText("Excluir Produto");
        botaoExcluiProd.setToolTipText("");
        botaoExcluiProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluiProdActionPerformed(evt);
            }
        });

        volta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });

        botaoProcura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/busca.png"))); // NOI18N
        botaoProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoEditaCliente)
                        .addGap(29, 29, 29)
                        .addComponent(botaoExcluiProd)
                        .addGap(29, 29, 29)
                        .addComponent(volta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(buscaCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoProcura)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscaCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditaCliente)
                    .addComponent(botaoExcluiProd)
                    .addComponent(volta))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaCodigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCodigoProdActionPerformed
        //Inserir o código do produto, se n existir mostra um aviso que o produto não foi cadastrado
        //se existir, mostrar dados do produto e habilitar os botões de editar e excluir.
    }//GEN-LAST:event_buscaCodigoProdActionPerformed

    private void botaoEditaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditaClienteActionPerformed
        EditaProdutos ep = new EditaProdutos();
        ep.setVisible(true);
        ep.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_botaoEditaClienteActionPerformed

    private void botaoExcluiProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluiProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluiProdActionPerformed

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_voltaActionPerformed

    private void botaoProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraActionPerformed
        
        String cod = buscaCodigoProd.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            buscaCodigoProd.requestFocus();
        } else {
            c = Integer.parseInt(cod);
            ProdutoDAO pDAO = new ProdutoDAO();
            try {
                pDAO.mostraProdutos(c);
            } catch (SQLException ex) {
                Mensagens.Erro("Erro com o banco de dados");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_botaoProcuraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditaCliente;
    private javax.swing.JButton botaoExcluiProd;
    private javax.swing.JButton botaoProcura;
    private javax.swing.JTextField buscaCodigoProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
