package challenge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


	public static void main (String[]args) {
		try {
			LerArquivo obj = new LerArquivo();
			List<Individuo> jogadorPronto = obj.ler();

		}catch (Exception e){

			e.printStackTrace();
		}

	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		Set<String> unique = jogadorPronto.stream().map(x-> x.getNationality()).collect(Collectors.toSet());


				return unique.size();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {

		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		Set<String> uniqueClub = jogadorPronto.stream().map(x-> x.getClub()).collect(Collectors.toSet());

		if (uniqueClub.contains("")){
			uniqueClub.remove("");
		}

		return uniqueClub.size();
	}

	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {

		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		List<String> top20 = jogadorPronto.stream().map(x-> x.getFullName()).collect(Collectors.toList());

		return top20.subList(0,20);
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {

		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		List<Individuo> ordenar = jogadorPronto.stream().sorted(Comparator.comparing((Individuo individuo) ->
				individuo.getEurReleaseClause()).reversed()).collect(Collectors.toList());

		List<String> listaNomes = new ArrayList<String>();

		for(int i=0;i<10;i++) {

			listaNomes.add(ordenar.get(i).getFullName());
		}

		return listaNomes;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {

		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		List<Individuo> ordemjog = jogadorPronto.stream().sorted(Comparator.comparing((Individuo individuo)

				->individuo.getBirthDate())).collect(Collectors.toList());

		List<String> ordemjog2 = new ArrayList<String>();

		for(int i=0;i<10;i++) {

			ordemjog2.add(ordemjog.get(i).getFullName());
		}


		return ordemjog2;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {

		LerArquivo obj = new LerArquivo();
		List<Individuo> jogadorPronto = obj.ler();

		List<Integer> maisVelhos = jogadorPronto.stream().map(x->x.getAge()).collect(Collectors.toList());

		Map<Integer, Long> mapAge = maisVelhos.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Integer, Integer> mapAge2 = mapAge.entrySet().stream().collect(Collectors.toMap(x->x.getKey(), x->x.getValue().intValue()));

		return mapAge2;
	}

}
