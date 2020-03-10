package Exercicio1;

public class Esfera extends Circulo implements Volume{

	public Esfera(String nome, double raio) {
		super(nome, raio);
	}
	@Override
	public double volume() {
		return (4/3) * 3.14 * getRaio(); 
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
