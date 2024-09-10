package br.com.alura.screenmatch.modelo;

public class ProdutoFisico extends Produto implements Calculavel{

    public ProdutoFisico(String nome, double preco, int quantidade, String unidadeMedida) {
        super(nome, preco, quantidade, unidadeMedida);
    }


    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.05;
    }
}
