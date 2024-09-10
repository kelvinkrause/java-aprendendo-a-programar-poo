package br.com.alura.screenmatch.modelo;

public class Livro extends Produto implements Calculavel{
    private String autor;
    private String titulo;

    public Livro(String nome, double preco, int quantidade, String unidadeMedida) {
        super(nome, preco, quantidade, unidadeMedida);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.printf("""
                Nome do livro: %s
                Nome do autor: %s
                        
                %n""", titulo, autor);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}
