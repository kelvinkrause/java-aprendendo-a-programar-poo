package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.*;

import java.util.ArrayList;
import java.util.Collections;

public class DesafiosListaDeObjetosDistintos {
    public static void main(String[] args) {

        System.out.println("""
                =============================================================
                Exercicio 1
                =============================================================
                """);
        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Ferro");
        elementos.add("Água");
        elementos.add("Ar");
        elementos.add("Terra");

        for (String elemento : elementos) {
            System.out.println(elemento);
        }

        System.out.println("""
                =============================================================
                Exercicio 2 e 3
                =============================================================
                """);
        Cachorro perola = new Cachorro();
        Animal animal = (Animal) perola; // Casting de cachorro para Animal
        if (animal instanceof Cachorro cachorro){
            cachorro.emitirSom();
        } else {
            System.out.println("O Objeto não é um Cachorro.");
        }

        System.out.println("""
                =============================================================
                Exercicio 4
                =============================================================
                """);
        Produto produto1 = new Produto("Lapis", 1.5, 1, "UN");
        Produto produto2 = new Produto("Lapizera", 10.0, 1, "UN");
        Produto produto3 = new Produto("Lapis 3D", 5.0, 1, "UN");

        ArrayList<Produto> listaDeLapis = new ArrayList<>();
        listaDeLapis.add(produto1);
        listaDeLapis.add(produto2);
        listaDeLapis.add(produto3);

        double soma = 0;
        for (Produto produto : listaDeLapis) {
            soma += produto.getPreco();
        }

        System.out.println("Preço médio dos produtos é: " + soma / listaDeLapis.size());

        System.out.println("""
                =============================================================
                Exercicio 5
                =============================================================
                """);
        Circulo circulo = new Circulo(5.0);
        Quadrado quadrado = new Quadrado(4.0);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(quadrado);
        listaFormas.add(circulo);

        for (Forma forma : listaFormas){
            forma.calcularArea();
        }

        System.out.println("""
                =============================================================
                Exercicio 5
                =============================================================
                """);
        ContaBancaria conta1 = new ContaBancaria( 11111, 1000000.0, "Kelvin");
        ContaBancaria conta2 = new ContaBancaria(22222, 100000.0, "Giovana");
        ContaBancaria conta3 = new ContaBancaria(33333, 30000.0, "Martina");
        ContaBancaria conta4 = new ContaBancaria(44444, 30000.0, "Angelina");

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.printf("""
                =============================================================
                Conta com maior saldo: %s
                Numero:                %d
                Saldo:                 %.2f
                =============================================================
                %n""", contaMaiorSaldo.titular, contaMaiorSaldo.getNumeroConta(), contaMaiorSaldo.getSaldo());

    }
}
