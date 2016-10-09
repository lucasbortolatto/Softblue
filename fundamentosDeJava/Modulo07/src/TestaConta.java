
public class TestaConta {

	public static void main(String[] args) {
		
		ContaBancaria corrente = new ContaCorrente();
		corrente.depositar(1000);
		corrente.sacar(200);
		double saldo = corrente.calcularSaldo();
		System.out.println("Saldo Atual Conta 1: " + saldo);
		
		ContaBancaria investimento = new ContaInvestimento();
		investimento.depositar(500);
		investimento.sacar(50);
		saldo = investimento.calcularSaldo();
		System.out.println("Saldo Atual Conta 2: " + saldo);
		
		corrente.transferir(500, investimento);
		saldo = corrente.calcularSaldo();
		System.out.println("Saldo Atual Conta 1: " + saldo);
		saldo = investimento.calcularSaldo();
		System.out.println("Saldo Atual Conta 2: " + saldo);
		
		
		
		
		

	}

}
