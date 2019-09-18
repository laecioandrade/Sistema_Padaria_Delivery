/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LaecioRodrigues
 */
public class ConectaBanco {
    public Statement stm; //responsavel por preparar e realizar pesquisas no banco de dados
    public ResultSet rs; //responsavel por armazenar o resultado de uma pesquisa passada para o statement
    private final String driver = "com.mysql.cj.jdbc.Driver"; //responsavel por identificar o serviço de bando de dados
    private final String caminho = "jdbc:mysql://localhost:3306/padaria?useTimezone=true&serverTimezone=UTC"; //responsavel por setar o local do banco de dados
    private final String usuario = "root"; 
    private final String senha = "tente";
    public Connection conn; //responsavel por realizar a conexão com o banco de dados
    
    public void conexao() throws ClassNotFoundException{ //metodo responsavel por realizar a conexão com o bancode dados
        try { //tentativa inicial
            conn = DriverManager.getConnection(caminho, usuario, senha); //realiza a conexão com o banco
//            JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); //imprime uma caixa de mensagens
        } catch (SQLException ex) { //excessão
            JOptionPane.showMessageDialog(null, "Erro de conexão!\nErro:" + ex.getMessage()); 
        }
    }
    
    public void executaSQL(String sql){
    
        //try {
        //    stm = (Statement) conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//o primeiro é pq vi diferenciar letras minusculas de maiusculas, o 2 é pq vai ser rolável
        //    rs = stm.executeQuery(sql);
        //} catch (SQLException ex) {
        //    JOptionPane.showMessageDialog(null, "Erro no executaSQL!\nErro:" + ex.getMessage()); 
        //}
    }
    
    public void desconecta(){ //metodo para fechar a conexão com o banco de dados
        try {
            conn.close(); //fecha a conexão
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!\nErro:" + ex.getMessage()); 
        }
    }

}
