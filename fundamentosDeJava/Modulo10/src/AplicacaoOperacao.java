
public class AplicacaoOperacao {

	public static void main(String[] args) {
		double soma = Operacao.SOMA.calcular(2, 4);
		System.out.println("Resultado: " + soma);
		double subtracao = Operacao.SUBTRACAO.calcular(2, 4);
		System.out.println("Resultado: " + subtracao);
		double multiplicacao = Operacao.MULTIPLICACAO.calcular(2, 4);
		System.out.println("Resultado: " + multiplicacao);
		double divisao = Operacao.DIVISAO.calcular(2, 4);
		System.out.println("Resultado: " + divisao);
	}

}
