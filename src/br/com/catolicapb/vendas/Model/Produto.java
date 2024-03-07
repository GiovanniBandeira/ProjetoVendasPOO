package br.com.catolicapb.vendas.Model;

public class Produto {

    public String nome;
    public String descricao;
    public String codigo;
    public double preco;
    public int qunatidade;

    public Produto(String nome,
           String descricao,
           String codigo,
           double preco,
           int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.preco = preco;
        this.qunatidade = quantidade;
    }

    @Override
    public String toString(){
        String texto = "<Produto: nome=" + this.nome + ", preço=" + this.preco + ">";
        return texto;
    }

}
