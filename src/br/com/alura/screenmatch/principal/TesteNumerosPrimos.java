package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.GeradorPrimo;
import br.com.alura.screenmatch.modelo.NumerosPrimos;
import br.com.alura.screenmatch.modelo.VerificadorPrimo;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(37);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.geradorProximoPrimo(17);
        System.out.println("O próximo primo após o 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
