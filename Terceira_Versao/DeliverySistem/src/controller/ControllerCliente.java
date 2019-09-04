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
import javax.xml.bind.ParseConversionEvent;
import model.Cliente;

/**
 *
 * @author LaecioRodrigues
 */
public class ControllerCliente {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean CadastrarCliente(String nome, String bairro, String longitude, String latitude){
        Cliente cliente = new Cliente();
        int ver = 0;
        try {
            if(nome.length()<3 || bairro.length()<3){
               ver = 1;
            }
            cliente.setNome(nome);
            cliente.setBairro(bairro);
            cliente.setLat(Double.valueOf(latitude));
            cliente.setLog(Double.valueOf(longitude));
            if(bairro.equals("Leblon")){
                cliente.setStatus("vip");
            }else{
                cliente.setStatus("comum");
            }
            try {
                PreparedStatement pst = cn.prepareStatement("insert into cliente (nomeCliente, bairro, longitude, latitude, status) values (?, ?, ?, ?, ?)");
                pst.setString(1, cliente.getNome());
                pst.setString(2, cliente.getBairro());
                pst.setString(3, longitude);
                pst.setString(4, latitude);
                pst.setString(5, cliente.getStatus());

                pst.executeUpdate();

                System.out.println("Dados cadastrados com sucesso!");

            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
            }
        } catch (Exception e) {
            ver = 1;
            System.out.println("Erro: "+e);
        }
        return ver != 1;
    }
    public boolean RemoverCliente(String id){
        Cliente cliente = new Cliente();
        int ver = 0;
        try {
            cliente.setID(Integer.parseInt(id));
            try {
                PreparedStatement pst = cn.prepareStatement("delete from cliente where idcliente=(?)");
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
    
    
    public ArrayList<Cliente> RetornarClientes(){
        try {
            ArrayList<Cliente> results = new ArrayList<>();
            String cmd = "select * from cliente";
            Statement stmt;
            ResultSet dados=null;
            c.conexao();
            try {
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                while(dados.next()){
                    int id = dados.getInt(1);
                    String nome = dados.getString(2);
                    String bairro = dados.getString(3);
                    String longitude = dados.getString(4);
                    String latitude = dados.getString(5);
                    String status = dados.getString(6);
                    
                    Cliente c = new Cliente();
                    c.setID(id);
                    c.setNome(nome);
                    c.setBairro(bairro);
                    c.setLat(Integer.parseInt(latitude));
                    c.setLog(Integer.parseInt(longitude));
                    c.setStatus(status);
                    
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
