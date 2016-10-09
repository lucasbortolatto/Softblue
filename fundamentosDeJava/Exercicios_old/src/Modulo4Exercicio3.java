
public class Modulo4Exercicio3 {

	public static void main(String[] args) {
		
		Modulo4Triangulo triangulo = new Modulo4Triangulo();
			triangulo.b = 12;
			triangulo.h = 2;
			double a = triangulo.calcularArea();
			System.out.println("햞ea do Triangulo: " + a);
		
		Modulo4Quadrado quadrado = new Modulo4Quadrado();{
			quadrado.l = 2;
			a = quadrado.calcularArea();
			System.out.println("햞ea do Quadrado: " + a);
		}
		
		Modulo4Circunferencia circunferencia = new Modulo4Circunferencia();{
			circunferencia.p = 3.14;
			circunferencia.r = 2;
			a = circunferencia.calcularArea();
			System.out.println("햞ea da Circunferencia: " + a);
			
		}
		
		Modulo4Trapezio trapezio = new Modulo4Trapezio();{
			trapezio.bMaior = 4;
			trapezio.bMenor = 2;
			trapezio.h = 2;
			
			a = trapezio.calcularArea();
			System.out.println("햞ea do Trapezio: " + a);
		}
		
		
		
		
			
		

	}

}
