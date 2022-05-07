package br.com.tiago;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Curso Java Lista", "Fulano beltrano");
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		javaColecoes.adiciona(new Aula("Modelagem de dados", 15));
		javaColecoes.adiciona(new Aula("Curso Java Lista", 22));
		javaColecoes.adiciona(new Aula("Spring Boot", 21));
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);

		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.toString());
	}
}
