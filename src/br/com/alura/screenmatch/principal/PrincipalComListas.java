package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme duna1 = new Filme("Duna 1", 2021);
        duna1.avalia(10);
        Filme duna2 = new Filme("Duna: Parte 2", 2024);
        duna2.avalia(10);
        Filme avatar1 = new Filme("Avatar", 2009);
        avatar1.avalia(10);
        Filme avatar2 = new Filme("Avatar: Caminho das Águas", 2023);
        avatar2.avalia(10);
        Serie peakyBlinders = new Serie("Peaky Blinders", 2013, 6);
        peakyBlinders.avalia(10);
        Serie americanHorrorStory = new Serie("American Horror Story", 2011, 12);
        americanHorrorStory.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(avatar1);
        lista.add(duna2);
        lista.add(avatar2);
        lista.add(peakyBlinders);
        lista.add(duna1);
        lista.add(americanHorrorStory);

        boolean existe = lista.contains(avatar1);
        //Contains (Verifica se o objetos existe dentro lista)



        //ForEach -> Para cada Titulo (item) da minha Lista...
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //instancedof = item é instância de Filme, como nossa lista compoem Filme e Serie,
            //apenas entrara no if quando passar pelo filme, o "filme" nas versões mais atuais
            //não é necessário realiar o cast, podendo então declarar a variável o Filme "filme"
            if (item instanceof Filme filme && filme.getClassificacao() > 2 ) {
                //Filme filme = (Filme) item; //Cast = Convertendo o item para Filme
                System.out.println("Classificação: " + filme.getClassificacao());
            } else {
                System.out.println("Serie");
            }
        }

        //Instência de um Novo Objeto
        Conta conta = new Conta(123, "NOME");

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Caio Castro");
        buscaPorArtista.add("Bruna L.");
        buscaPorArtista.add("Dand Crocodille");

        System.out.println("\n************** Nomes Artistas **************");
        //buscaPorArtista.forEach(nome -> System.out.println(nome));
        buscaPorArtista.forEach(System.out::println);
        System.out.println("**********************************************");

        System.out.println("ANTES DA ORDENAÇÃO: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("DEPOIS DA ORDENAÇÃO: " + buscaPorArtista);

        System.out.println("\n##################### LISTA DE TITULOS NÃO ORDENADOS #####################");

        lista.forEach(System.out::println);

        System.out.println("\n##################### LISTA DE TITULOS ORDENADOS POR NOME #####################");

        Collections.sort(lista);
        lista.forEach(System.out::println);

        System.out.println("\n##################### LISTA DE TITULOS ORDENADOS POR NOME E ANO #####################");

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        lista.forEach(System.out::println);


        Stack<Integer> nova = new Stack<>();
        for(int i = 1; i <= 5; i++) nova.push(i);

        System.out.println(nova);
        nova.pop();
        System.out.println(nova);
        nova.push(10);
        nova.push(11);
        nova.push(12);
        System.out.println(nova);
        nova.pop();
        nova.pop();
        System.out.println(nova);

    }
}




