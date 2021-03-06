
public class TestaConta {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		try {
			conta1.depositar(500);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		} 
		try {
			conta1.sacar(500);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		System.out.println("Saldo atual conta1: " + conta1.getSaldo());
		
		ContaBancaria conta2 = new ContaBancaria();
		try {
			conta2.depositar(1000);
		} catch (ValorInvalidoException e1) {
			e1.printStackTrace();
		}
		try {
			conta2.sacar(500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		} catch (ValorInvalidoException e){
			e.printStackTrace();
		}
		System.out.println("Saldo atual conta2: " + conta2.getSaldo());
		
		try {
			conta2.transferir(500, conta1);
		} catch (SaldoInsuficienteException e){
			e.printStackTrace();
		} catch (ValorInvalidoException e){
			e.printStackTrace();
		}
		
		System.out.println("Saldo atual conta1: " + conta1.getSaldo());
		System.out.println("Saldo atual conta2: " + conta2.getSaldo());
		

	}

}
