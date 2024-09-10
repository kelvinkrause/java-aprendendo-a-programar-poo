package br.com.alura.screenmatch.principal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteExtrairArquivo {
    public static void main(String[] args) {

        String texto = "Este é um texto com C:\\Diretorio1\\Arquivo.txt e " +
                " e depois desse texto K:\\CIGAM\\4.CUSTOMIZACOES\\4.1.LRC\\M02LRC_CUSTOMIZACAO.docx dentro dele." +
                "Podem haver também caminhos apenas de pastas: Exemp.: I:\\CIGAM\\MIC";

        String[] diretoriosArquivos = capturarDiretoriosArquivos(texto);

        System.out.println("Diretórios de arquivos capturados:");
        for (String dirArquivo : diretoriosArquivos) {
            System.out.println(dirArquivo);
        }
    }

    static String[] capturarDiretoriosArquivos(String texto) {
        // Expressão regular para capturar diretórios de arquivos
        String padrao = "(?<!\\\\)(?:[a-zA-Z]:\\\\|\\\\\\\\[\\w.]+\\\\[\\w]+\\\\)?(?:\\\\\\\\)?(?:[\\w\\s.-]+\\\\)*(?:[\\w\\s.-]+\\.[\\w]+)";
        // Padrao: inicia com letra de drive ou caminho UNC, seguido por diretórios e um nome de arquivo com extensão

        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(texto);

        // Lista para armazenar os diretórios de arquivos capturados
        java.util.List<String> diretoriosArquivosList = new java.util.ArrayList<>();
        while (matcher.find()) {
            diretoriosArquivosList.add(matcher.group());
        }

        return diretoriosArquivosList.toArray(new String[0]);
    }
}
