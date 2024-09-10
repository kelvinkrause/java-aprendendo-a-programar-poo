package br.com.alura.screenmatch.modelo;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero){
        if(numero <= 1){
            return false;
        }
        for (int i = 2; i * i <= numero; i++){
            //System.out.println(numero + " % " + i + " sobra " + numero % i);
            if (numero % i == 0){
                //System.out.println(i);
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior){
        System.out.println("Numeros primos até " + limiteSuperior);
        for (int i = 2; i <= limiteSuperior; i++){
            if(verificarPrimalidade(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();

    }

}
