
public class Modulo6Figura {
	
	private double area;

	public Modulo6Figura(double lado) {
		area = lado * lado;
	}
	
	public Modulo6Figura(double lado1, double lado2){
		area = lado1 * lado2;
	}
	
	public double calcularArea(){
		return this.area;
	}

	public void imprimeArea(){
		System.out.println(area);
	}
	

	
	

}
