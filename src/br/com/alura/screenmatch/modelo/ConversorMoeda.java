package br.com.alura.screenmatch.modelo;

import java.text.DecimalFormat;

public class ConversorMoeda implements ConversaoFinanceira{

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void converterDolarParaReal(double valorDolar, double cotacaoDolar) {
        System.out.println("$ " + cotacaoDolar + " = R$ " + df.format(valorDolar * cotacaoDolar));
    }
}
