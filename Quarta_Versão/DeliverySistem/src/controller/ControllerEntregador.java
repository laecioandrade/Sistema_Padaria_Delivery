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
import model.Entregador;


/**
 *
 * @author LaecioRodrigues
 */
public class ControllerEntregador {
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean CadastrarEntregador(String nome){
        Entregador entregador = new Entregador();
        int ver = 0;
        try {
            if(nome.length()<3){
               ver = 1;
            }
            entregador.setNome(nome);
            entregador.setStatus("Aguardando");
            try {
                PreparedStatement pst = cn.prepareStatement("insert into entregador (nome, status) values (?, ?)");
                pst.setString(1, entregador.getNome());
                pst.setString(2, entregador.getStatus());

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
    public boolean RemoverEntregador(String id){
        Entregador entregador = new Entregador();
        int ver = 0;
        try {
            entregador.setID(Integer.parseInt(id));
            try {
                PreparedStatement pst = cn.prepareStatement("delete from entregador where identregador=(?)");
                pst.setString(1, id);

                pst.executeUpdate();

                System.out.println("Removido com sucesso!");

            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
                ver = 1;
            }
        } catch (Exception e) {
            ver = 1;
            System.out.println("Erro: "+e);
        }
        return ver != 1;
    }
    
    public ArrayList<Entregador> RetornarEntregadores(){
        try {
            ArrayList<Entregador> results = new ArrayList<>();
            String cmd = "select * from entregador";
            Statement stmt;
            ResultSet dados=null;
            c.conexao();
            try {
                stmt = c.conn.prepareStatement(cmd);
                dados = stmt.executeQuery(cmd);
                while(dados.next()){
                    int id = dados.getInt(1);
                    String nome = dados.getString(2);
                    String status = dados.getString(3);
                    
                    Entregador e = new Entregador();
                    e.setID(id);
                    e.setNome(nome);
                    e.setStatus(status);
                    
                    results.add(e);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
            
            return results;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerEntregador.class.getName()).log(Level.SEVERE,null, ex);
        }
        return null;
    }
    
    public void TrabEntregador(){
        try{    
            Entregador emb = new Entregador();
            PreparedStatement pst = cn.prepareStatement("UPDATE entregador SET status=(?) WHERE identregador = 1;");
            pst.setString(1, emb.trabalhando());


            pst.executeUpdate();

            System.out.println("Dados cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
    
    public void AguaEntregador(){
        try{    
            Entregador emb = new Entregador();
            PreparedStatement pst = cn.prepareStatement("UPDATE entregador SET status=(?) WHERE identregador = 1;");
            pst.setString(1, emb.aguardando());


            pst.executeUpdate();

            System.out.println("Dados cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
