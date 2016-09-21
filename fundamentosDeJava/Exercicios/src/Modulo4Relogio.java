
public class Modulo4Relogio {
	Modulo4Ponteiro ponteiroHora = new Modulo4Ponteiro();
	Modulo4Ponteiro ponteiroMinuto =  new Modulo4Ponteiro();
	Modulo4Ponteiro ponteiroSegundo =  new Modulo4Ponteiro();
	
	void acertarRelogio(int ponteiroHora, int ponteiroMinuto, int ponteiroSegundo){
		this.ponteiroHora.posicao = ponteiroHora;
		this.ponteiroMinuto.posicao = ponteiroMinuto / 5;
		this.ponteiroSegundo.posicao = ponteiroSegundo / 5;
	}
	
	int lerHora(){
		return this.ponteiroHora.posicao;
	}
	
	int lerMinuto(){
		return this.ponteiroMinuto.posicao * 5;
		
	}
	
	int lerSegundo(){
		return this.ponteiroSegundo.posicao * 5;
		
	}
	


}
