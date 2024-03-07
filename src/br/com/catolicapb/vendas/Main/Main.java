package br.com.catolicapb.vendas.Main;

import br.com.catolicapb.vendas.Model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente(
                "Gelgel",
                "123.456.789.00",
                new Endereco(7,
                        "Mosenhor Sabino Coelho",
                        "Capoeirasa",
                        "Cajazerias",
                        "58900-000",
                        "Paraíba"),
                "(01) 4002-8922",
                new Data(11, 9, 2001)
        );

        Vendedor vendedor = new Vendedor(
                "Eduardo",
                "JKG31",
                "09:20"
        );

        Produto produto = new Produto(
                "Garrafa",
                "Armazena líquidos",
                "A1D5",
                2,
                1
        );

        Venda venda = new Venda(cliente , produto, 10);

        System.out.println(cliente);
        System.out.println(vendedor);
        System.out.println("Valor total da venda: " + venda.valorTotalVenda);
    }
}
