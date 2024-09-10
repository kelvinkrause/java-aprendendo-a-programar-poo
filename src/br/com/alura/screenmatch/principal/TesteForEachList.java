package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

public class TesteForEachList {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Kelvin");
        nomes.add("Giovana");
        nomes.add("Martina");
        nomes.add("Valentina");

        System.out.println("""
                =======================================================================
                FOR EACH
                
                int i = 0;
                for (String nome: nomes) {
                    i++;
                    System.out.println(i + " -> " + nome)
                }
                """);
        int i = 0;
        for (String nome: nomes) {
            i++;
            System.out.println(i + " -> " + nome);
        }

        System.out.println("""
                ========================================================================
                FOR EACH - SCRIPT SIMPLIFICADO (Função Lambda)
                
                nomes.forEach(nome -> System.out.println(nome.toUpperCase()));
                """);

        nomes.forEach(nome -> System.out.println(nome.toUpperCase()));

        System.out.println("""
                ========================================================================
                FOR EACH - SCRIPT MAIS SIMPLICADO (Method Reference)
                
                nomes.forEach(System.out::println);
                """);
        nomes.forEach(System.out::println);
        System.out.println("========================================================================");

    }
}
