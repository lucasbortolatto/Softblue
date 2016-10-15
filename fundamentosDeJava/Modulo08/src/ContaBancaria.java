
public class ContaBancaria {
	private double saldo;
	private String operacao;
	
	public void sacar(double valor) throws SaldoInsuficienteException,ValorInvalidoException{
		if (valor <= 0){
			this.operacao = "saque";
			throw new ValorInvalidoException(valor, operacao);
		} if (valor > saldo){
			this.operacao = "saque";
			throw new SaldoInsuficienteException(valor, saldo, operacao);
		}
		saldo -= valor;		
	}
	
	public void depositar(double valor) throws ValorInvalidoException{
		if (valor <= 0){
			this.operacao = "deposito";
			throw new ValorInvalidoException(valor, operacao);
		}
		saldo += valor;
	}
	
	public void transferir(double valor, ContaBancaria conta) throws SaldoInsuficienteException,ValorInvalidoException{
		if (valor > saldo){
			this.operacao = "transferencia";
			throw new SaldoInsuficienteException(valor,saldo,operacao);
		}
		if (valor <= 0){
			this.operacao = "transferencia";
			throw new ValorInvalidoException(valor,operacao);
		}
		saldo -= valor;
		conta.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

}
