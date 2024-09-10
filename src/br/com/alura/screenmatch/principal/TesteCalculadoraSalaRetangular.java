package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.CalculadoraSalaRetangular;

public class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calcularArea = new CalculadoraSalaRetangular();
        calcularArea.calcularArea(10, 10);
        calcularArea.calcularPerimetro(10, 10);
    }
}
