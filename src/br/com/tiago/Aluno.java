package br.com.tiago;

public class Aluno {

	private String aluno;
	private int numeroMatricula;
	
	public Aluno(String aluno, int numeroMatricula) {
		this.aluno = aluno;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getAluno() {
		return aluno;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "Aluno:" + this.aluno + ", matrícula:" + this.numeroMatricula;
	}
}
