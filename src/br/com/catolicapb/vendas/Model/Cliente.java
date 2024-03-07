package br.com.catolicapb.vendas.Model;

public class Cliente {
    public String nome;
    private String cpf;
    public Endereco endereco;
    public String telefone;
    public Data nascimento;

    public Cliente(String nome,
                   String cpf,
                   Endereco endereco,
                   String telefone,
                   Data nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;

    }

    @Override
    public String toString() {

        String texto = String.format("Pessoa: nome=%s\n telefone=%s\n", this.nome, this.telefone);

        return texto;
    }
}
