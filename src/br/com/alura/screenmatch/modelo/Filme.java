package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    String diretor;

    //Constructor da Classe Titulo
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return ("FILME: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")");
    }
}
