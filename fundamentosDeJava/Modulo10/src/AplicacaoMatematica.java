public class AplicacaoMatematica {

	public static void main(String[] args) {
		
		double angulo =  Matematica.converterAngulo(2.5, Matematica.TipoAngulo.RADIANOS);
		System.out.println("Valor convertido: " + angulo);
		int soma = Matematica.somar(2, 4, 6);
		System.out.println("Resultado da soma: " + soma);
		int conversao = Matematica.converterBinarioParaDecimal("0111");
		System.out.println("Resultado da convers�o: " + conversao);
		

	}

}