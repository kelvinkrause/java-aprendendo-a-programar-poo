package br.com.alura.screenmatch.exercicio;

import br.com.alura.screenmatch.execao.ErroConsultaGitHubException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaUsuarioGitHub {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);


            System.out.println("Informe o nick do user GitHub:");
            String username = scanner.nextLine();

            String endereco = "https://api.github.com/users/" + username;

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 404) {
                    throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
                }

                System.out.println(response.body());

                FileWriter file = new FileWriter("C:\\Temp\\teste.txt");
                file.write(response.body());
                file.close();


            } catch (IOException | InterruptedException e) {
                System.out.println("Houve algum erro durante a consulta da API do GitHub");
                e.printStackTrace();
            } catch (ErroConsultaGitHubException e) {
                System.out.println(e.getMessage());
            } finally {
                scanner.close();
            }

        }

    }

