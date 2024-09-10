package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Aluno;

public class InstanciaAluno {
    public static void main(String[] args) {
        Aluno kelvin = new Aluno();

        kelvin.setNomeAluno("Kelvin Renan Krause");
        kelvin.setIdadeAluno(27);
        kelvin.setNotaAluno(10);
        kelvin.setNotaAluno(10);
        kelvin.setNotaAluno(10);

        kelvin.exibeInformacaoAluno();
    }
}
