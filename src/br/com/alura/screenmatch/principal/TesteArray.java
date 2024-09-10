package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;

import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        Filme[] arrayFilmes = new Filme[2];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrayFilmes.length; i++){
            System.out.println("Informe um titulo de filme:");
            String titulo = scan.nextLine();
            System.out.println("Informe o ano de lançamento:");
            int anoLancamento = scan.nextInt();
            scan.nextLine();

            arrayFilmes[i] = new Filme(titulo, anoLancamento);
        }

        scan.close();

        for (int j = 0; j < arrayFilmes.length; j++){
            System.out.println((j + 1) + "º - Filme: " + arrayFilmes[j].getNome() + " (" + arrayFilmes[j].getAnoDeLancamento() + ")");
        }

    }
}
