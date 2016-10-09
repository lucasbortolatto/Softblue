
public class TestaConta {

	public static void main(String[] args) {
		
		ContaBancaria corrente = new ContaCorrente();
		System.out.println("Saldo Atual: " + corrente.saldo);
		corrente.depositar(500);
		System.out.println("Saldo Atual: " + corrente.saldo);
		ContaBancaria corrente1 = new ContaCorrente();
		System.out.println("Saldo Atual: " + corrente1.saldo);
		corrente.transferir(20, corrente1);
		System.out.println("Saldo Atual: " + corrente.saldo);
		System.out.println("Saldo Atual: " + corrente1.saldo);
		
		System.out.println(corrente.calcularSaldo());
		
		ContaBancaria investimento = new ContaInvestimento();
		System.out.println("Saldo Atual: " + investimento.saldo);
		investimento.depositar(500);
		System.out.println("Saldo Atual: " + investimento.saldo);
		
		System.out.println(investimento.calcularSaldo());
		
		
		
		
		

	}

}
