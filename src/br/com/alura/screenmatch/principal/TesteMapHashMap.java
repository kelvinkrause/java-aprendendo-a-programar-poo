package br.com.alura.screenmatch.principal;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {
    public static void main(String[] args) {
        Map<String, Integer> usandoHashMap = new HashMap<>();

        //Adicioando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        System.out.println(usandoHashMap);

        //Acessando um valor através de uma chave (Gatos)
        int valor = usandoHashMap.get("Gatos");
        System.out.println("Valor da chave Gatos: " + valor);

        //Removendo um par chave-valor
        usandoHashMap.remove("Cachorros");

        for(String chave : usandoHashMap.keySet()){
            System.out.println("CHAVE: " + chave + ", VALOR " + usandoHashMap.get(chave));
        }




    }
}
