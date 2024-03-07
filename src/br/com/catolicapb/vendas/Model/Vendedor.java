package br.com.catolicapb.vendas.Model;

public class Vendedor {
    public String nome;
    public String codigoDeFuncionario;
    public String hora;

    public Vendedor(String nome,
                    String codigoDeFuncionario,
                    String  hora){
        this.nome = nome;
        this.codigoDeFuncionario = codigoDeFuncionario;
        this.hora = hora;
    }
    @Override
    public String toString(){
        String texto = String.format("Vendedor: %s\n Codigo do funcionario: %s\n Hora da amostra da venda: %s\n", nome, codigoDeFuncionario, hora);
        return texto;
    }
}
