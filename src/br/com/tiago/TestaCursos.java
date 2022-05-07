package br.com.tiago;

import java.util.List;

public class TestaCursos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Curso Java Lista", "Fulano beltrano");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.getAulas().add(new Aula("SpringBoot", 25));
		javaColecoes.adiciona(new Aula("Modelagem de dados", 15));
		System.out.println(aulas);

	}
}
