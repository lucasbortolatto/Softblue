
public class Modulo4Exercicio2 {

	public static void main(String[] args) {
		
		Modulo4Fracao fracao1 = new Modulo4Fracao();
		fracao1.criaFracao(1,5);

		
		Modulo4Fracao fracao2 = new Modulo4Fracao();
		fracao2.criaFracao(1,5);
		
		fracao1.multiplicaFracao(fracao2.numerador, fracao2.denominador);

	}

}
