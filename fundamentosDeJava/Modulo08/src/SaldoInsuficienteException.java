
public class SaldoInsuficienteException extends Exception {
	double valor;
	double saldo;
	String operacao;

	public SaldoInsuficienteException(double valor,double saldo, String operacao) {
		this.valor = valor;
		this.saldo = saldo;
		System.out.println("O saldo � de " + saldo +  ". Saldo insuficiente para " + operacao + " de " + valor);
	}

	public double getValor() {
		return valor;
	}
	
	
	
	
}
