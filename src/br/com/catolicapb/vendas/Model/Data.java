package br.com.catolicapb.vendas.Model;

public class Data {
    public int dia;
    public int mes;
    public int ano;
    public Cliente cliente;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Metodo de calcular idade
    public void calcularIdade(){

        int idade = 2024 - this.cliente.nascimento.ano;
    }


    @Override
    public String toString() {

        String texto = this.dia + "/" + this.mes + "/" + this.ano;
        //String textoAlt = String.format("%d/%d/%d", this.dia, this.mes, this.ano);

        return texto;

    }
}


