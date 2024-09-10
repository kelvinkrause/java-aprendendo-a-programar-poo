package br.com.alura.screenmatch.exercicio;

/*
4) Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5) Modifique o Exercicio 4 para declarar variáveis de lista como a interface List, demonstrando o uso de polimorfismo
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        System.out.println("\n################ LISTA POLIMORFICA ################\n");

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("*** ELEMENTO 1 ArrayList ***");
        listaPolimorfica.add("*** ELEMENTO 2 ArrayList ***");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("### Elemento A LinkedList ###");
        listaPolimorfica.add("### Elemento B LinkedList ###");

        System.out.println(listaPolimorfica);


    }
}
