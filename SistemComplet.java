/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemapadariadelivery;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author laeciorodrigues
 */
public class SistemComplet {
    public static class Padaria {
        public String Nome;
        private String cnpj;
        private int log;
        private int lat;
        private ArrayList<Produto> produtos = new ArrayList();
        private ArrayList<Entregador> entregadores = new ArrayList();
        private ArrayList<Embalador> embaladores = new ArrayList();
        public ArrayList<Cliente> clientes = new ArrayList();
        public ArrayList<Pedido> pedidos = new ArrayList();

        public Padaria(String nome,String cnpj, int log, int lat){
            this.Nome=nome;
            this.cnpj=cnpj;
            this.lat=lat;
            this.log=log;
        }

        Padaria() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         * @return the Nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the cnpj
         */
        public String getCnpj() {
            return cnpj;
        }

        /**
         * @param cnpj the cnpj to set
         */
        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        /**
         * @return the log
         */
        public int getLog() {
            return log;
        }

        /**
         * @param log the log to set
         */
        public void setLog(int log) {
            this.log = log;
        }

        /**
         * @return the lat
         */
        public int getLat() {
            return lat;
        }

        /**
         * @param lat the lat to set
         */
        public void setLat(int lat) {
            this.lat = lat;
        }

        /**
         * @return the produtos
         */
        public ArrayList<Produto> getProdutos() {
            return produtos;
        }

        /**
         * @param produtos the produtos to set
         */
        public void setProdutos(ArrayList<Produto> produtos) {
            this.produtos = produtos;
        }

        /**
         * @return the entregadores
         */
        public ArrayList<Entregador> getEntregadores() {
            return entregadores;
        }

        /**
         * @param entregadores the entregadores to set
         */
        public void setEntregadores(ArrayList<Entregador> entregadores) {
            this.entregadores = entregadores;
        }

        /**
         * @return the embaladores
         */
        public ArrayList<Embalador> getEmbaladores() {
            return embaladores;
        }

        /**
         * @param embaladores the embaladores to set
         */
        public void setEmbaladores(ArrayList<Embalador> embaladores) {
            this.embaladores = embaladores;
        }

        /**
         * @return the clientes
         */
        public ArrayList<Cliente> getClientes() {
            return clientes;
        }

        /**
         * @param clientes the clientes to set
         */
        public void setClientes(ArrayList<Cliente> clientes) {
            this.clientes = clientes;
        }

