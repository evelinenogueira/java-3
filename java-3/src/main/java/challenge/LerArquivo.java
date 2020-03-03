package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LerArquivo {

    public String linha = null;
    public List<Individuo> arquivoFormatado = new ArrayList<>();

    public void ler() throws IOException {

        BufferedReader csvLeitor = new BufferedReader(new FileReader("/home/eveline/codenation/java-3/src/main/resources/data.csv"));

        while ((linha = csvLeitor.readLine()) !=null) {

            String[] arquivoCSV = linha.split(",");

            arquivoFormatado.add(new Individuo(arquivoCSV[14], arquivoCSV[3],arquivoCSV[2],arquivoCSV[18].isEmpty()?"0.0":arquivoCSV[18],arquivoCSV[17],arquivoCSV[8],arquivoCSV[6]));

            System.out.println(arquivoFormatado);


        }

    }

}



