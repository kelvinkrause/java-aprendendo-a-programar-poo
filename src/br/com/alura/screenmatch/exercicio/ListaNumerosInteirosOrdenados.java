package br.com.alura.screenmatch.exercicio;

import java.util.*;

public class ListaNumerosInteirosOrdenados {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            listaNumeros.add(i);
        }

        //Embaralha a lista
        Collections.shuffle(listaNumeros);
        System.out.println(listaNumeros);

        //Ordena a lista do menor ao maior
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

    }
}
