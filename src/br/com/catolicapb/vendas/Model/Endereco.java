package br.com.catolicapb.vendas.Model;

public class Endereco {
    // número da casa, rua, bairro, cidade, cep e estado do cliente.
    private int numeroDaCasa;
    private String rua;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;

    public Endereco(int numeroDaCasa,
                    String rua,
                    String bairro,
                    String cidade,
                    String cep,
                    String estado
    ){
        this.numeroDaCasa = numeroDaCasa;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numeroDaCasa=" + numeroDaCasa +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

