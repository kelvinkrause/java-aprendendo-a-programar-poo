package br.com.alura.screenmatch.modelo;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
