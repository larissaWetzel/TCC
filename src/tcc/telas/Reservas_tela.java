package tcc.telas;

import java.sql.SQLException;
import tcc.DAO.ClienteDAO;
import tcc.DAO.ProdutoDAO;
import tcc.DTO.ClienteDTO;
import tcc.DTO.ProdutoDTO;
import tcc.Util.Mensagens;

public class Reservas_tela extends javax.swing.JFrame {
    
        ClienteDAO cDAO = new ClienteDAO();
        ClienteDTO cDTO = new ClienteDTO();
        ProdutoDAO pDAO = new ProdutoDAO();
        ProdutoDTO pDTO = new ProdutoDTO();
        private String cod;
        
        
    public Reservas_tela() {
        
        initComponents();
        botaoFazReserva.setEnabled(false);
        infoCod.setVisible(false);
        campoCod.setVisible(false);
        botaoCod.setVisible(false);
        PanelP.setVisible(false);
        PanelFinal.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscaCodCliente = new javax.swing.JTextField();
        botaoBusca = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoFone = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        botaoFazReserva = new javax.swing.JButton();
        infoCod = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        botaoCod = new javax.swing.JButton();
        PanelP = new javax.swing.JPanel();
        campoQ = new javax.swing.JTextField();
        botaoCalc = new javax.swing.JButton();
        NomeProd = new javax.swing.JTextField();
        PrecoProd = new javax.swing.JTextField();
        QntProd = new javax.swing.JTextField();
        TamProd = new javax.swing.JTextField();
        infoQ = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelFinal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botaoConfirma = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vanetex - Reservas");

        jLabel1.setText("Reservas");

        volta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/voltar.png"))); // NOI18N
        volta.setText("Voltar");
        volta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código do cliente:");

        buscaCodCliente.setToolTipText("Insira o nome completo do cliente");
        buscaCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaCodClienteActionPerformed(evt);
            }
        });

        botaoBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaActionPerformed(evt);
            }
        });

        campoNome.setEditable(false);

        campoFone.setEditable(false);

        campoCelular.setEditable(false);

        campoEndereco.setEditable(false);

        campoEmail.setEditable(false);

        botaoFazReserva.setText("Efetuar reserva");
        botaoFazReserva.setToolTipText("");
        botaoFazReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFazReservaActionPerformed(evt);
            }
        });

        infoCod.setText("Código do produto:");
        infoCod.setToolTipText("");

        campoCod.setToolTipText("Informe o código do produto para reservar");

        botaoCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCodActionPerformed(evt);
            }
        });

        campoQ.setToolTipText("");

        botaoCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/calc.png"))); // NOI18N
        botaoCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcActionPerformed(evt);
            }
        });

        NomeProd.setEditable(false);

        PrecoProd.setEditable(false);

        QntProd.setEditable(false);

        TamProd.setEditable(false);

        infoQ.setText("Quantidade para reservar:");

        javax.swing.GroupLayout PanelPLayout = new javax.swing.GroupLayout(PanelP);
        PanelP.setLayout(PanelPLayout);
        PanelPLayout.setHorizontalGroup(
            PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPLayout.createSequentialGroup()
                .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomeProd)
                            .addComponent(PrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QntProd)
                            .addComponent(TamProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelPLayout.createSequentialGroup()
                        .addComponent(infoQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoQ, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCalc)))
                .addGap(91, 91, 91))
        );
        PanelPLayout.setVerticalGroup(
            PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QntProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoQ)
                    .addComponent(campoQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCalc)))
        );

        jLabel4.setText("Total à pagar: ");

        total.setEditable(false);

        jLabel6.setText("* Reserva válida por dois dias");

        javax.swing.GroupLayout PanelFinalLayout = new javax.swing.GroupLayout(PanelFinal);
        PanelFinal.setLayout(PanelFinalLayout);
        PanelFinalLayout.setHorizontalGroup(
            PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFinalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(PanelFinalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        PanelFinalLayout.setVerticalGroup(
            PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        botaoConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/confirmar.png"))); // NOI18N
        botaoConfirma.setText("Confirmar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscaCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoBusca))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoCelular)
                                    .addComponent(campoNome)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoFone)
                                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(botaoFazReserva)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoConfirma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volta)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(infoCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoCod))
                            .addComponent(PanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBusca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(buscaCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFazReserva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoCod)
                    .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCod))
                .addGap(18, 18, 18)
                .addComponent(PanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volta)
                    .addComponent(botaoConfirma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltaActionPerformed
        AdmFace admface = new AdmFace();
        admface.setVisible(true);
        admface.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_voltaActionPerformed

    private void buscaCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaCodClienteActionPerformed

    }//GEN-LAST:event_buscaCodClienteActionPerformed

    private void botaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaActionPerformed
        cod = buscaCodCliente.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            buscaCodCliente.requestFocus();
        } else {
            int c = Integer.parseInt(cod);
            try {
                if (cDAO.verificaCod(c)) {
                } else {
                    Mensagens.Aviso("O código informado não existe ou não esta cadastrado no banco de dados");
                    buscaCodCliente.requestFocus();
                }
                botaoFazReserva.setEnabled(true);
                cDTO = cDAO.pegaBD(c);
                campoNome.setText(cDTO.getNomeCliente());
                campoFone.setText(cDTO.getFoneCliente());
                campoCelular.setText(cDTO.getCelularCliente());
                campoEndereco.setText(cDTO.getEnderecoCliente());
                campoEmail.setText("" + cDTO.getEmailCliente());

            } catch (SQLException ex) {
                ex.printStackTrace();
                Mensagens.Erro("Erro com o Banco de Dados");
            }
        }
    }//GEN-LAST:event_botaoBuscaActionPerformed

    private void botaoFazReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFazReservaActionPerformed
        infoCod.setVisible(true);
        campoCod.setVisible(true);
        botaoCod.setVisible(true);
    }//GEN-LAST:event_botaoFazReservaActionPerformed

    private void botaoCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCodActionPerformed
        String cod = campoCod.getText();
        if (cod.isEmpty()) {
            Mensagens.Aviso("Informe o código para buscar.");
            campoCod.requestFocus();
        } else {
            int c = Integer.parseInt(cod);
            try {
                if (pDAO.verificaCod(c)) {
                    
                } else {
                    Mensagens.Aviso("O código informado não existe ou não esta cadastrado no banco de dados");
                    campoCod.requestFocus();
                    
                }
                PanelP.setVisible(true);
                
                pDTO = pDAO.pegaBD(c);
                NomeProd.setText(pDTO.getNomeProd());
                QntProd.setText("" + pDTO.getQntProd());
                PrecoProd.setText("" + pDTO.getPrecoProd());
                TamProd.setText("" + pDTO.getTamProd());

            } catch (SQLException ex) {
                Mensagens.Erro("Erro com o banco de dados");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_botaoCodActionPerformed

    private void botaoCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcActionPerformed
        // Máximo 3 peças - validar
        
        PanelFinal.setVisible(true);
        float x = ((Float.parseFloat(PrecoProd.getText())) * (Integer.parseInt(campoQ.getText())));
        total.setText(""+x);
        
    }//GEN-LAST:event_botaoCalcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeProd;
    private javax.swing.JPanel PanelFinal;
    private javax.swing.JPanel PanelP;
    private javax.swing.JTextField PrecoProd;
    private javax.swing.JTextField QntProd;
    private javax.swing.JTextField TamProd;
    private javax.swing.JButton botaoBusca;
    private javax.swing.JButton botaoCalc;
    private javax.swing.JButton botaoCod;
    private javax.swing.JButton botaoConfirma;
    private javax.swing.JButton botaoFazReserva;
    private javax.swing.JTextField buscaCodCliente;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQ;
    private javax.swing.JLabel infoCod;
    private javax.swing.JLabel infoQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField total;
    private javax.swing.JButton volta;
    // End of variables declaration//GEN-END:variables
}
