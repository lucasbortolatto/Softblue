
public class ValorInvalidoException extends Exception {
	
	double valor;
	String operacao;

	public ValorInvalidoException(double valor, String operacao) {
		this.valor = valor;
		this.operacao = operacao;
		System.out.println("Erro: valor " + valor + " inv�lido para " + operacao);
		
	}
	

}
