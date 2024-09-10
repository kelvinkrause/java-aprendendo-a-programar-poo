package br.com.alura.screenmatch.modelo;

public interface Vendavel {
    double calculaPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
