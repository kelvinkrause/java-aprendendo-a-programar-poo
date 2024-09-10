package br.com.alura.screenmatch.modelo;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void verificaIdade(){
        if(this.idade >= 18 ){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idades.");
        }
    }

}