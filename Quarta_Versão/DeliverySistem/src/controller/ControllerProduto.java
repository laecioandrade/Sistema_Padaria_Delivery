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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author LaecioRodrigues
 */
public class ControllerProduto {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean CadastrarProduto(ArrayList<Integer> numero){
        int ver=0;
        try {
            for(int num:numero){
                String cmd = "SELECT quantidade FROM produto WHERE idproduto = "+num;
                Statement stmt;
                ResultSet dados=null;
                c.conexao();
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                int qtd = 0;
                while(dados.next()){
                    qtd = dados.getInt(1);
                    System.out.println(qtd);
                }

                qtd+=1;
                PreparedStatement pst = cn.prepareStatement("UPDATE produto SET quantidade=(?) WHERE idproduto = (?);");
                pst.setFloat(1, qtd);
                pst.setFloat(2, num);
                

                pst.executeUpdate();

                System.out.println("Dados cadastrados com sucesso!");
            }
            } catch (Exception e) {
                ver=1;
                System.out.println("Erro: "+ e.getMessage());
            }
        return ver != 1;
    }
    public ArrayList<Produto> RetornarProdutos(){
        try {
            ArrayList<Produto> results = new ArrayList<>();
            String cmd = "select * from produto";
            Statement stmt;
            ResultSet dados=null;
            c.conexao();
            try {
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                while(dados.next()){
                    int id = dados.getInt(1);
                    int quantidade = dados.getInt(2);
                    String nome = dados.getString(3);
                    float preco = dados.getFloat(4);
                    
                    Produto p = new Produto();
                    p.setId(id);
                    p.setNome(nome);
                    p.setQtd(quantidade);
                    p.setPreco(preco);
                    
                    results.add(p);
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
    
    public void AlterarProduto(int num){
        //int ver=0;
        try {
            //for(int num:numero){
                String cmd = "SELECT quantidade FROM produto WHERE idproduto = "+num;
                Statement stmt;
                ResultSet dados=null;
                c.conexao();
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                int qtd = 0;
                while(dados.next()){
                    qtd = dados.getInt(1);
                    System.out.println(qtd);
                }

                qtd-=1;
                PreparedStatement pst = cn.prepareStatement("UPDATE produto SET quantidade=(?) WHERE idproduto = (?);");
                pst.setFloat(1, qtd);
                pst.setFloat(2, num);
                

                pst.executeUpdate();

                System.out.println("Dados cadastrados com sucesso!");
            //}
            } catch (Exception e) {
                //ver=1;
                System.out.println("Erro: "+ e.getMessage());
            }
        //return ver != 1;
    }
}
