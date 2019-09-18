/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LaecioRodrigues
 */
public abstract class EstadoProduto {
    public void disponivel(){
        System.out.println("Produto disponivel");
    }
    public void indisponivel(){
        System.out.println("Produto indisponivel");
    }
}
