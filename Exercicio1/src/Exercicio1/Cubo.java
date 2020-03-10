package Exercicio1;

public class Cubo extends Quadrado implements Volume{
	public double largura;
	
	public Cubo(String nome, double base, double altura, double largura) {
		super(nome, base, altura);
		this.largura = largura;
	}
	@Override
	public double volume() {
		return getBase() * getAltura() * largura;
	}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double perimetro() {
		return 0;
	}
	@Override
	public double diagonal() {
		return 0;
	}
}
