package Exercicio1;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(String nome, double base, double altura) {
		super(nome, base, altura);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}

	@Override
	public double perimetro() {
		return getBase() * 4;
	}
	@Override
	public double diagonal() {
		return getBase() * Math.sqrt(2);
	}
}
