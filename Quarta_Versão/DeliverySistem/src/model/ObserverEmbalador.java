/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.ControllerEmbalador;

/**
 *
 * @author LaecioRodrigues
 */
public class ObserverEmbalador implements Observer{
    public void update(int i){
        if(i==1){
            ControllerEmbalador embaaa = new ControllerEmbalador();
            embaaa.AguaEmbalador();
        }else{
            ControllerEmbalador embaaa = new ControllerEmbalador();
            embaaa.TrabEmbalador();
        }
    }
}
