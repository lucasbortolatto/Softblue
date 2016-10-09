
public class Modulo6Motocicleta extends Modulo6Veiculo {
	
	@Override
	public void ligar(){
		super.ligar();
		System.out.println("Motocicleta ligada");
	}
	
	@Override
	public void desligar(){
		super.desligar();
		System.out.println("Motocicleta desligada");
	}
	
	@Override
	public boolean isLigado(){
		return super.isLigado();
	}
	
	
	
	
	

}