        private void setClientes(Cliente cliente) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static class Cliente {
        private int ID;
        private String Nome;
        private String Bairro;
        private int log;
        private int lat;
        private String status;

        /**
         * @return the Nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the Bairro
         */
        public String getBairro() {
            return Bairro;
        }

        /**
         * @param Bairro the Bairro to set
         */
        public void setBairro(String Bairro) {
            this.Bairro = Bairro;
        }

        /**
         * @return the log
         */
        public int getLog() {
            return log;
        }

        /**
         * @param log the log to set
         */
        public void setLog(int log) {
            this.log = log;
        }

        /**
         * @return the lat
         */
        public int getLat() {
            return lat;
        }

        /**
         * @param lat the lat to set
         */
        public void setLat(int lat) {
            this.lat = lat;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * @return the ID
         */
        public int getID() {
            return ID;
        }

        /**
         * @param ID the ID to set
         */
        public void setID(int ID) {
            this.ID = ID;
        }
    }

    public static class Embalador{
        private int ID;
        private String Nome;
        private Pedido pedido;
        private String status; 

        /**
         * @return the ID
         */
        public int getID() {
            return ID;
        }

        /**
         * @param ID the ID to set
         */
        public void setID(int ID) {
            this.ID = ID;
        }

        /**
         * @return the Nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the pedido
         */
        public Pedido getPedido() {
            return pedido;
        }

        /**
         * @param pedido the pedido to set
         */
        public void setPedido(Pedido pedido) {
            this.pedido = pedido;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(String status) {
            this.status = status;
        }


    }

    public static class Entregador {
        private int ID;
        private String Nome;
        private Pedido pedido;
        private String status;

        /**
         * @return the ID
         */
        public int getID() {
            return ID;
        }

        /**
         * @param ID the ID to set
         */
        public void setID(int ID) {
            this.ID = ID;
        }

        /**
         * @return the Nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the pedido
         */
        public Pedido getPedido() {
            return pedido;
        }

        /**
         * @param pedido the pedido to set
         */
        public void setPedido(Pedido pedido) {
            this.pedido = pedido;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(String status) {
            this.status = status;
        }


    }

    public static class Pedido {
        private int ID;
        private Cliente cliente;
        private double preco;
        private String status;
        private String brinde;
        private ArrayList<Produto> produtos = new ArrayList<>(100);

        /**
         * @return the cliente
         */
        public Cliente getCliente() {
            return cliente;
        }

        /**
         * @param cliente the cliente to set
         */
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        

        /**
         * @return the produtos
         */
        public ArrayList<Produto> getProdutos() {
            return produtos;
        }

        /**
         * @param produtos the produtos to set
         */
        public void setProdutos(ArrayList<Produto> produtos) {
            this.produtos = produtos;
        }

        /**
         * @return the preco
         */
        public double getPreco() {
            return preco;
        }

        /**
         * @param preco the preco to set
         */
        public void setPreco(double preco) {
            this.preco = preco;
        }

        /**
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * @param status the status to set
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * @return the brinde
         */
        public String getBrinde() {
            return brinde;
        }

        /**
         * @param brinde the brinde to set
         */
        public void setBrinde(String brinde) {
            this.brinde = brinde;
        }

        /**
         * @return the ID
         */
        public int getID() {
            return ID;
        }

        /**
         * @param ID the ID to set
         */
        public void setID(int ID) {
            this.ID = ID;
        }

    }
 
    public static class Produto {
        //private String ID;
        private int qtd;
        private String nome;
        private double preco;

        /**
         * @return the ID
         */
        //public String getID() {
        //    return ID;
        //}

        /**
         * @param ID the ID to set
         */
        //public void setID(String ID) {
        //    this.ID = ID;
        //}
        
        /**
         * @return the ID
         */
        public String getNome() {
            return nome;
        }

        /**
         * @param ID the ID to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the qtd
         */
        public int getQtd() {
            return qtd;
        }

        /**
         * @param qtd the qtd to set
         */
        public void setQtd(int qtd) {
            this.qtd = qtd;
        }

        /**
         * @return the preco
         */
        public double getPreco() {
            return preco;
        }

        /**
         * @param preco the preco to set
         */
        public void setPreco(double preco) {
            this.preco = preco;
        }
    }

    public static class TelaLogin extends javax.swing.JFrame{
        Padaria padaria;
        /**
         * Creates new form TelaLogin
         */
        public TelaLogin(Padaria pad) {
            padaria = pad;
            initComponents();
        }


        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            login = new javax.swing.JButton();
            usuario = new javax.swing.JTextField();
            senha = new javax.swing.JTextField();
            jButton2 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("PADARIA PÃO DOCE");

            jLabel2.setText("USUARIO:");

            jLabel3.setText("SENHA:");

            login.setText("LOGIN");
            login.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    loginActionPerformed(evt);
                }
            });

            usuario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    usuarioActionPerformed(evt);
                }
            });

            senha.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    senhaActionPerformed(evt);
                }
            });

            jButton2.setText("SOBRE");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(38, 38, 38))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)))
                    .addGap(171, 171, 171))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(25, 25, 25))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(7, 7, 7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addComponent(login)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>                        

        private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
            if(usuario.getText().equals("pdsi") && senha.getText().equals("1234")){
                TelaInicial init = new TelaInicial(padaria);
                init.setLocationRelativeTo(null);
                init.setVisible(true);
                dispose();
            }else{
                JFrame frame = new JFrame ("Erro!");
                JOptionPane.showMessageDialog (frame, "Usuário ou senha incoreta!");
            }
        }                                     

        private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       

        private void senhaActionPerformed(java.awt.event.ActionEvent evt) {                                      
            // TODO add your handling code here:
        }                                     

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaSobre sobre = new TelaSobre(padaria);
            sobre.setLocationRelativeTo(null);
            sobre.setVisible(true);
            dispose();
        }                                        

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JButton login;
        private javax.swing.JTextField senha;
        private javax.swing.JTextField usuario;
        // End of variables declaration                   
    }
    
    public static class TelaInicial extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaInicial
         */
        public TelaInicial(Padaria pad) {
            padaria = pad;
            initComponents();
        }


        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            jButton5 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jButton1.setText("PEDIDOS");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("PRODUTOS");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton3.setText("FUNCIONARIOS");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jButton4.setText("SAIR");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

            jLabel1.setText("PADARIA PÃO DOCE");
            
            jButton5.setText("CLIENTE");
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });
            
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(173, 173, 173)
                            .addComponent(jButton4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(jLabel1)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(72, 72, 72))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1)
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton5))
                    .addGap(63, 63, 63)
                    .addComponent(jButton4)
                    .addContainerGap(58, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaFuncionarios func = new TelaFuncionarios(padaria);
            func.setLocationRelativeTo(null);
            func.setVisible(true);
            dispose();
        }                                        

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaLogin login = new TelaLogin(padaria);
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            dispose();
        }                                        

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaPedidos ped = new TelaPedidos(padaria);
            ped.setLocationRelativeTo(null);
            ped.setVisible(true);
            dispose();
        }                                        

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaProdutos prod = new TelaProdutos(padaria);
            prod.setLocationRelativeTo(null);
            prod.setVisible(true);
            dispose();
        }                                        

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaCliente clie = new TelaCliente(padaria);
            clie.setLocationRelativeTo(null);
            clie.setVisible(true);
            dispose();
        }                                        

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JLabel jLabel1;
        // End of variables declaration                   
    }

    public static class TelaCliente extends javax.swing.JFrame {
        /**
         * Creates new form TelaCliente
         */
        Padaria padaria;
        
        public TelaCliente(Padaria pad){
            padaria = pad;
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            listaClientes = new javax.swing.JList<>();
            jButton2 = new javax.swing.JButton();
            jToggleButton1 = new javax.swing.JToggleButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("CLIENTES");

            jButton1.setText("CADASTRAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel2.setText("Clientes Cadastrados");

            listaClientes.setModel(new javax.swing.AbstractListModel<String>() {
                //String[] strings = { "Item 5", "Item 2", "Item 3", "Item 4", "Item 5" };
                public int getSize() { return padaria.clientes.size(); }
                public String getElementAt(int i) { return "ID: "+padaria.clientes.get(i).getID()+"->"+padaria.clientes.get(i).getNome()+" -> Bairro: "+padaria.clientes.get(i).getBairro()+" -> Status: "+padaria.clientes.get(i).getStatus(); }
            });
            jScrollPane1.setViewportView(listaClientes);
            
            listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
            });
            jScrollPane1.setViewportView(listaClientes);
            
            jButton2.setText("VOLTAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jToggleButton1.setText("REMOVER");
            jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jToggleButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(171, 171, 171))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(127, 127, 127))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 54, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jToggleButton1))
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton2)
                    .addContainerGap(43, Short.MAX_VALUE))
            );

            pack();
        }                  

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaInicial init = new TelaInicial(padaria);
            init.setLocationRelativeTo(null);
            init.setVisible(true);
            dispose();

        }                                        

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            /*if(padaria.clientes.size()>0){
                System.out.println(padaria.clientes.get(0).getNome());
                System.out.println(padaria.clientes.get(0).getBairro());
                System.out.println(padaria.clientes.get(0).getStatus());
            }*/
            TelaCadastraCliente cadsClien = new TelaCadastraCliente(padaria);
            cadsClien.setLocationRelativeTo(null);
            cadsClien.setVisible(true);
            dispose();
        }
        
        private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {                                           
            //System.out.println(evt.toString());
            /*for(int i=0; i<padaria.clientes.size();i++){
                if(padaria.clientes.get(i).getNome().equals(evt.getComponent())){
                    String na = padaria.clientes.get(i).getNome();
                    String ba = padaria.clientes.get(i).getBairro();
                    int la = padaria.clientes.get(i).getLat();
                    int lo = padaria.clientes.get(i).getLog();
                    String sta = padaria.clientes.get(i).getStatus();
                }
                
            }*/
            JFrame frame = new JFrame ();
            frame.setTitle("Dados");
            JOptionPane.showMessageDialog (frame, evt.getComponent());
        }
        
        private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
            TelaRemoverCliente removercliente = new TelaRemoverCliente(padaria);
            removercliente.setLocationRelativeTo(null);
            removercliente.setVisible(true);
            dispose();
        }   


        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JToggleButton jToggleButton1;
        private javax.swing.JList<String> listaClientes;
        // End of variables declaration                   
    }

    public static class TelaPedidos extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaPedidos
         */
        public TelaPedidos(Padaria pad) {
            padaria = pad;
            initComponents();
        }


        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            jList1 = new javax.swing.JList<>();
            jButton3 = new javax.swing.JButton();
            jLabel2 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("PEDIDOS");

            jButton1.setText("CADASTRAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jList1.setModel(new javax.swing.AbstractListModel<String>() {
                //String[] strings = { "Item 5", "Item 2", "Item 3", "Item 4", "Item 5" };
                public int getSize() { return padaria.pedidos.size(); }
                public String getElementAt(int i) { return "ID: "+padaria.pedidos.get(i).getID()+" -> "+padaria.pedidos.get(i).getCliente().getNome()+" -> Valor: "+padaria.pedidos.get(i).getPreco()+" -> Brinde: "+padaria.pedidos.get(i).getBrinde()+" -> Status: "+padaria.pedidos.get(i).getCliente().getStatus(); }
            });
            jScrollPane1.setViewportView(jList1);

            jButton3.setText("VOLTAR");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jLabel2.setText("Pedidos Pendentes em Ordem");

            jButton2.setText("ENTREGAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(174, 174, 174))
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jButton3))))
                    .addGap(0, 69, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jButton3)
                    .addContainerGap(67, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaInicial init = new TelaInicial(padaria);
            init.setLocationRelativeTo(null);
            init.setVisible(true);
            dispose();
        }                                        

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaCadastrarPedido cadsPedido = new TelaCadastrarPedido(padaria);
            cadsPedido.setLocationRelativeTo(null);
            cadsPedido.setVisible(true);
            dispose();
        }
        
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelarRealizarEntrega entrega = new TelarRealizarEntrega(padaria);
            entrega.setLocationRelativeTo(null);
            entrega.setVisible(true);
            dispose();
        } 

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JList<String> jList1;
        private javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration                   
    }
    
    public static class TelaProdutos extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaProdutos
     */
    public TelaProdutos(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("  PRODUTOS");

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return padaria.produtos.size(); }
            public String getElementAt(int i) { return padaria.produtos.get(i).getNome()+" --> Quantidade: "+padaria.produtos.get(i).getQtd(); }
        });
        jScrollPane1.setViewportView(listaProdutos);

        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Produtos Disponiveis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaInicial init = new TelaInicial(padaria);
        init.setLocationRelativeTo(null);
        init.setVisible(true);
        dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaCadastrarProduto cadprod = new TelaCadastrarProduto(padaria);
        cadprod.setLocationRelativeTo(null);
        cadprod.setVisible(true);
        dispose();
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaProdutos;
    // End of variables declaration                   
    }
    
    public static class TelaFuncionarios extends javax.swing.JFrame {
        Padaria padaria;
    /**
     * Creates new form TelaFuncionarios
     */
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FUNCIONARIOS");

        jButton1.setText("ENTREGADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EMPACOTADOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VOLTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaInicial init = new TelaInicial(padaria);
        init.setLocationRelativeTo(null);
        init.setVisible(true);
        dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaEntregador entregador = new TelaEntregador(padaria);
        entregador.setLocationRelativeTo(null);
        entregador.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaEmpacotador empacotador = new TelaEmpacotador(padaria);
        empacotador.setLocationRelativeTo(null);
        empacotador.setVisible(true);
        dispose();
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
    }
    
    public static class TelaEntregador extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaEntregador
     */
    public TelaEntregador(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ENTREGADOR");

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return padaria.entregadores.size(); }
            public String getElementAt(int i) { return "ID: "+padaria.entregadores.get(i).getID()+" -> "+padaria.entregadores.get(i).getNome()+" -> Status: "+padaria.entregadores.get(i).getStatus(); }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Entregadores Cadastrados");

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REMOVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(jButton2))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaFuncionarios func = new TelaFuncionarios(padaria);
        func.setLocationRelativeTo(null);
        func.setVisible(true);
        dispose();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaCadastroEntregador cadentregador = new TelaCadastroEntregador(padaria);
        cadentregador.setLocationRelativeTo(null);
        cadentregador.setVisible(true);
        dispose();
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaRemoverEntegrador remventregador = new TelaRemoverEntegrador(padaria);
        remventregador.setLocationRelativeTo(null);
        remventregador.setVisible(true);
        dispose();
    } 

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}

    public static class TelaEmpacotador extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaEmpacotador
     */
    public TelaEmpacotador(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EMPACOTADOR");

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return padaria.embaladores.size(); }
            public String getElementAt(int i) { return "ID: "+padaria.embaladores.get(i).getID()+" -> "+padaria.embaladores.get(i).getNome()+" -> Status: "+padaria.embaladores.get(i).getStatus(); }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Empacotadores Cadastrados");

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REMOVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)
                        .addGap(122, 122, 122)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(jButton2))))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
        );

        pack();
    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaCadastroEmpacotador empacota = new TelaCadastroEmpacotador(padaria);
        empacota.setLocationRelativeTo(null);
        empacota.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaFuncionarios funci = new TelaFuncionarios(padaria);
        funci.setLocationRelativeTo(null);
        funci.setVisible(true);
        dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaRemoverEmpacotador remvempacot = new TelaRemoverEmpacotador(padaria);
        remvempacot.setLocationRelativeTo(null);
        remvempacot.setVisible(true);
        dispose();
    }  

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
    
    public static class TelaSobre extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaSobre
         */
        public TelaSobre(Padaria pad) {
            padaria = pad;
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("SOBRE");

            jLabel2.setText("Sistema de Delivery de uma Padaria");

            jLabel3.setText("Produzido por:");

            jLabel4.setText("Laécio Rodrigues");

            jLabel5.setText("     Thales Jose");

            jButton1.setText("VOLTAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(87, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(172, 172, 172))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(136, 136, 136))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(72, 72, 72))))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(jButton1)))
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(37, 37, 37)
                    .addComponent(jLabel2)
                    .addGap(41, 41, 41)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel5)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addContainerGap(44, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaLogin logi = new TelaLogin(padaria);
            logi.setLocationRelativeTo(null);
            logi.setVisible(true);
            dispose();
        }                                        

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        // End of variables declaration                   
    }

    public static class TelaCadastraCliente extends javax.swing.JFrame {

        Padaria padaria;


        /**
         * Creates new form TelaCadastraCliente
         */
        public TelaCadastraCliente(Padaria pad) {
            padaria = pad;
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            nomeCliente = new javax.swing.JTextField();
            latitudeCliente = new javax.swing.JTextField();
            bairroCliente = new javax.swing.JTextField();
            longitudeCliente = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("CADASTRO DE CLIENTES");

            jLabel2.setText("Nome:");

            jLabel3.setText("Bairro:");

            jLabel4.setText("Longitude:");

            jLabel5.setText("Latitude:");

            bairroCliente.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bairroClienteActionPerformed(evt);
                }
            });

            jButton1.setText("CADASTRAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("VOLTAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(latitudeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(longitudeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)))
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(112, 112, 112))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(longitudeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(latitudeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addGap(23, 23, 23))
            );

            pack();
        }// </editor-fold>                        

        private void bairroClienteActionPerformed(java.awt.event.ActionEvent evt) {                                              
            // TODO add your handling code here:
        }                                             

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaCliente cliente = new TelaCliente(padaria);
            cliente.setLocationRelativeTo(null);
            cliente.setVisible(true);
            dispose();
        }                                        

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            ArrayList<Cliente> clientes = new ArrayList();
            Cliente cliente = new Cliente();
            cliente.setNome(nomeCliente.getText());
            cliente.setBairro(bairroCliente.getText());
            cliente.setLat(Integer.parseInt(latitudeCliente.getText()));
            cliente.setLog(Integer.parseInt(longitudeCliente.getText()));
            if(bairroCliente.getText().equals("Leblon")){
                cliente.setStatus("vip");
            }else{
                cliente.setStatus("comum");
            }
            //System.out.println(padaria.getNome());
            //clientes.add(cliente);
            int cont=0;
            if(padaria.clientes!=null){
                for(int i=0; i<padaria.clientes.size();i++){
                    cont=cont+1;
                }
            }
            cliente.setID(cont);
            padaria.clientes.add(cliente);
            

            JFrame frame = new JFrame ("Aviso!");
                JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");
            
            TelaCadastraCliente client = new TelaCadastraCliente(padaria);
            client.setLocationRelativeTo(null);
            client.setVisible(true);
            dispose();
            
        }                                        

        // Variables declaration - do not modify                     
        private javax.swing.JTextField bairroCliente;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField latitudeCliente;
        private javax.swing.JTextField longitudeCliente;
        private javax.swing.JTextField nomeCliente;
        // End of variables declaration                   
    }

    public static class TelaCadastrarPedido extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaCadastrarPedido
     */
    public TelaCadastrarPedido(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRAR PEDIDO");

        jLabel3.setText("ID do Cliente:");

        jLabel4.setText("Pedido:");

        jCheckBox1.setText("Pão de Queijo");

        jCheckBox2.setText("Misto Quente");

        jCheckBox3.setText("Bauru");

        jCheckBox4.setText("Hamburguer");

        jCheckBox5.setText("Pão (simples)");

        jCheckBox6.setText("X-Bacon");

        jCheckBox7.setText("X-Tudo");

        jCheckBox8.setText("Bolo de Milho");

        jCheckBox9.setText("Bolo de Chocolate");

        jCheckBox10.setText("Bolo de Cenoura");

        jCheckBox11.setText("Refrigerante (lata)");

        jCheckBox12.setText("Refrigerante (2l)");

        jCheckBox13.setText("Suco");

        jCheckBox14.setText("Vitamina");

        jLabel5.setText("OBS: Vitamina e suco todos os sabore tem o mesmo valor");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CONFIRMAR PEDIDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
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
                                            .addComponent(jCheckBox12)
                                            .addComponent(jCheckBox11)
                                            .addComponent(jCheckBox14)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox4)
                                            .addComponent(jCheckBox3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox10)
                                            .addComponent(jCheckBox9)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaPedidos ped = new TelaPedidos(padaria);
        ped.setLocationRelativeTo(null);
        ped.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Pedido pedido = new Pedido();
        pedido.setPreco(0.0);
        Produto produto = new Produto();
        String id = null;
        int veriSel = 0; 
        id = jTextField2.getText();
        int verID = 0;
        if(padaria.clientes!=null){
            for(int i=0; i<padaria.clientes.size();i++){
                if(id.equals(String.valueOf(padaria.clientes.get(i).getID()))){
                    pedido.setCliente(padaria.clientes.get(i));
                    if(padaria.clientes.get(i).getStatus().equals("vip")){
                        pedido.setBrinde("Sim");
                    }else{
                        pedido.setBrinde("Não");
                    }
                    if(jCheckBox1.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Pão de Queijo")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox2.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Misto Quente")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox3.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Bauru")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox4.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Hamburguer")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox5.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Pão (simples)")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox6.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("X-Bacon")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox7.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("X-Tudo")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox8.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Bolo de Milho")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox9.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Bolo de Chocolate")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox10.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Bolo de Cenoura")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox11.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Refrigerante (lata)")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox12.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Refrigerante (2l)")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox13.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Suco")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    if(jCheckBox14.isSelected()){
                        for(int z=0;z<padaria.produtos.size();z++){
                            if(padaria.produtos.get(z).getNome().equals("Vitamina")){
                                pedido.produtos.add(padaria.produtos.get(z));
                                pedido.setPreco(pedido.getPreco()+padaria.produtos.get(z).getPreco());
                                padaria.produtos.get(z).setQtd(padaria.produtos.get(z).getQtd()-1);
                            }
                        }
                    }
                    pedido.setStatus("Aguardando");
                    int cont = 0;
                    if(padaria.pedidos!=null){
                        for(int h=0; h<padaria.pedidos.size();h++){
                            cont+=1;
                        }
                    }
                    verID = 1;
                    pedido.setID(cont);
                    int tamanho = padaria.pedidos.size();
                    //if(ve==0){
                    int veri = 0;
                    for(int h=0; h<tamanho;h++){
                        if((padaria.pedidos.get(h).getCliente().getLat()+padaria.pedidos.get(h).getCliente().getLog())>(pedido.cliente.getLat()+pedido.cliente.getLog())){
                            padaria.pedidos.add(h, pedido);
                            veri = 1;
                        }

                    }
                    if(veri == 0){
                        padaria.pedidos.add(pedido);
                    }
                    //}//else{
                        //padaria.pedidos.add(pedido);
                    //}
                    /*Pedido aux = new Pedido();
                    int tamanho = padaria.pedidos.size();
                    for(int p=0;p<tamanho;p++){
                        for(int w=0;w<tamanho;w++){
                            if((padaria.pedidos.get(p).getCliente().getLat()+padaria.pedidos.get(p).getCliente().getLog())>(padaria.pedidos.get(w).getCliente().getLat()+padaria.pedidos.get(w).getCliente().getLog())){
                                aux = padaria.pedidos.get(p);
                                padaria.pedidos.add(p, padaria.pedidos.get(w));
                                padaria.pedidos.add(w, aux);
                            }
                        }
                    }*/
                                       
                    //padaria.pedidos.add(pedido);
                    if(padaria.embaladores!=null){
                        padaria.embaladores.get(0).setStatus("Embalando");
                    }
                    if(padaria.entregadores!=null){
                        padaria.entregadores.get(0).setStatus("Entregando");
                    }
                }
                
            }
        }
        if(verID == 1){
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");

            TelaCadastrarPedido cadpedido = new TelaCadastrarPedido(padaria);
            cadpedido.setLocationRelativeTo(null);
            cadpedido.setVisible(true);
            dispose();
        }else{
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Id não encontrado!");

            TelaCadastrarPedido cadpedido = new TelaCadastrarPedido(padaria);
            cadpedido.setLocationRelativeTo(null);
            cadpedido.setVisible(true);
            dispose();
        }
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}

    public static class TelaCadastrarProduto extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaCadastrarProdutos
         */
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
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("CADASTRO DE PRODUTOS");

            jCheckBox5.setText("Pão (simples)");

            jCheckBox6.setText("X-Bacon");

            jCheckBox7.setText("X-Tudo");

            jCheckBox8.setText("Bolo de Milho");

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

            jButton1.setText("CADASTRAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("VOLTAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
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
                                            .addComponent(jButton1)
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
                    .addComponent(jButton2)
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
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addContainerGap(21, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>                        

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaProdutos produtos = new TelaProdutos(padaria);
            produtos.setLocationRelativeTo(null);
            produtos.setVisible(true);
            dispose();
        }
        
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            if(jCheckBox1.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Pão de Queijo")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Pão de Queijo");
                    prod.setPreco(1.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox2.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Misto Quente")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Misto Quente");
                    prod.setPreco(11.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox3.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Bauru")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bauru");
                    prod.setPreco(11.50);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox4.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Hamburguer")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Hamburguer");
                    prod.setPreco(10.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox5.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Pão (simples)")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Pão (simples)");
                    prod.setPreco(0.50);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox6.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("X-Bacon")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("X-Bacon");
                    prod.setPreco(16.90);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox7.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("X-Tudo")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("X-Tudo");
                    prod.setPreco(26.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox8.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Bolo de Milho")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Milho");
                    prod.setPreco(7.50);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox9.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Bolo de Chocolate")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Chocolate");
                    prod.setPreco(9.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox10.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Bolo de Cenoura")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Bolo de Cenoura");
                    prod.setPreco(8.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox11.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Refrigerante (lata)")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Refrigerante (lata)");
                    prod.setPreco(3.50);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox12.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Refrigerante (2l)")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Refrigerante (2l)");
                    prod.setPreco(7.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox13.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Suco")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Suco");
                    prod.setPreco(2.50);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            if(jCheckBox14.isSelected()){
                int veri=0;
                if(padaria.produtos!=null){
                    for(int i=0; i<padaria.produtos.size();i++){
                        if(padaria.produtos.get(i).getNome().equals("Vitamina")){
                            veri=1;
                            padaria.produtos.get(i).setQtd(padaria.produtos.get(i).getQtd()+1);
                        }
                    }
                }
                if(veri==0){
                    Produto prod = new Produto();
                    prod.setNome("Vitamina");
                    prod.setPreco(3.00);
                    prod.setQtd(1);
                    padaria.produtos.add(prod);
                }
            }
            JFrame frame = new JFrame ("Aviso!");
                JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");
            
            TelaCadastrarProduto cadproduto = new TelaCadastrarProduto(padaria);
            cadproduto.setLocationRelativeTo(null);
            cadproduto.setVisible(true);
            dispose();
        } 

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
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
        // End of variables declaration                   
    }

    public static class TelaCadastroEmpacotador extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaCadastroEmpacotador
         */
        public TelaCadastroEmpacotador(Padaria pad) {
            padaria = pad;
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jTextField3 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();

            jTextField3.setText("jTextField3");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("CADASTRAR EMPACOTADOR");

            jLabel3.setText("Nome:");

            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField1ActionPerformed(evt);
                }
            });

            jButton1.setText("VOLTAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("CADASTRAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>                         

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
            // TODO add your handling code here:
        }                                           

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           TelaEmpacotador empacota = new TelaEmpacotador(padaria);
           empacota.setLocationRelativeTo(null);
           empacota.setVisible(true);
           dispose();
        }
        
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
           Embalador embalador = new Embalador();
           embalador.setNome(jTextField1.getText());
           int cont = 0;
           if(padaria.embaladores!=null){
                for(int z =0;z<padaria.embaladores.size();z++){
                    cont+=1;
                }
           }
           embalador.setStatus("Aguardando");
           embalador.setID(cont);
           padaria.embaladores.add(embalador);
            
           JFrame frame = new JFrame("Aviso!");
           JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");
           
           TelaCadastroEmpacotador empacota = new TelaCadastroEmpacotador(padaria);
           empacota.setLocationRelativeTo(null);
           empacota.setVisible(true);
           dispose();
        }  


        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration                   
    }

    public static class TelaCadastroEntregador extends javax.swing.JFrame {
        Padaria padaria;
        /**
         * Creates new form TelaCadastroEntregador
         */
        public TelaCadastroEntregador(Padaria pad) {
            padaria = pad;
            initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel5 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();

            jLabel5.setText("jLabel5");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setText("CADASTRO ENTREGADOR");

            jLabel3.setText("Nome:");

            jButton1.setText("CADASTRAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("VOLTAR");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>                         

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            TelaEntregador entre = new TelaEntregador(padaria);
            entre.setLocationRelativeTo(null);
            entre.setVisible(true);
            dispose();
        }
        
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            Entregador entregador = new Entregador();
            entregador.setNome(jTextField2.getText());
            int cont=0;
            if(padaria.entregadores!=null){
                for(int z=0;z<padaria.entregadores.size();z++){
                    cont+=1;
                }
            }
            entregador.setStatus("Aguardando");
            entregador.setID(cont);
            padaria.entregadores.add(entregador);

            JFrame frame = new JFrame("Aviso!");
            JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");

            TelaCadastroEntregador entrega = new TelaCadastroEntregador(padaria);
            entrega.setLocationRelativeTo(null);
            entrega.setVisible(true);
            dispose();
        }

        // Variables declaration - do not modify                     
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        // End of variables declaration                   
    }

    public static class TelaRemoverCliente extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaRemoverCliente
     */
    public TelaRemoverCliente(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REMOVER CLIENTE");

        jLabel2.setText("ID:");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REMOVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaCliente cliente = new TelaCliente(padaria);
        cliente.setLocationRelativeTo(null);
        cliente.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String id;
        id = jTextField1.getText();
        System.out.println(jTextField1.getText());
        int idveri = 0;
        for(int i=0; i<padaria.clientes.size();i++){
            if(id.equals(String.valueOf(padaria.clientes.get(i).getID()))){
                padaria.clientes.remove(i);
                idveri=1;
            }
        }
        if(idveri == 0){
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Id não encontrado!");
                
            TelaRemoverCliente cliente = new TelaRemoverCliente(padaria);
            cliente.setLocationRelativeTo(null);
            cliente.setVisible(true);
            dispose();
        }else{
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Removido Com Sucesso!");

            TelaRemoverCliente cliente = new TelaRemoverCliente(padaria);
            cliente.setLocationRelativeTo(null);
            cliente.setVisible(true);
            dispose();
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
    
    public static class TelaRemoverEmpacotador extends javax.swing.JFrame {
        Padaria padaria;
    /**
     * Creates new form TelaRemoverEmbalador
     */
    public TelaRemoverEmpacotador(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REMOVER  EMBALADOR");

        jLabel2.setText("ID: ");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REMOVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaEmpacotador emba = new TelaEmpacotador(padaria);
        emba.setLocationRelativeTo(null);
        emba.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String id;
        id = jTextField1.getText();
        int idveri = 0;
        for(int i=0; i<padaria.embaladores.size();i++){
            if(id.equals(String.valueOf(padaria.embaladores.get(i).getID()))){
                padaria.embaladores.remove(i);
                idveri = 1;
            }
        }
        if(idveri == 0){
            JFrame frame = new JFrame ("Aviso!");
                    JOptionPane.showMessageDialog (frame, "Id não encontrado!");

            TelaRemoverEmpacotador embaladore = new TelaRemoverEmpacotador(padaria);
            embaladore.setLocationRelativeTo(null);
            embaladore.setVisible(true);
            dispose();
        }else{
            JFrame frame = new JFrame ("Aviso!");
                    JOptionPane.showMessageDialog (frame, "Removido Com Sucesso!");

            TelaRemoverEmpacotador embaladore = new TelaRemoverEmpacotador(padaria);
            embaladore.setLocationRelativeTo(null);
            embaladore.setVisible(true);
            dispose();
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
    
    public static class TelaRemoverEntegrador extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelaRemoverEntegrador
     */
    public TelaRemoverEntegrador(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REMOVER ENTREGADOR");

        jLabel2.setText("ID: ");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("REMOVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaEntregador entreg = new TelaEntregador(padaria);
        entreg.setLocationRelativeTo(null);
        entreg.setVisible(true);
        dispose();
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String id;
        id = jTextField1.getText();
        int idveri = 0;
        for(int i=0; i<padaria.entregadores.size();i++){
            if(id.equals(String.valueOf(padaria.entregadores.get(i).getID()))){
                padaria.entregadores.remove(i);
                idveri =1;
            }
        }
        if(idveri == 0){
            JFrame frame = new JFrame ("Aviso!");
                    JOptionPane.showMessageDialog (frame, "Id não encontrado!");

            TelaRemoverEntegrador entregador = new TelaRemoverEntegrador(padaria);
            entregador.setLocationRelativeTo(null);
            entregador.setVisible(true);
            dispose();
        }else{
            JFrame frame = new JFrame ("Aviso!");
                    JOptionPane.showMessageDialog (frame, "Removido Com Sucesso!");

            TelaRemoverEntegrador entregador = new TelaRemoverEntegrador(padaria);
            entregador.setLocationRelativeTo(null);
            entregador.setVisible(true);
            dispose();
        }
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
    
    public static class TelarRealizarEntrega extends javax.swing.JFrame {
    Padaria padaria;
    /**
     * Creates new form TelarRealizarEntrega
     */
    public TelarRealizarEntrega(Padaria pad) {
        padaria = pad;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        latitude = new javax.swing.JTextField();
        longitude = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REALIZAR ENTREGA");

        jLabel2.setText("ID do Pedido:");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ENTREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return padaria.pedidos.size(); }
            public String getElementAt(int i) { return "ID: "+padaria.pedidos.get(i).getID()+" -> "+padaria.pedidos.get(i).cliente.getNome()+" -> Latitude: "+padaria.pedidos.get(i).cliente.getLat()+" -> Longitude: "+padaria.pedidos.get(i).cliente.getLog(); }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(nomeCliente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(194, 194, 194)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        TelaPedidos ped = new TelaPedidos(padaria);
        ped.setLocationRelativeTo(null);
        ped.setVisible(true);
        dispose();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int test = 0;
        String id = nomeCliente.getText();
        if(padaria.pedidos!=null){
            for(int i=0;i<padaria.pedidos.size();i++){
                if(id.equals(String.valueOf(padaria.pedidos.get(i).getID()))){
                    padaria.pedidos.remove(i);
                    for(int p=0; p<padaria.embaladores.size();p++){
                        padaria.embaladores.get(i).setStatus("Aguardando");
                    }
                    for(int p=0; p<padaria.entregadores.size();p++){
                        padaria.entregadores.get(i).setStatus("Aguardando");
                    }
                    test=1;
                }
            }
        }
        if(test==1){
            JFrame frame = new JFrame ("Aviso!");
                JOptionPane.showMessageDialog(frame, "Entregue Com Sucesso!");
                
            TelarRealizarEntrega entrega = new TelarRealizarEntrega(padaria);
            entrega.setLocationRelativeTo(null);
            entrega.setVisible(true);
            dispose();
        }else{
            JFrame frame = new JFrame ("Aviso!");
                JOptionPane.showMessageDialog(frame, "Id não encontrado!");
                
            TelarRealizarEntrega entrega = new TelarRealizarEntrega(padaria);
            entrega.setLocationRelativeTo(null);
            entrega.setVisible(true);
            dispose();
        }
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField latitude;
    private javax.swing.JTextField longitude;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JList<String> jList2;
    // End of variables declaration                   
}
    
    public static void main(String[] args) {
        //TelaLogin tela = new TelaLogin();
        //tela.setVisible(true);
        Padaria padaria = new Padaria("Pão Doce","123123123123",0,0);
        TelaLogin tela = new TelaLogin(padaria);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    
}
