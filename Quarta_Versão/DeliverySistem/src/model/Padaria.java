/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
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
    private ArrayList<Produto> produtos = new ArrayList();
    ArrayList<Entregador> entregadores = new ArrayList();
    ArrayList<Embalador> embaladores = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Pedido> pedidos = new ArrayList();

    public Padaria(String nome,String cnpj, int log, int lat){
        this.Nome=nome;
        this.cnpj=cnpj;
        this.lat=lat;
        this.log=log;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the log
     */
    public int getLog() {
        return log;
    }

    /**
     * @param log the log to set
     */
    public void setLog(int log) {
        this.log = log;
    }

    /**
     * @return the lat
     */
    public int getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(int lat) {
        this.lat = lat;
    }

    /**
     * @return the produtos
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the entregadores
     */
    public ArrayList<Entregador> getEntregadores() {
        return entregadores;
    }

    /**
     * @param entregadores the entregadores to set
     */
    public void setEntregadores(ArrayList<Entregador> entregadores) {
        this.entregadores = entregadores;
    }

    /**
     * @return the embaladores
     */
    public ArrayList<Embalador> getEmbaladores() {
        return embaladores;
    }

    /**
     * @param embaladores the embaladores to set
     */
    public void setEmbaladores(ArrayList<Embalador> embaladores) {
        this.embaladores = embaladores;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the pedidos
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
