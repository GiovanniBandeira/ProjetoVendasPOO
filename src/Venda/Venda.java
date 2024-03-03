package Venda;

import Cliente.Cliente;
import Produto.Produto;

public class Venda {
    public Cliente cliente;
    public Produto produto;
    public int quantidadeVendida;
    public double valorTotalVenda;

    public String toString(){
        return "Venda";
    }

}
