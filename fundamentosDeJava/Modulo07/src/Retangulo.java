
public class Retangulo implements AreaCalculavel {
	double base;
	double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return base*altura; 
	}

}