package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelo.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Hobbit: Uma Jornada Inesperada".toUpperCase(), 2012);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(164);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme("AVATAR", 2009);
        outroFilme.setDuracaoEmMinutos(146);

        Serie you = new Serie("YOU", 2018, 1);
        you.exibeFichaTecnica();
        you.setTemporada(4);
        you.setEpisodiosPorTemporada(10);
        you.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratonar YOU: " + you.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(you);
        System.out.println("Get tempo total: " + calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Epsodio epsodio = new Epsodio();
        epsodio.setNumero(1);
        epsodio.setNome(you.getNome());
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);


        var dune2 = new Filme("Duna: Parte 2", 2024);
        dune2.setDuracaoEmMinutos(300);
        dune2.avalia(10);

        ArrayList<Filme> listaDeFlilmes = new ArrayList<>();

        listaDeFlilmes.add(meuFilme);
        listaDeFlilmes.add(outroFilme);
        listaDeFlilmes.add(dune2);

        System.out.println("\nTamanho da lista de filmes: " + listaDeFlilmes.size());
        System.out.println("Primeio filme: " + listaDeFlilmes.get(1).getNome());
        System.out.println(listaDeFlilmes);
        System.out.println("SIZE: " + listaDeFlilmes.size());

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa kelvin = new Pessoa("Kelvin", 26);
        Pessoa giovana = new Pessoa("Giovana", 24);
        Pessoa martina = new Pessoa("Martina", 0);
        listaDePessoas.add(kelvin);
        listaDePessoas.add(giovana);
        listaDePessoas.add(martina);

        System.out.println("\nTamanho Lista de Pessoas: " + listaDePessoas.size());
        System.out.println("Índice: " + listaDePessoas.indexOf(giovana) + " " +  listaDePessoas.get(1));
        System.out.println("\n******* Listas de Pessoas *******");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(listaDePessoas.indexOf(pessoa) + " " + pessoa);
        }
        System.out.println("*********************************\n");

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto fioDental = new Produto("Fio Dental", 10.0, 1, "UN");
        Produto pastaDental = new Produto("Creme Dental", 10.0, 1, "UN");
        Produto escovaDental = new Produto("Escova Dental", 20.0, 1, "UN");

        listaDeProdutos.add(fioDental);
        listaDeProdutos.add(pastaDental);
        listaDeProdutos.add(escovaDental);

        System.out.println("Tamanho lista de produtos: "  + listaDeProdutos.size());
        System.out.printf("Item lista de produtos posicao %d : %s%n\n", listaDeProdutos.indexOf(listaDeProdutos.get(1)), listaDeProdutos.get(1).getNome());


        ProdutoPericivel cafe = new ProdutoPericivel(
                "Café: William & Sons Coffee - Adauto Guimarães",
                139.0,
                1,
                "22/01/2024",
                "22/06/2024",
                "Kg");

        System.out.println(cafe);

        /*
        var produtoSemId = new ProdutoPericivel();
        produtoSemId.setName("Produto em Branco");

        int[] numeros = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Informe um valor para a posicão " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

         */
    }
}
