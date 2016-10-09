
public class Circunferencia implements AreaCalculavel{
	double raio;
	
	Circunferencia(double raio){
		this.raio = raio;
	}
	
	public double calcularArea() {
		return (3.14 *(raio*raio));
	}
	

}
