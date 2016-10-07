
public class Modulo6FiguraComplexa extends Modulo6Figura {
	private Modulo6Figura[] figuras;
	
	public Modulo6FiguraComplexa(Modulo6Figura[] figuras){
		this.figuras = figuras;
	}
	
	public double calcularArea(){
		double areaTotal = 0.0;
		
		for (int i = 0; i <figuras.length; i++){
			areaTotal += figuras[i].calcularArea();
		}
		
		return areaTotal;
	}
	
}
