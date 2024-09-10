package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelo.BuscaFilme;
import br.com.alura.screenmatch.modelo.ExportaJsonsEmTXT;
import br.com.alura.screenmatch.modelo.Titulo;
import br.com.alura.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        String busca = "";

        List<Titulo> listTitulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() // Formata o json
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Qual filme você quer pesquisar?");
            busca = scan.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {

                // Faz a requisição para a API Omdb com o nome do filme
                BuscaFilme buscaFilme = new BuscaFilme();
                String json = buscaFilme.buscaFilme(busca);

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);

                listTitulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        // Exporta Titulos para um arquivo JSON
        ExportaJsonsEmTXT exporta = new ExportaJsonsEmTXT();
        exporta.exportaJsonTxt("C:\\TEMP\\FILM.json", gson.toJson(listTitulos));

        System.out.println("Finalizou Corretamente");

    }
}
