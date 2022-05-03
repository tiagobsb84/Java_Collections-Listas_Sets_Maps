package br.com.tiago;

public class Aula implements Comparable<Aula> {
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getTempo() {
		return this.tempo;
	}
	
	@Override
	public String toString() {
		return "[título: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
