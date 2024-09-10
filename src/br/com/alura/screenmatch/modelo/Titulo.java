package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    /*
    Quando criado o construtor na classe pai (Titulo) automaticamente
    devera será criado também nas classes filhas (Filme e Serie)
    */
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano, por que tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3).trim());
    }

    public void exibeFichaTecnica () {
        /*
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamentos: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        */
        System.out.printf("""
                \n******************************************************
                        
                Nome do titulo:    %s
                Ano de lançamento: %d
                        
                ******************************************************        
                %n""", nome, anoDeLancamento);
    }

    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia (){
        return somaDasAvaliacoes / totalAvaliacoes; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }


    @Override
    public int compareTo(@NotNull Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "[Nome: " + nome + ", Ano de Lancamento: " + anoDeLancamento + ", Tempo de Duração: " + duracaoEmMinutos + "]";
    }
}
