package br.com.alura.screenmatch.modelo;

public class ProdutoPericivel extends Produto{
    String dataFabricacao = "";
    String dataValidade = "";

    public ProdutoPericivel(String nome,
                            double preco,
                            int quantidade,
                            String dataFabricacao,
                            String dataValidade,
                            String unidadeMedida){
        super(nome, preco, quantidade, unidadeMedida);
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    public ProdutoPericivel(){
        super("", 0.0, 0, "");
    }

}
