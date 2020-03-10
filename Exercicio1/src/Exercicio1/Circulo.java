package Exercicio1;

public class Circulo extends Figuras {
	private double raio;
	
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return (getRaio() * getRaio()) * 3.14;
	}
	public double perimetro() {
		return (2 * 3.14 * getRaio());
	}
 
}
