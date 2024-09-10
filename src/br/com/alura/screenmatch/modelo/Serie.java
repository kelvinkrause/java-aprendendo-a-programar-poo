package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo {
    int temporada;
    int episodiosPorTemporada;
    boolean ativa;
    int minutosPorEpsodio;

    //Contrutores da Classe mãe Titulos e o da Classe Filha Serie (int temporada)
    public Serie(String nome, int anoDeLancamento, int temporada) {
        super(nome, anoDeLancamento);
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * episodiosPorTemporada * minutosPorEpsodio;
    }

    @Override
    public String toString() {
        return "SÉRIE: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
