package br.com.tiago;

import java.util.HashSet;
import java.util.Set;

public class TestAlunoUsandoSet {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		alunos.add("Fulano");
		alunos.add("Beltrano");
		alunos.add("Ciglano");
		alunos.add("Alibaba");
		alunos.add("Batati");
		alunos.add("Tote");
		
		boolean contem =  alunos.contains("Cheef");
		System.out.println(contem);
		
		alunos.remove("Alibaba");
		System.out.println(alunos);
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
