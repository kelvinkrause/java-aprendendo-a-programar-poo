package br.com.alura.screenmatch.modelo;

public class GeradorPrimo extends NumerosPrimos{

    public int geradorProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumeroPrimo = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumeroPrimo)){
            proximoNumeroPrimo++;
        }
        return proximoNumeroPrimo;
    }

}
