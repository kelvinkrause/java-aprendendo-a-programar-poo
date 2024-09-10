package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaLivrosAPIGoogle {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do livro a pesquisar:");
        var busca = scan.next();

        String chave = "AIzaSyAta0DokvN45_o7s_aj7JNONwFVsmr7PZk";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=" + chave;

        System.out.println(endereco);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
