
package Formulario;

import Dao.ProdutoDao;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import produto.Produto;

public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloL = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        produtoL = new javax.swing.JLabel();
        produto = new javax.swing.JTextField();
        descricaoL = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        valorL = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        estoqueL = new javax.swing.JLabel();
        estoque = new javax.swing.JComboBox();
        codigoL = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloL.setForeground(new java.awt.Color(0, 0, 204));
        tituloL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloL.setText("Cadastrar Novo Produto");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        produtoL.setText("Nome");

        produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoActionPerformed(evt);
            }
        });

        descricaoL.setText("Descrição");

        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });

        valorL.setText("Valor");

        valor.setToolTipText("Valor do produto. Somente números, para casa decimais usar \".\"(10.05)...");
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        estoqueL.setText("Disponivel ");

        estoque.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));
        estoque.setSelectedIndex(getExtendedState());
        estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueActionPerformed(evt);
            }
        });

        codigoL.setText("Código");

        codigo.setToolTipText("Código do produto. Somente números...");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigoL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(descricaoL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(estoqueL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valorL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(produtoL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(produto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoL)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoL)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorL)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estoqueL)
                    .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(tituloL, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoActionPerformed

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadatrarProduto();  
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estoqueActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    public void cadatrarProduto() {
        if (checar() ==false) {
            return;
        }

        try {
            Produto p = new Produto();
            p.setCodigo(codigo.getText());
            p.setProduto(produto.getText());
            p.setValor(Float.parseFloat(valor.getText()));
            p.setEstoque(estoque.getModel().getSelectedItem().equals("Sim"));
            p.setDescricao(descricao.getText());

            new ProdutoDao().cadastrar(p);
            
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso...");
            this.dispose();
             Pesquisar pesquisar = new Pesquisar();
             pesquisar.setVisible(true);
             

        } catch (SQLException e) {

            if (e.getMessage().toUpperCase().contains("DUPLICATE ENTRY")) {
                JOptionPane.showMessageDialog(null, "Código " + codigo.getText() + " já existe...", "Erro", JOptionPane.ERROR_MESSAGE);
            } else 
                
            if (e.getMessage().contains("Incorrect integer value") && e.getMessage().contains("codigo")) {
                JOptionPane.showMessageDialog(null, "Código '" + codigo.getText() + "' Inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                System.err.println("Erro ao Cadastrar o Produto: " + e.getMessage());
            }

        } catch (NumberFormatException e) {

            // ok
            if (!valor.getText().matches("[0-9]&&[\\.]")) {
                JOptionPane.showMessageDialog(null, "Valor '" + valor.getText() + "' Inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean checar() {
        boolean valido = true;

        if (produto.getText().isEmpty()) {
            produtoL.setForeground(Color.RED);
            valido = false;
        } else {
            produtoL.setForeground(Color.BLACK);
        }

        if (codigo.getText().isEmpty()) {
            codigoL.setForeground(Color.RED);
            valido = false;
        } else {
            codigoL.setForeground(Color.BLACK);
        }

        if (descricao.getText().isEmpty()) {
            descricaoL.setForeground(Color.RED);
            valido = false;
        } else {
            descricaoL.setForeground(Color.BLACK);
        }

        if (valor.getText().isEmpty()) {
            valorL.setForeground(Color.RED);
            valido = false;
        } else {
            valorL.setForeground(Color.BLACK);
        }

        if (valido == false) {
            JOptionPane.showMessageDialog(null, "Confira os campos Obrigatórios!!");
        }
        return valido;
    }

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastrar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoL;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel descricaoL;
    private javax.swing.JComboBox estoque;
    private javax.swing.JLabel estoqueL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField produto;
    private javax.swing.JLabel produtoL;
    private javax.swing.JLabel tituloL;
    private javax.swing.JTextField valor;
    private javax.swing.JLabel valorL;
    // End of variables declaration//GEN-END:variables
}
