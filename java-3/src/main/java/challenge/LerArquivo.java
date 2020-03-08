package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class LerArquivo {

    public String linha = null;
    public String separator = ",";


    public List<Individuo> ler()  {

        int contador = 0;

        List<Individuo> jogadorPronto = new ArrayList<Individuo>();

        try {

        BufferedReader csvLeitor = new BufferedReader(new FileReader("/home/eveline/codenation/java-3/src/main/resources/data.csv"));


            while ((linha = csvLeitor.readLine()) != null) {

                String[] arquivoCSV = linha.split(separator);

                Individuo individuo = new Individuo();

                if (contador > 0){

                    individuo.setNationality(arquivoCSV[14]);
                    individuo.setClub(arquivoCSV[3]);
                    individuo.setFullName(arquivoCSV[2]);

                    if (! arquivoCSV[18].isEmpty()) {

                        try {
                            individuo.setEurReleaseClause (Float.parseFloat(arquivoCSV[18]));
                        } catch (NumberFormatException e) {

                            e.printStackTrace();
                        }
                    }

                    if (! arquivoCSV[17].isEmpty())

                    individuo.setEurWage(Float.parseFloat(arquivoCSV[17]));


                    individuo.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").parse(arquivoCSV[8]));
                    individuo.setAge(Integer.parseInt( arquivoCSV[6]));

                    jogadorPronto.add(individuo);
                }

                contador++;
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return jogadorPronto;
    }

}



