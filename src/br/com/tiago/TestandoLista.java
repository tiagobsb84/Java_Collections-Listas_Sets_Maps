package br.com.tiago;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aula = new ArrayList<String>();
		aula.add(aula1);
		aula.add(aula2);
		aula.add(aula3);
		
		aula.remove(aula1);
		
		for(String aulas : aula) {
			System.out.println("Aula: " + aulas);
		}
		
		String primeiraAula = aula.get(0);
		System.out.println("Primeira aula: " + primeiraAula); 
		
		for(int i = 0; i < aula.size(); i++) {
			System.out.println("Aula: " + aula.get(i));
		}
		
		aula.forEach(aulas -> {
			System.out.println("Pecorre:");
			System.out.println("Aula: " + aulas);
		});
		
		String aula4 = "Adicionando mais conhecimento";
		aula.add(aula4);
		Collections.sort(aula);
		System.out.println(aula);
	}

}
