package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.ConversaoFinanceira;
import br.com.alura.screenmatch.modelo.ConversorMoeda;

import java.text.DecimalFormat;

public class TesteConversorDolarReal {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(10, 4.94);
    }
}
