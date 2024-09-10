package br.com.alura.screenmatch.modelo;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double tempCelsius) {
        double tempFahrenheit = tempCelsius * 1.8 + 32;
        System.out.println(tempCelsius + "ºC = " + tempFahrenheit + "ºF");
    }

    @Override
    public void fahrenheitParaCelsius(double tempFahrenheit) {
        double tempCelsius = (tempFahrenheit - 32) / 1.8;
        System.out.println(tempFahrenheit + "ºF = " + tempCelsius + "ºC");
    }
}
