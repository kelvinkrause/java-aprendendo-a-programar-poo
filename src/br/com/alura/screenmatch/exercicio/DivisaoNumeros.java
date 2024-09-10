package br.com.alura.screenmatch.exercicio;

import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {
        int num1, num2;
        double result;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero dividendo:");
        num1 = scan.nextInt();
        System.out.println("Informe o numero divisor:");
        num2 = scan.nextInt();

        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("ERRO: Divisão por zero não permitido." );
        }






    }
}
