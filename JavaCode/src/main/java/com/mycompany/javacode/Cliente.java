/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javacode;

/**
 *
 * @author laeciorodrigues
 */
public class Cliente {
    private String Nome;
    private String Bairro;
    private int log;
    private int lat;
    private String status;
    public Cliente(){
        if(this.Bairro.equals("Leblo")){
            this.status="vip";
        }else{
            this.status="comum";
        }
    }
    
}
