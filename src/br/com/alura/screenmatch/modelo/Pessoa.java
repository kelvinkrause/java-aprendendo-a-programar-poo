package br.com.alura.screenmatch.modelo;

public class Pessoa {
    private String nome = " ";
    private int idade = 0;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.nome + ", com idade " + this.idade + " anos.";
    }
}
