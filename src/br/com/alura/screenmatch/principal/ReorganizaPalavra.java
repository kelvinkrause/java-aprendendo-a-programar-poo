package br.com.alura.screenmatch.principal;

import java.sql.Connection;

public class ReorganizaPalavra {
    public static void main(String[] args) {
        String name = "kelvin";
        String scrambled = "evikln";
        String word = "";

        for (int i = 0; i < name.length(); i++){
            String letra = String.valueOf(name.charAt(i));
            for(int y = 0; y < scrambled.length(); y++){
                if (String.valueOf(scrambled.charAt(y)).equals(letra)) {
                    word += scrambled.charAt(y);
                }

            }
        }

        System.out.println(word);


    }
}
