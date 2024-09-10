package br.com.alura.screenmatch.modelo;

public class Circulo implements Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = (raio * raio) * 3.14159;
        System.out.println("Área do Circulo é: " + area);
    }
}
