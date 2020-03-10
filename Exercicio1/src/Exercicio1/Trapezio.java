package Exercicio1;

public class Trapezio extends Poligono {
	public double basemenor;
	
	public Trapezio(String nome, double base, double altura, double basemenor) {
		super(nome, base, altura);
		this.basemenor = basemenor;
	}

	@Override
	public double area() {
		return ((getBase() + basemenor) * getAltura());
		
	}

	@Override
	public double perimetro() {
		return getBase() + basemenor + 2 * (Math.sqrt((Math.pow(((getBase() - basemenor)/2), 2)) + (Math.pow(getAltura(), 2))));
	}

}
