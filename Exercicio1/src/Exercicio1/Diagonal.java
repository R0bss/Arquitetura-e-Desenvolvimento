package Exercicio1;

public interface Diagonal {
	double diagonal();
	
	default double resultado(double altura, double base) {
		return base * altura;
	}
}
