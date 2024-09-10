package br.com.alura.screenmatch.principal;


public class InverteString {
    public static void main(String[] args) {
        String original = "Kelvin";
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("String invertida: " + invertida);
    }
}

