package br.com.alura.screenmatch.modelo;

public class Quadrado implements Forma{
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = lado * lado;
        System.out.println("Área do quadrado é: " + area);
    }
}
