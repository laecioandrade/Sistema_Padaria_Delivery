/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.ConectaBanco;
import connection.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cliente;
import controller.ControllerCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pedido;
import model.Produto;

/**
 *
 * @author LaecioRodrigues
 */
public class ControllerPedido {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean CadastrarPedido(String idclien, ArrayList<Integer> numero){
        ControllerCliente concli = new ControllerCliente();
        ArrayList<Cliente> clientes = concli.RetornarClientes();
        for(Cliente cliente:clientes){
            if(cliente.getID() == Integer.parseInt(idclien)){
                try {
                    ControllerProduto cprod = new ControllerProduto();
                    ArrayList<Produto> produtos = cprod.RetornarProdutos();
                    float valor=0;
                    for(int num:numero){
                        for(Produto produt:produtos){
                            if(produt.getId()==num){
                                valor+=produt.getPreco();
                            }
                        }
                        cprod.AlterarProduto(num);
                    }
                    Pedido pedido = new Pedido();
                    pedido.setPreco(valor);
                    pedido.setStatus("Aguardadndo");
                    if(cliente.getStatus().equals("vip")){
                        pedido.setBrinde("Sim");
                    }else{
                        pedido.setBrinde("Não");
                    }
                    try {
                        PreparedStatement ins = cn.prepareStatement("insert into pedido (preco, status, brinde, cliente_idcliente) values (?, ?, ?, ?)");
                        ins.setFloat(1, pedido.getPreco());
                        ins.setString(2, pedido.getStatus());
                        ins.setString(3, pedido.getBrinde());
                        ins.setInt(4, cliente.getID());
                        ins.executeUpdate();

                        System.out.println("Dados cadastrados com sucesso!");

                    } catch (Exception e) {
                        System.out.println("Erro: "+ e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println("Erro: "+ e.getMessage());
                }
            }
        }
        return true;
    }
    
    /*public void AtualizandoQtd(int qtd, int num) throws SQLException{
        qtd-=1;
        PreparedStatement upd = cn.prepareStatement("UPDATE produto SET quantidade=(?) WHERE idproduto = (?);");
        upd.setFloat(1, qtd);
        upd.setFloat(2, num);
    }
    
    public void TerminarCadastro(float valor, Cliente cliente) throws SQLException{
        PreparedStatement ins = cn.prepareStatement("insert into pedido (preco, status, brinde, cliente_idcliente) values (?, ?, ?, ?)");
        ins.setFloat(1, valor);
        ins.setString(2, "Aguardando");
        if(cliente.getStatus().equals("vip")){
            ins.setString(3, "Sim");
        }else{
            ins.setString(3, "Não");
        }
        ins.setInt(4, cliente.getID());
    }*/
    
    public boolean RemoverPedido(String id){
        Pedido pedido = new Pedido();
        int ver = 0;
        try {
            pedido.setID(Integer.parseInt(id));
            try {
                PreparedStatement pst = cn.prepareStatement("delete from pedido where idpedido=(?)");
                pst.setString(1, id);

                pst.executeUpdate();

                System.out.println("Removido com sucesso!");

            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
            }
        } catch (Exception e) {
            ver = 1;
            System.out.println("Erro: "+e);
        }
        return ver != 1;
    }
    
    
    public ArrayList<Pedido> RetornarPedidos(){
        try {
            ArrayList<Pedido> results = new ArrayList<>();
            String cmd = "select * from pedido";
            Statement stmt;
            ResultSet dados=null;
            c.conexao();
            try {
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                while(dados.next()){
                    int id = dados.getInt(1);
                    float preco = dados.getFloat(2);
                    String status = dados.getString(3);
                    String brinde = dados.getString(4);
                    int cliente_idcliente = dados.getInt(5);
                    
                    Pedido c = new Pedido();
                    c.setID(id);
                    c.setPreco(preco);
                    c.setStatus(status);
                    c.setBrinde(brinde);
                    
                    results.add(c);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
            
            return results;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE,null, ex);
        }
        return null;
    }
}
