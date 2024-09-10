package br.com.alura.screenmatch.exercicio;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableTitulo {
    public static void main(String[] args) {

        Titulo t1 = new Titulo("Kelvin");
        Titulo t2 = new Titulo("Giovana");
        Titulo t3 = new Titulo("Martina");
        Titulo t4 = new Titulo("Angelona");

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(t1);
        listaTitulos.add(t2);
        listaTitulos.add(t3);
        listaTitulos.add(t4);

        System.out.println("NÃO ORDENADA");
        System.out.println(listaTitulos);

        System.out.println("ORDENADA");
        listaTitulos.sort(Comparator.comparing(Titulo::getNome));
        System.out.println(listaTitulos);


    }
}

class Titulo implements Comparable<Titulo>{
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public int compareTo(@NotNull Titulo outroNome) {
        return this.nome.compareTo(outroNome.nome);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
