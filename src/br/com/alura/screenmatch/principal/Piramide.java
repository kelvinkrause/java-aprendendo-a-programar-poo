package br.com.alura.screenmatch.principal;

public class Piramide {
    public static void main(String[] args) {

        int linha = 5, k = 0;

        for(int i = 1; i <= linha; i++, k = 0){
            for(int espaco = 1; espaco <= linha - i; espaco++){
                System.out.print("  ");
            }
            while (k != 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }

        for(int i = linha; i >= 1; i--, k = 0){
            for(int espaco = 0; espaco < linha - i; espaco++){
                System.out.print("  ");
            }
            while(k != 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }

    }
}
