package br.com.alura.screenmatch.principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraDeArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("C:\\Temp\\teste.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) { // hasNextLine() verifica se há mais linhas a serem lidas
                String linha = scanner.nextLine(); // nextLine() lê a próxima linha
                System.out.println(linha);
            }

            scanner.close();

        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        }
    }
}
