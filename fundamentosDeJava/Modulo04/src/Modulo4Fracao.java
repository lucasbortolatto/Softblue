
public class Modulo4Fracao {
	int numerador;
	int denominador;
	
	void criaFracao(int numerador,int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
		System.out.println("Fracao criada: " + this.numerador + "/" + this.denominador);
	}
	
	void multiplicaFracao(int numerador,int denominador){
		this.numerador *= numerador;
		this.denominador *= denominador;
		System.out.println("Resultado: " + this.numerador + "/" + this.denominador);		
	}
	
}

