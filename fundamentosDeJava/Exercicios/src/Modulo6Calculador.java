
public class Modulo6Calculador {

	public static void main(String[] args) {
		Modulo6Quadrado q1 = new Modulo6Quadrado(3.0);
		Modulo6Quadrado q2 = new Modulo6Quadrado(10.0);
		
		Modulo6Retangulo r1 = new Modulo6Retangulo(2.0, 7.0);
		Modulo6Retangulo r2 = new Modulo6Retangulo(5.0, 3.0);
		
		Modulo6Figura[] figuras = { q1, q2, r1, r2 };
		
		Modulo6FiguraComplexa figuraComplexa = new Modulo6FiguraComplexa (figuras);
		
		double area = figuraComplexa.calcularArea();
		
		System.out.println("Área da figura: " + area);
		
		
		

	}

}
