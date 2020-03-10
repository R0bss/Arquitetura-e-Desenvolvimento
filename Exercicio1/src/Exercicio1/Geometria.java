package Exercicio1;
import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figuras> figuras = new ArrayList<>();
		figuras.add(new Triangulo("Triangulo",1,2));
		figuras.add(new Quadrado("Quadrado",4,4));
		figuras.add(new Circulo("Circulo",4));
		figuras.add(new Losango("Losango",3,4));
		figuras.add(new Retangulo("Retangulo",2,4));
		figuras.add(new Trapezio("Trapezio",6,4,3));
		figuras.add(new Esfera("Esfera",4));
		figuras.add(new Cilindro("Cilindro",4,4));
		figuras.add(new Cubo("Cubo",4,4,4));
		figuras.add(new Piramide("Piramide",1,2,3));
		for(Figuras fig:figuras) {
	
			System.out.println("Nome:" + fig.getNome());
			
			if(fig.area() != 0) {		
			System.out.println("Area:" +fig.area());
			}
			if(fig.perimetro() != 0) {
			System.out.println("Perimetro:" + fig.perimetro());
			}

			if(fig instanceof Diagonal) {
				if(((Diagonal)fig).diagonal() != 0) {
				System.out.println("Diagonal:" + ((Diagonal)fig).diagonal());
				}
			}
			if(fig instanceof Volume) {
				System.out.println("Volume:" + ((Volume)fig).volume());
			}
			System.out.println("------------------------------");
		}
	}

}
