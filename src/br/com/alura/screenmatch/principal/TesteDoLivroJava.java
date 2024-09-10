package br.com.alura.screenmatch.principal;

public class TesteDoLivroJava {
    public static void main(String[] args) {

        double v1 = 10.0;
        double v2 = 10.0;
        double total = v1 >= v2 ? v1 + v2 : 0;
        System.out.println(total);

        boolean condition = v1 > v2;
        if (!condition){
            System.out.println("V1 (" + v1 + ") não é maior (>) que V2 (" + v2 + ")");
        }

        for (int i = 0; i < 10; i++){
            if(i == 7){
                continue; //Pula a interação do loop
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++){
            if (i == 7){
                break; //Para o loop
            }
            System.out.print(i + " ");
        }

    }
}
