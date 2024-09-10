package br.com.alura.screenmatch.modelo;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int tabuadaDoNumero) {
        System.out.println("TABUADA DO " + tabuadaDoNumero);
        for(int i = 1; i <= 10; i++){
            System.out.println(tabuadaDoNumero + " X " + i + " = " + tabuadaDoNumero * i);
        }
    }
}
