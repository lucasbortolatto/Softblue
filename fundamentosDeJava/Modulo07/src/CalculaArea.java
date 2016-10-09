
public class CalculaArea {

	public static void main(String[] args) {
		AreaCalculavel quadrado = new Quadrado(3);
		System.out.println(quadrado.calcularArea());
		
		AreaCalculavel circunferencia = new Circunferencia(2);
		System.out.println(circunferencia.calcularArea());
		
		AreaCalculavel retangulo = new Retangulo(4,2);
		System.out.println(retangulo.calcularArea());
		
		

	}

}
