
public class Modulo6Onibus extends Modulo6Veiculo {
	
	@Override
	public void ligar(){
		super.ligar();
		System.out.println("Onibus ligado");
	}
	
	@Override
	public void desligar(){
		super.desligar();
		System.out.println("Onibus desligado");
	}
	
	@Override
	public boolean isLigado(){
		return super.isLigado();
	}

}