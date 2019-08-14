package br.com.java;

import java.util.ArrayList;

public class SistemaCompleto {

    public static class Padaria{
        public String nome;
        public String cnpj;
        public int log;
        public int lat;
        ArrayList<Cliente> clientes = new ArrayList<>(10);
        ArrayList<Produto> produtos = new ArrayList<>(10);
        ArrayList<Entregador> entregadores =  new ArrayList<>(10);
        ArrayList<Entrega> entregas = new ArrayList<>(10);
        ArrayList<Embalador> embaladores = new ArrayList<>(10);

        public Padaria(String nome, String cnpj, int log, int lat){
            this.nome = nome;
            this.cnpj = cnpj;
            this.log = log;
            this.lat = lat;
        }

        public void informacoes(){
            System.out.println("Nome: "+this.nome);
            System.out.println("CNPJ: "+this.cnpj);
            System.out.println("Longitude: "+this.log);
            System.out.println("Latitude: "+this.lat);
        }

        public void cadastrarCliente(){

        }
    }

    public class Pessoa{
        public String nome;
        public String cpf;
        public int anonascim;
        public Pessoa(){

        }

        public Pessoa(String nome, String cpf, Object o) {
        }
    }

    public class Entregador extends Pessoa{
        public Entregador(String nome, String cpf, int anonascim){
            super (nome, cpf, anonascim);
        }
    }

    public class Embalador extends Pessoa{
        public Embalador(String nome, String cpf, int anonascim){
            super(nome, cpf, anonascim);
        }

    }

    public class Cliente extends Pessoa{
        public int id;
        public int log;
        public int lat;
        public String bairro;
        public Cliente(){

        }
        public Cliente(String nome, String cpf, int anonascim){
            super(nome, cpf, anonascim);
        }
    }

    public class Entrega{
        public Cliente donopedido;
        ArrayList<Produto> produtosEntrega = new ArrayList<>(10);
    }

    public class Produto{
        public String nome;
        public String preco;
        public int quantidade;
    }


    public static void main(String[] args) {
        Padaria paodoce = new Padaria("Pão Doce", "000111000111-00",0,0);
    }
}
