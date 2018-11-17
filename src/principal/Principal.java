package principal;

import acoes_estados.EstadosMapaRomenia;
import acoes_estados.EstadosMundoAspirador;
import buscas.BuscaAEstrela;
import buscas.BuscaGulosa;
import problemas.ProblemaMapaRomenia;
import problemas.ProblemaMundoAspirador;

public class Principal {
	


	public static void main(String[] args) {

		//BuscaGulosa("Mapa da Romenia", EstadosMapaRomenia.Arad, EstadosMapaRomenia.Bucareste);
		BuscaAEstrela("Mapa da Romenia", EstadosMapaRomenia.Zerind, EstadosMapaRomenia.Bucareste);
		

	}
	
	public static void BuscaGulosa(String problema, Enum origem, Enum objetivo) {
		
		BuscaGulosa busca = new BuscaGulosa();
		System.out.println("Busca Gulosa");
		System.out.println();

		if(problema.equals("Mapa da Romenia")) {
			
			busca.Busca(new ProblemaMapaRomenia(), origem, objetivo);
			
		}else if(problema.equals("Mundo do Aspirador")) {
			
			busca.Busca(new ProblemaMundoAspirador(), origem, objetivo);
			
		}else {
			
			System.out.println("Problema inválido!");
		}
		
	}
	
	public static void BuscaAEstrela(String problema, Enum origem, Enum objetivo) {
		
		BuscaAEstrela busca = new BuscaAEstrela();
		System.out.println("Busca A*");
		System.out.println();

		if(problema.equals("Mapa da Romenia")) {
			
			busca.Busca(new ProblemaMapaRomenia(), origem, objetivo);
			
		}else if(problema.equals("Mundo do Aspirador")) {
			
			busca.Busca(new ProblemaMundoAspirador(), origem, objetivo);
			
		}else {
			
			System.out.println("Problema inválido!");
		}
		
	}

}
