
public class Porta implements Cloneable {
	private double altura;
	private double largura;
	private boolean aberta;
	
	public void abrir(){
		
	}
	
	public void fechar(){
		
	}
	
	@Override
	public Object clone(){
		Porta porta = new Porta();
		System.out.println("Copiando a porta");
		porta.setAltura(altura);
		porta.setLargura(largura);
		porta.setAberta(aberta);
		return porta;
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		System.out.println("Altura setada com sucesso para " + altura);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
		System.out.println("Largura setada com sucesso para " + largura);
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
		System.out.println("A porta foi aberta");
	}
	
	
	

}
