package tcc.telas;

import Formularios.FormCliente;
import Formularios.FormProduto;

public class AdmFace extends javax.swing.JFrame {

    public AdmFace() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jColorChooser1 = new javax.swing.JColorChooser();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jLabel4 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel2 = new javax.swing.JLabel();
        botaoCadastraClientes = new javax.swing.JButton();
        botaoCadastraProdutos = new javax.swing.JButton();
        botaoReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientes = new javax.swing.JMenu();
        cadastraCliente = new javax.swing.JMenuItem();
        editaCliente = new javax.swing.JMenuItem();
        excluiCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        verClientes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        sairItemMenu = new javax.swing.JMenuItem();
        produtos = new javax.swing.JMenu();
        cadastraProd = new javax.swing.JMenuItem();
        editaProd = new javax.swing.JMenuItem();
        excluiProd = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        consulta = new javax.swing.JMenuItem();
        ralatorios = new javax.swing.JMenu();
        relatorios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        imprime = new javax.swing.JMenuItem();
        malha = new javax.swing.JMenu();
        calculaMalha = new javax.swing.JMenuItem();
        reserva = new javax.swing.JMenu();
        verReserva = new javax.swing.JMenuItem();
        estoque = new javax.swing.JMenu();
        atualiza = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vanetex");
        setBackground(new java.awt.Color(255, 153, 153));

