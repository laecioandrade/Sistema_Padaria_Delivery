/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.ConectaBanco;
import connection.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LaecioRodrigues
 */
public class ControllerUsuario {
    ConectaBanco c = new ConectaBanco();
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
    
    public boolean verifica(String user, String senha) throws SQLException{
        int ver = 1;
        try{    
            String cmd = "SELECT user,senha FROM usuario WHERE idusuario = 1";
            Statement stmt;
            ResultSet dados=null;
            c.conexao();
            stmt = c.conn.prepareStatement(cmd);
            dados = stmt.executeQuery(cmd);
            String use = null;
            String sen = null;
            while(dados.next()){
                use = dados.getString(1);
                sen = dados.getString(2);
            }
            if(use.equals(user) && sen.equals(senha)){
                ver = 0;
            }
            return ver != 1;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ver!=1;
    }
}
