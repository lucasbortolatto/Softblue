
public abstract class ContaBancaria {
	protected double saldo;
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor){
		saldo = saldo - valor;
	}
	
	public void transferir(double valor, ContaBancaria contaBancaria){
		sacar(valor);
		contaBancaria.depositar(valor);
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	abstract public double calcularSaldo();

	
}
