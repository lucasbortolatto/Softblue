public class AplicacaoMatematica {

	public static void main(String[] args) {
		
		Matematica m1 = new Matematica();
		double angulo =  m1.converterAngulo(2.5, TipoAngulo.RADIANOS);
		System.out.println("Valor convertido: " + angulo);
		int soma = Matematica.somar(2, 4, 6);
		System.out.println("Resultado da soma: " + soma);
		int conversao = Matematica.converterBinarioParaDecimal("0111");
		System.out.println("Resultado da convers�o: " + conversao);
		

	}

}
