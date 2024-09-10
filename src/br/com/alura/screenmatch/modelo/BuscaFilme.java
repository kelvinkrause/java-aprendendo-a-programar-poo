package br.com.alura.screenmatch.modelo;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class BuscaFilme {

    private final String token = "&apikey=cfad9404";
    private final String enderecoHttp = "http://www.omdbapi.com/?t=";


    public String buscaFilme(String nomeFilme) throws IOException, InterruptedException {

        // Tira os espaços do nome do filme caso tenha
        nomeFilme = URLEncoder.encode(nomeFilme, StandardCharsets.UTF_8);

        // Monta o endereço do Http
        String endereco = enderecoHttp + nomeFilme + token;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
