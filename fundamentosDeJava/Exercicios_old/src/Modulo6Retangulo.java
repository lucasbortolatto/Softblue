
public class Modulo6Retangulo extends Modulo6Figura {
	private double base;
	private double altura;
	
	public Modulo6Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea(){
		return base*altura;
	}

}