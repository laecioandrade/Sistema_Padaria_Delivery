/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ControllerCliente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.TelaCadastrarCliente;

/**
 *
 * @author LaecioRodrigues
 */
public class FacadeCadastrarCliente {
    public void cadastrar(String Nome, String Bairro, String Latitude, String Longitude){
        ControllerCliente contro = new ControllerCliente();
        boolean a = contro.CadastrarCliente(Nome,Bairro,Latitude,Longitude);
        if(a){
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Cadastrado Com Sucesso!");
            TelaCadastrarCliente client = new TelaCadastrarCliente();
            client.setLocationRelativeTo(null);
            client.setVisible(true);
        }else{
            JFrame frame = new JFrame ("Aviso!");
            JOptionPane.showMessageDialog (frame, "Preencha os dados corretamente!");
            TelaCadastrarCliente client = new TelaCadastrarCliente();
            client.setLocationRelativeTo(null);
            client.setVisible(true); 
        }
    }
}
