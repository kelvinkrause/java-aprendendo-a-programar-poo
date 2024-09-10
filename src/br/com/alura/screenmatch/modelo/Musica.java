package br.com.alura.screenmatch.modelo;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int totalAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("""
                Titulo da musica:  %s
                Nome artsta:       %s
                Ano de lançamento: %d
                Avaliacão:         %.2f
                Total avaliação:   %d
                """.formatted(titulo, artista, anoDeLancamento, avaliacao, totalAvaliacao));
    }

    void avaliaMusica(double nota) {
        avaliacao += nota;
        totalAvaliacao++;
    }

    void mediaAvaliacao(){
        if (totalAvaliacao == 0){
            System.out.println("Não possui nenhuma avaliação.");
        } else {
            System.out.println("Médias das avaliações: " + avaliacao / totalAvaliacao);
        }
    }

}
