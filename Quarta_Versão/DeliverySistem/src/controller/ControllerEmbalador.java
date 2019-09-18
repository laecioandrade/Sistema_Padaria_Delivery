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
import model.Embalador;

/**
 *
 * @author LaecioRodrigues
 */
public class ControllerEmbalador {
    
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean CadastrarEmbalador(String nome){
        Embalador embalador = new Embalador();
        int ver = 0;
        try {
            if(nome.length()<3){
               ver = 1;
            }
            embalador.setNome(nome);
            embalador.setStatus("Aguardando");
            try {
                PreparedStatement pst = cn.prepareStatement("insert into embalador (nome, status) values (?, ?)");
                pst.setString(1, embalador.getNome());
                pst.setString(2, embalador.getStatus());

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
    public boolean RemoverEmbalador(String id){
        Embalador embalador = new Embalador();
        int ver = 0;
        try {
            embalador.setID(Integer.parseInt(id));
            try {
                PreparedStatement pst = cn.prepareStatement("delete from embalador where idembalador=(?)");
                pst.setString(1, id);

                pst.executeUpdate();

                System.out.println("Removido com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: "+ e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }
        return ver != 0;
    }
    
    public ArrayList<Embalador> RetornarEmbaladores(){
        try {
            ArrayList<Embalador> results = new ArrayList<>();
            String cmd = "select * from embalador";
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
                    
                    Embalador e = new Embalador();
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
            Logger.getLogger(ControllerEmbalador.class.getName()).log(Level.SEVERE,null, ex);
        }
        return null;
    }
    
    public void TrabEmbalador(){
        try{    
            Embalador emb = new Embalador();
            PreparedStatement pst = cn.prepareStatement("UPDATE embalador SET status=(?) WHERE idembalador = 1;");
            pst.setString(1, emb.trabalhando());


            pst.executeUpdate();

            System.out.println("Dados cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
    
    public void AguaEmbalador(){
        try{    
            Embalador emb = new Embalador();
            PreparedStatement pst = cn.prepareStatement("UPDATE embalador SET status=(?) WHERE idembalador = 2;");
            pst.setString(1, emb.aguardando());


            pst.executeUpdate();

            System.out.println("Dados cadastrados com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
