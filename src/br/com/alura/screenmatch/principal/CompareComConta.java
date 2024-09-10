package br.com.alura.screenmatch.principal;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareComConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta(2017, "Luna");
        Conta conta2 = new Conta(2017, "Pokemon");
        Conta conta3 = new Conta(2021, "Margott");
        Conta conta4 = new Conta(2024, "Night");

        List<Conta> contas = new ArrayList<>();
        contas.add(conta4);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta1);

        System.out.println("\nLISTA NÃO ORDENADA");

        contas.forEach(System.out::println);

        System.out.println("\nLISTA ORDENADA - Nº CONTA");

        Collections.sort(contas);
        contas.forEach(System.out::println);

        System.out.println("\nLISTA ORDENADA - Nº CONTA E NOME");

        contas.sort(Comparator.comparing(Conta::getNome));
        contas.forEach(System.out::println);
    }
}

class Conta implements Comparable<Conta>{
    private int numero;
    private String nome;

    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(@NotNull Conta outraConta) {
        if(this.numero < outraConta.numero){
            return -1;
        }
        if(this.numero > outraConta.numero){
            return 1;
        }
        return 0;
    }

}
