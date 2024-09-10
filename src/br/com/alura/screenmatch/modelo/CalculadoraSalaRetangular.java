package br.com.alura.screenmatch.modelo;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("A area da sala retangular é: " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("O perímetro da sala retangular é: " + (2 * (altura + largura)));
    }
}
