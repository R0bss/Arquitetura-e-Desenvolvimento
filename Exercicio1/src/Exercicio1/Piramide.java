package Exercicio1;

public class Piramide extends Triangulo implements Volume {
	public double lagura;
	
	public Piramide(String nome, double base, double altura, double largura) {
		super(nome, base, altura);
		this.lagura = largura;
	}

	@Override
	public double volume() {
		return lagura * (2 * getBase()) * getAltura();
	}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double perimetro() {
		return 0;
	}

}
