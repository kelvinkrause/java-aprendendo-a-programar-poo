package br.com.alura.screenmatch.modelo;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis(){
        System.out.println("Arranhando moveis!");
    }

}
