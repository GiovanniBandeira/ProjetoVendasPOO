package br.com.catolicapb.vendas.Model;

import java.lang.ref.Cleaner;

public class Venda {
    public Cliente cliente;
    public Produto produto;
    public int quantidade;
    public double valorTotalVenda;


    public Venda(
            Cliente cliente,
            Produto produto,
            int quantidade
    ){

        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotalVenda = this.calcularValor(this.quantidade, this.produto.preco);//Maneira 1 (Melhor para organização e uso futuro para modificações)
        //this.valorTotalVenda = this.quantidade * this.produto.preco;                   Maneira 2
        //this.valorTotalVenda = quantidade * produto.preco;                             Maneira 3

    }

    private double calcularValor(int quantidade, double preco){

        double valor = quantidade * preco;
        return valor;

    }

}
