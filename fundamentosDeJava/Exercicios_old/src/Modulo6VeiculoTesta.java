
public class Modulo6VeiculoTesta {

	public static void main(String[] args) {
		
		Modulo6Veiculo automovel = new Modulo6Automovel();

		automovel.ligar();
		System.out.println(automovel.isLigado());
		automovel.desligar();
		System.out.println(automovel.isLigado());
		System.out.println(" ");
		
		Modulo6Veiculo motocicleta = new Modulo6Motocicleta();
		
		motocicleta.ligar();
		System.out.println(motocicleta.isLigado());
		motocicleta.desligar();
		System.out.println(motocicleta.isLigado());
		System.out.println(" ");
		
		Modulo6Veiculo onibus = new Modulo6Onibus();
		onibus.ligar();
		System.out.println(onibus.isLigado());
		onibus.desligar();
		System.out.println(onibus.isLigado());
		System.out.println(" ");
		
		
		

	}

}