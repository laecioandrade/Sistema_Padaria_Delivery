/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import model.Padaria;

/**
 *
 * @author laeciorodrigues
 */
public class TelaFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionarios
     */
    Padaria padaria;
    public TelaFuncionarios(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btEntregador = new javax.swing.JButton();
        btEmpacotador = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FUNCIONARIOS");

        btEntregador.setText("ENTREGADOR");
        btEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntregadorActionPerformed(evt);
            }
        });

        btEmpacotador.setText("EMPACOTADOR");
        btEmpacotador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpacotadorActionPerformed(evt);
            }
        });

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btEntregador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btEmpacotador)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntregador)
                    .addComponent(btEmpacotador))
                .addGap(38, 38, 38)
                .addComponent(btVoltar)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaInicial init = new TelaInicial(padaria);
        init.setLocationRelativeTo(null);
        init.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntregadorActionPerformed
        TelaEntregador entregador = new TelaEntregador(padaria);
        entregador.setLocationRelativeTo(null);
        entregador.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEntregadorActionPerformed

    private void btEmpacotadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpacotadorActionPerformed
        TelaEmpacotador empacotador = new TelaEmpacotador(padaria);
        empacotador.setLocationRelativeTo(null);
        empacotador.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEmpacotadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmpacotador;
    private javax.swing.JButton btEntregador;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
