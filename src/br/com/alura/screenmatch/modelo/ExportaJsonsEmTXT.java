package br.com.alura.screenmatch.modelo;

import java.io.FileWriter;
import java.io.IOException;

public class ExportaJsonsEmTXT {

    public void exportaJsonTxt(String caminho, String json) throws IOException {
        FileWriter file = new FileWriter(caminho);
        file.write(json);
        file.close();
    }

}
