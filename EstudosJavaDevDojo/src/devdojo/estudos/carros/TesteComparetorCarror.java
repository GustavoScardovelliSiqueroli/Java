package devdojo.estudos.carros;

import java.util.ArrayList;
import java.util.List;

public class TesteComparetorCarror {
	public static void main(String[] args) {
		List<Carro> ListaCarrosCompleta = List.of(new Carro("Lamburgini", "1920", "preta"),
				new Carro("Ferrari", "1920", "azul"), new Carro("vectra", "2010", "azul"));

		// Sem usar o lambda
		List<Carro> ListaPesquisada = pesquisarCarro(ListaCarrosCompleta, new ComparetorCarro() {
			@Override
			public boolean test(Carro carro) {
				return carro.getAno().equals("1920");
			}
		});

		// usando o lambda
		List<Carro> ListaPesquisadaCor = pesquisarCarro(ListaCarrosCompleta, carro -> carro.getCor().equals("azul"));

		System.out.println(ListaPesquisada);
		System.out.println("---------------------------------");
		System.out.println(ListaPesquisadaCor);
		
	
		
		

	}

	public static List<Carro> pesquisarCarro(List<Carro> carros, ComparetorCarro comparetorCarro) {
		List<Carro> filtrada = new ArrayList<>();
		for (Carro carro : carros) {
			if (comparetorCarro.test(carro)) {
				filtrada.add(carro);
			}
		}

		return filtrada;
	}
}
