package Exercicio1;

public class Cilindro extends Circulo implements Volume{
	public double altura;
	
	public Cilindro(String nome, double raio, double altura) {
		super(nome, raio);
		this.altura = altura;

	}
	@Override
	public double volume() {
		return altura * getRaio(); 
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
