package br.com.alura.screenmatch.modelo;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private int notaAluno;
    private int totalNotas;

    public void exibeInformacaoAluno(){
        System.out.println("""
                **********************************************
                
                Nome do aluno:     %s
                Idade do aluno:    %d
                Média notas aluno: %.2f
                
                **********************************************
                """.formatted(nomeAluno, idadeAluno, calculaMedia()));
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNotaAluno(int notaAluno) {
        this.notaAluno += notaAluno;
        this.totalNotas++;
    }

    private double calculaMedia(){
        return notaAluno / totalNotas;
    }
}
