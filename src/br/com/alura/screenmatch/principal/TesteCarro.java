package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.ModeloCarro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro palio = new ModeloCarro();
        palio.definirModelo("Palio Elx 1.0");
        palio.definirPrecos(20000.0, 22000.0, 23202.0);
        palio.exibirInfo();
    }
}
