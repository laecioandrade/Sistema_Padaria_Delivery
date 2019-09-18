/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ControllerEntregador;

/**
 *
 * @author LaecioRodrigues
 */
public class ObserverEntregador {
    public void update(int i){
        if(i==1){
            ControllerEntregador entreee = new ControllerEntregador();
            entreee.AguaEntregador();
        }else{
            ControllerEntregador entreee = new ControllerEntregador();
            entreee.TrabEntregador();
        }
    }
}
