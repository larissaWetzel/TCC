package tcc.telas;

import java.sql.SQLException;
import tcc.DAO.ProdutoDAO;
import tcc.DTO.ProdutoDTO;
import tcc.Util.Mensagens;

public class RemoveProduto extends javax.swing.JFrame {

    private String cod;
    ProdutoDAO pDAO = new ProdutoDAO();
    ProdutoDTO pDTO = new ProdutoDTO();

    public RemoveProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscaCodProd = new javax.swing.JTextField();
        botaoProcura = new javax.swing.JButton();
        PanelDados = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tamanho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botaoVolta = new javax.swing.JButton();
        botaoExclui = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/produtos.png"))); // NOI18N
        jLabel1.setText("Exclusão de Produtos");

        jLabel2.setText("Informe o código do produto: ");

        botaoProcura.setText("Buscar");
        botaoProcura.setActionCommand("buscar");
        botaoProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcuraActionPerformed(evt);
            }
        });

        nome.setEditable(false);

        qtd.setEditable(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Preço:");

        tamanho.setEditable(false);

        jLabel5.setText("Qtd:");

        preco.setEditable(false);

        jLabel6.setText("Tam:");

        javax.swing.GroupLayout PanelDadosLayout = new javax.swing.GroupLayout(PanelDados);
        PanelDados.setLayout(PanelDadosLayout);
        PanelDadosLayout.setHorizontalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelDadosLayout.setVerticalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addGap(28, 87, Short.MAX_VALUE)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        botaoVolta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        botaoVolta.setText("Voltar");
        botaoVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltaActionPerformed(evt);
            }
        });

        botaoExclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        botaoExclui.setText("Excluir");
        botaoExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(botaoProcura)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoExclui)
                        .addGap(18, 18, 18)
                        .addComponent(botaoVolta)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscaCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcura))
                .addGap(18, 18, 18)
                .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVolta)
                    .addComponent(botaoExclui))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcuraActionPerformed
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
                botaoExclui.setEnabled(true);
                PanelDados.setVisible(true);
                nome.setText(pDTO.getNomeProd());
                String p = Float.toString(pDTO.getPrecoProd());
                String q = Integer.toString(pDTO.getQntProd());
                qtd.setText(p);
                preco.setText(q);
                tamanho.setText(pDTO.getTamProd());

            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro com o banco de dados");
            }
        }
    }//GEN-LAST:event_botaoProcuraActionPerformed

    private void botaoExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluiActionPerformed
        try {
            pDAO.removeProd(cod);
            Mensagens.Info("Produto removido com sucesso.");
            botaoExclui.setEnabled(false);
            buscaCodProd.setText("");
            nome.setText("");
            qtd.setText("");
            preco.setText("");
            tamanho.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
            Mensagens.Erro("Erro com o banco de dados");
        }
    }//GEN-LAST:event_botaoExcluiActionPerformed

    private void botaoVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botaoVoltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDados;
    private javax.swing.JButton botaoExclui;
    private javax.swing.JButton botaoProcura;
    private javax.swing.JButton botaoVolta;
    private javax.swing.JTextField buscaCodProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtd;
    private javax.swing.JTextField tamanho;
    // End of variables declaration//GEN-END:variables
}
