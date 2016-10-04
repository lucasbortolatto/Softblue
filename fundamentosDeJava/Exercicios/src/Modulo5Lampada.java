
public class Modulo5Lampada {
	
	private boolean ligada = true;
	
	public Modulo5Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public void imprimir() {
		if (ligada == true){
			System.out.println("Lampada ligada");
		}else{
			System.out.println("Lampada Desligada");
		}	
	}

	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar(){
		this.ligada = false;
	}
	
}
