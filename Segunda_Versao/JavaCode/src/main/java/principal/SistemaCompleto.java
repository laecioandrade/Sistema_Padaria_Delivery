/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import model.Padaria;
import views.TelaLogin;

/**
 *
 * @author laeciorodrigues
 */
public class SistemaCompleto {
    public static void main(String[] args) {
        //TelaLogin tela = new TelaLogin();
        //tela.setVisible(true);
        Padaria padaria = new Padaria("Pão Doce","123123123123",0,0);
        TelaLogin tela = new TelaLogin(padaria);  
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
