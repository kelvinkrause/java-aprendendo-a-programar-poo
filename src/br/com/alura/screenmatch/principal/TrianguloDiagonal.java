package br.com.alura.screenmatch.principal;

import java.util.Scanner;

/*
*  *  *  *
   *  *  *
      *  *
         *
 */

public class TrianguloDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int x = scanner.nextInt();

        System.out.println();

       for(int i = 1; i <= x; i++){
           for(int j = 1; j < i; j++){
               System.out.print("   ");
           }
           for(int k = x; k >= i; k--){
               System.out.print("*  ");
           }
           System.out.println();
       }
       scanner.close();
    }
}

