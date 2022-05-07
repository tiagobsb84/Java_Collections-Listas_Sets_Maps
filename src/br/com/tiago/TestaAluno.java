package br.com.tiago;

public class TestaAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Curso Lista", "Fulano");
		javaColecoes.adiciona(new Aula("Modelagem de dados", 15));
		javaColecoes.adiciona(new Aula("Curso Java Lista", 22));
		javaColecoes.adiciona(new Aula("Spring Boot", 21));
		
		Aluno a1 = new Aluno("Angel Feleip", 14424);
		Aluno a2 = new Aluno("Cosmo Bernatti", 74658);
		Aluno a3 = new Aluno("Cascat Souyn", 35312);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matrículados:");
		javaColecoes.getAluno().forEach(a -> {
			System.out.println(a.toString());
		});
	}

}
