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
        preco = new javax.swing.JTextField();
        qnt = new javax.swing.JTextField();
        tamanho = new javax.swing.JTextField();
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

        preco.setEditable(false);

        qnt.setEditable(false);

        tamanho.setEditable(false);

        javax.swing.GroupLayout PanelDadosLayout = new javax.swing.GroupLayout(PanelDados);
        PanelDados.setLayout(PanelDadosLayout);
        PanelDadosLayout.setHorizontalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(preco))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qnt)
                    .addComponent(tamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelDadosLayout.setVerticalGroup(
            PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosLayout.createSequentialGroup()
                .addGap(28, 76, Short.MAX_VALUE)
                .addGroup(PanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
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
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(buscaCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVolta)
                    .addComponent(botaoExclui))
                .addContainerGap(27, Short.MAX_VALUE))
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
                preco.setText(p);
                qnt.setText(q);
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
            preco.setText("");
            qnt.setText("");
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
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qnt;
    private javax.swing.JTextField tamanho;
    // End of variables declaration//GEN-END:variables
}
