package br.com.alura.screenmatch.modelo;

public class Carro {
    private String modelo;
    private double precoMedio1; //10
    private double precoMedio2; //5
    private double precoMedio3; //20

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoMedio1, double precoMedio2, double precoMedio3){
        this.precoMedio1 = precoMedio1;
        this.precoMedio2 = precoMedio2;
        this.precoMedio3 = precoMedio3;
    }

    public double calcularMenorPreco(){
        double menorPreco = precoMedio1;
        if(precoMedio2 < menorPreco){
            menorPreco = precoMedio2;
        }
        if(precoMedio3 < menorPreco){
            menorPreco = precoMedio3;
        }
        return menorPreco;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoMedio1;
        if(precoMedio2 > maiorPreco){
            maiorPreco = precoMedio2;
        }
        if(precoMedio3 > maiorPreco){
            maiorPreco = precoMedio3;
        }
        return maiorPreco;
    }

    public void exibirInfo(){
        System.out.println("""
                ***************************************************
                Modelo: %s
                Preço Ano 1: %.2f
                Preço Ano 2: %.2f
                Preço Ano 3: %.2f
                Menor Preço: %.2f
                Maior Preço: %.2f
                ***************************************************
                """.formatted(modelo,
                precoMedio1,
                precoMedio2,
                precoMedio3,
                calcularMenorPreco(),
                calculaMaiorPreco()));
    }

}
