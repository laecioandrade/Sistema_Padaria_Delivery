/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author laeciorodrigues
 */
public class Entregador extends Funcionario{
    public String trabalhando(){
        return "Entregando";
    }
    public String aguardando(){
        return "Aguardando";
    }
}
