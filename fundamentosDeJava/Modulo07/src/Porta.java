
public class Porta implements Cloneable {
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura){
		this.altura = altura;
		System.out.println("Altura setada com sucesso para " + altura);
		this.largura = largura;
		System.out.println("Largura setada com sucesso para " + largura);
		
		this.aberta = false;
		System.out.println("Porta fechada");
	}
	
	public void abrir(){
		aberta = true;
		System.out.println("A porta foi aberta");
		
	}
	
	public void fechar(){
		aberta = false;
		
	}

	public double getAltura() {
		return altura;
	}


	public double getLargura() {
		return largura;
	}


	public boolean isAberta() {
		return aberta;
	}
	
	@Override
	public Object clone(){
		Porta porta = new Porta(this.altura,this.largura);
		System.out.println("Esta e uma copia da porta...");
		return porta;
		
	}

}
