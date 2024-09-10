package br.com.alura.screenmatch.modelo;


import br.com.alura.screenmatch.execao.SenhaNaoPodeSerMenorQueOitoCaracter;

public class Usuario {
    private int id;
    private String senha;

    public Usuario(int id, String senha) {
        if (senha.length() < 8){
            throw new SenhaNaoPodeSerMenorQueOitoCaracter("Senha não pode ter menos que oito caracteres.");
        }
        this.id = id;
        this.senha = senha;
        System.out.println("Usuário criado com sucesso.");
    }

    public void validaSenha(String senha){
        if(this.senha != senha){
            System.out.println("Senha inválida.");
        }
    }

}
