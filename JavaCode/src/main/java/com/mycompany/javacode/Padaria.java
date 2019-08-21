/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javacode;

import java.util.ArrayList;

/**
 *
 * @author laeciorodrigues
 */
public class Padaria {
    private String Nome;
    private String cnpj;
    private int log;
    private int lat;
    ArrayList<Produto> produtos = new ArrayList<>(1000);
    ArrayList<Entregador> entregadores = new ArrayList<>(5);
    ArrayList<Embalador> embaladores = new ArrayList<>(5);
    ArrayList<Cliente> clientes = new ArrayList<>(100000);
}
