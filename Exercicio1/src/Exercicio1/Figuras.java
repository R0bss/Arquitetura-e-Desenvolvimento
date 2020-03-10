package Exercicio1;

public abstract class Figuras {
	private String nome;
	public abstract double area();
	public abstract double perimetro();
	
	public Figuras(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
