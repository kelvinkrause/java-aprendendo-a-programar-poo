package br.com.alura.screenmatch.modelo;

public class TesteConversorTemperaturaPadrao {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemp = new ConversorTemperaturaPadrao();
        conversorTemp.celsiusParaFahrenheit(10);
        conversorTemp.fahrenheitParaCelsius(73);
    }
}
