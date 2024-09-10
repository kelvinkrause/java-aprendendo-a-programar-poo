package br.com.alura.screenmatch.principal;

public class TesteOutputFormatting {
    public static void main(String[] args) {
        String s = "JAVA";
        int i = 10;

        System.out.printf("%-15s%04d%n", s, i);
        //Saida
        //JAVA           0010
    }
}
