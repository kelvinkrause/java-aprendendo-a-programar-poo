package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Cachorro;
import br.com.alura.screenmatch.modelo.Gato;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();

    }
}