        botaoCadastraClientes.setText("Casdatrar Cliente");
        botaoCadastraClientes.setPreferredSize(new java.awt.Dimension(127, 23));
        botaoCadastraClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraClientesActionPerformed(evt);
            }
        });

        botaoCadastraProdutos.setText("Cadastrar Produto");
        botaoCadastraProdutos.setMaximumSize(new java.awt.Dimension(81, 23));
        botaoCadastraProdutos.setMinimumSize(new java.awt.Dimension(81, 23));
        botaoCadastraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraProdutosActionPerformed(evt);
            }
        });

        botaoReserva.setText("Reservas");
        botaoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReservaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/logotipo.png"))); // NOI18N

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        clientes.setText("Clientes");

        cadastraCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/adicionar.png"))); // NOI18N
        cadastraCliente.setText("Cadastrar Cliente...");
        cadastraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraClienteActionPerformed(evt);
            }
        });
        clientes.add(cadastraCliente);

        editaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/alterar.png"))); // NOI18N
        editaCliente.setText("Editar Cliente...");
        editaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaClienteActionPerformed(evt);
            }
        });
        clientes.add(editaCliente);

        excluiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        excluiCliente.setText("Excluir Cliente...");
        excluiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiClienteActionPerformed(evt);
            }
        });
        clientes.add(excluiCliente);
        clientes.add(jSeparator1);

        verClientes.setText("Ver Clientes...");
        verClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClientesActionPerformed(evt);
            }
        });
        clientes.add(verClientes);
        clientes.add(jSeparator3);

        sairItemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/sair.png"))); // NOI18N
        sairItemMenu.setText("Sair");
        sairItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairItemMenuActionPerformed(evt);
            }
        });
        clientes.add(sairItemMenu);

        jMenuBar1.add(clientes);

        produtos.setText("Produtos");

        cadastraProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/adicionar.png"))); // NOI18N
        cadastraProd.setText("Cadastrar Produto...");
        cadastraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraProdActionPerformed(evt);
            }
        });
        produtos.add(cadastraProd);

        editaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/alterar.png"))); // NOI18N
        editaProd.setText("Editar Produto...");
        editaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaProdActionPerformed(evt);
            }
        });
        produtos.add(editaProd);

        excluiProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/delete.png"))); // NOI18N
        excluiProd.setText("Excluir Produto...");
        excluiProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiProdActionPerformed(evt);
            }
        });
        produtos.add(excluiProd);
        produtos.add(jSeparator4);

        consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/produtos2.png"))); // NOI18N
        consulta.setText("Consultar Produto...");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        produtos.add(consulta);

        jMenuBar1.add(produtos);

        ralatorios.setText("Relatórios");

        relatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/relatorios.png"))); // NOI18N
        relatorios.setText("Ver Relatórios...");
        relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosActionPerformed(evt);
            }
        });
        ralatorios.add(relatorios);
        ralatorios.add(jSeparator2);

        imprime.setText("Imprimir...");
        ralatorios.add(imprime);

        jMenuBar1.add(ralatorios);

        malha.setText("Malha");

        calculaMalha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/calc.png"))); // NOI18N
        calculaMalha.setText("Calcular Preço...");
        calculaMalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaMalhaActionPerformed(evt);
            }
        });
        malha.add(calculaMalha);

        jMenuBar1.add(malha);

        reserva.setText("Reservas");

        verReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/reservas.png"))); // NOI18N
        verReserva.setText("Ver Reservas...");
        verReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservaActionPerformed(evt);
            }
        });
        reserva.add(verReserva);

        jMenuBar1.add(reserva);

        estoque.setText("Estoque");

        atualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcc/icons/produtos.png"))); // NOI18N
        atualiza.setText("Atualizar Vendas...");
        atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaActionPerformed(evt);
            }
        });
        estoque.add(atualiza);

        jMenuBar1.add(estoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCadastraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(botaoCadastraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoReserva)
                    .addComponent(botaoCadastraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastraClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraClienteActionPerformed
        FormCliente formCliente = new FormCliente();
        formCliente.setVisible(true);
        formCliente.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cadastraClienteActionPerformed

    private void relatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosActionPerformed
        Relatorios_tela rt = new Relatorios_tela();
        rt.setVisible(true);
        rt.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_relatoriosActionPerformed

    private void botaoCadastraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraProdutosActionPerformed
        FormProduto formProduto = new FormProduto();
        formProduto.setVisible(true);
        formProduto.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botaoCadastraProdutosActionPerformed

    private void botaoCadastraClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraClientesActionPerformed
        FormCliente formCliente = new FormCliente();
        formCliente.setVisible(true);
        formCliente.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botaoCadastraClientesActionPerformed

    private void cadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraProdActionPerformed
        FormProduto formProduto = new FormProduto();
        formProduto.setVisible(true);
        formProduto.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cadastraProdActionPerformed

    private void editaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaClienteActionPerformed
        BuscaClientes bc = new BuscaClientes();
        bc.setVisible(true);
        bc.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_editaClienteActionPerformed

    private void editaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaProdActionPerformed
        EditaProdutos ep = new EditaProdutos();
        ep.setVisible(true);
        this.dispose();
        ep.setLocationRelativeTo(null);
    }//GEN-LAST:event_editaProdActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        BuscaProdutos bp = new BuscaProdutos();
        bp.setVisible(true);
        bp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_consultaActionPerformed

    private void verClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClientesActionPerformed
        BuscaClientes bc = new BuscaClientes();
        bc.setVisible(true);
        bc.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_verClientesActionPerformed

    private void excluiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiClienteActionPerformed
        BuscaClientes bc = new BuscaClientes();
        bc.setVisible(true);
        bc.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_excluiClienteActionPerformed

    private void sairItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairItemMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairItemMenuActionPerformed

    private void excluiProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiProdActionPerformed
        BuscaProdutos bp = new BuscaProdutos();
        bp.setVisible(true);
        bp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_excluiProdActionPerformed

    private void botaoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReservaActionPerformed
        Reservas_tela res = new Reservas_tela();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_botaoReservaActionPerformed

    private void verReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservaActionPerformed
        Reservas_tela res = new Reservas_tela();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_verReservaActionPerformed

    private void calculaMalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaMalhaActionPerformed
        CalculaMalha cm = new CalculaMalha();
        cm.setVisible(true);
        cm.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_calculaMalhaActionPerformed

    private void atualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaActionPerformed
        Estoque_tela et = new Estoque_tela();
        et.setVisible(true);
        et.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_atualizaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem atualiza;
    private javax.swing.JButton botaoCadastraClientes;
    private javax.swing.JButton botaoCadastraProdutos;
    private javax.swing.JButton botaoReserva;
    private javax.swing.JMenuItem cadastraCliente;
    private javax.swing.JMenuItem cadastraProd;
    private javax.swing.JMenuItem calculaMalha;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem consulta;
    private javax.swing.JMenuItem editaCliente;
    private javax.swing.JMenuItem editaProd;
    private javax.swing.JMenu estoque;
    private javax.swing.JMenuItem excluiCliente;
    private javax.swing.JMenuItem excluiProd;
    private javax.swing.JMenuItem imprime;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu malha;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu produtos;
    private javax.swing.JMenu ralatorios;
    private javax.swing.JMenuItem relatorios;
    private javax.swing.JMenu reserva;
    private javax.swing.JMenuItem sairItemMenu;
    private javax.swing.JMenuItem verClientes;
    private javax.swing.JMenuItem verReserva;
    // End of variables declaration//GEN-END:variables
}
