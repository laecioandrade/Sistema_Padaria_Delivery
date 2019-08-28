/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import model.Padaria;
import model.Produto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author laeciorodrigues
 */
public class TelaCadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrarProdutos
     */
    Padaria padaria;
    public TelaCadastrarProduto(Padaria pad) {
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
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE PRODUTOS");

        jCheckBox5.setText("Pão (simples)");

        jCheckBox6.setText("X-Bacon");

        jCheckBox7.setText("X-Tudo");

        jCheckBox8.setText("jCheckBox8");

        jCheckBox9.setText("Bolo de Chocolate");

        jLabel4.setText("Produto:");

        jCheckBox10.setText("Bolo de Cenoura");

        jCheckBox11.setText("Refrigerante (lata)");

        jCheckBox1.setText("Pão de Queijo");

        jCheckBox12.setText("Refrigerante (2l)");

        jCheckBox2.setText("Misto Quente");

        jCheckBox13.setText("Suco");

        jCheckBox3.setText("Bauru");

        jCheckBox14.setText("Vitamina");

        jCheckBox4.setText("Hamburguer");

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox13))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox11)
                                    .addComponent(jCheckBox14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btCadastrar)
                                        .addComponent(jCheckBox12))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox10)
                                    .addComponent(jCheckBox9))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
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
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btVoltar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaProdutos produtos = new TelaProdutos(padaria);
        produtos.setLocationRelativeTo(null);
        produtos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(jCheckBox1.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Pão de Queijo")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Pão de Queijo");
                    prod.setPreco(1.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox2.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Misto Quente")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Misto Quente");
                    prod.setPreco(11.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox3.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Bauru")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bauru");
                    prod.setPreco(11.50);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox4.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Hamburguer")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Hamburguer");
                    prod.setPreco(10.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox5.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Pão (simples)")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Pão (simples)");
                    prod.setPreco(0.50);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox6.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("X-Bacon")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("X-Bacon");
                    prod.setPreco(16.90);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox7.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("X-Tudo")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("X-Tudo");
                    prod.setPreco(26.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox8.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Bolo de Milho")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Milho");
                    prod.setPreco(7.50);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox9.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Bolo de Chocolate")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Chocolate");
                    prod.setPreco(9.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox10.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Bolo de Cenoura")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Cenoura");
                    prod.setPreco(8.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox11.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Refrigerante (lata)")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Refrigerante (lata)");
                    prod.setPreco(3.50);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox12.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Refrigerante (2l)")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Refrigerante (2l)");
                    prod.setPreco(7.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox13.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Suco")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Suco");
                    prod.setPreco(2.50);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            if(jCheckBox14.isSelected()){
                int veri=0;
                if(padaria.getProdutos()!=null){
                    for(int i=0; i<padaria.getProdutos().size();i++){
                        if(padaria.getProdutos().get(i).getNome().equals("Vitamina")){
                            veri=1;
                            padaria.getProdutos().get(i).setQtd(padaria.getProdutos().get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Vitamina");
                    prod.setPreco(3.00);
                    prod.setQtd(1);
                    padaria.getProdutos().add(prod);
                }
            }
            JFrame frame = new JFrame ("Aviso!");
                JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");
            
            TelaCadastrarProduto cadproduto = new TelaCadastrarProduto(padaria);
            cadproduto.setLocationRelativeTo(null);
            cadproduto.setVisible(true);
            dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
