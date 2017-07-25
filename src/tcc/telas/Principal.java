package tcc.telas;

//Pronto, por enquanto.
import java.sql.SQLException;
import tcc.DAO.AdmDAO;
import tcc.DTO.AdmDTO;
import tcc.Util.Mensagens;

public class Principal extends javax.swing.JFrame {

    private static AdmDTO admDTO = new AdmDTO();
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeAdm = new javax.swing.JTextField();
        logar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        senhaAdm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex - Login");

        jLabel1.setText("Nome de usuário");

        jLabel2.setText("Senha de acesso");

        nomeAdm.setToolTipText("Insira seu nome de usuario correto");
        nomeAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nomeAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAdmActionPerformed(evt);
            }
        });

        logar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/confirmar.png"))); // NOI18N
        logar.setText("Logar");
        logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/delete.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        senhaAdm.setToolTipText("Insira sua senha de usuario correta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeAdm)
                    .addComponent(senhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logar)
                    .addComponent(cancelar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed

        if (nomeAdm.getText().isEmpty() || senhaAdm.getPassword().length == 0) {
            Mensagens.Aviso("O nome ou a senha do administrador não foram informados");
        } else {
            AdmDAO admDAO = new AdmDAO();
            try {
                admDTO = admDAO.autenticaAdm(nomeAdm.getText(), String.valueOf(senhaAdm.getPassword()));
                if (admDTO == null) {
                    Mensagens.Erro("Login inválido.");
                    nomeAdm.requestFocus();
                } else{
                    AdmFace admFace = new AdmFace();
                    admFace.setVisible(true);
                    admFace.setLocationRelativeTo(null);
                    this.dispose();
                }
            } catch (SQLException ex) {
                // mensagem de erro
                Mensagens.Erro("Erro com o Banco de dados");
                ex.printStackTrace();
                
                
            }
        }

    }//GEN-LAST:event_logarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // Limpa campos
        nomeAdm.setText("");
        senhaAdm.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void nomeAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAdmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logar;
    private javax.swing.JTextField nomeAdm;
    private javax.swing.JPasswordField senhaAdm;
    // End of variables declaration//GEN-END:variables
}
