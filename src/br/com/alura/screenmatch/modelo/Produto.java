package br.com.alura.screenmatch.modelo;

public class Produto {
    private String nome = " ";
    private double preco = 0.0;
    private int quantidade = 0;
    private String unidadeMedida = " ";



    public int getQuantidade() {
        return quantidade;
    }

    public Produto(String nome, double preco, int quantidade, String unidadeMedida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double aplicarDesconto(double desconto){
        return preco - (desconto / 100);
    }

    @Override
    public String toString() {
        return ("""
               =======================================================================
               Produto:          %s
               Preço (R$):       %.2f 
               Quantidade (%s):  %d
               =======================================================================
                %n""".formatted(this.nome, this.preco, this.unidadeMedida, this.quantidade));
    }

    public void setName(String name){
        this.nome = name;
    }

}
