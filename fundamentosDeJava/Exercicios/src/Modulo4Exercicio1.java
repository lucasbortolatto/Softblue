	
public class Modulo4Exercicio1 {

	public static void main(String[] args) {
		Modulo4Relogio relogio1 = new Modulo4Relogio();
		
		relogio1.acertarRelogio(12, 23, 55);
		System.out.println("Posi��o da hora: " + relogio1.ponteiroHora.posicao);
		System.out.println("Posi��o do minuto: " + relogio1.ponteiroMinuto.posicao);
		System.out.println("Posi��o do segundo: " + relogio1.ponteiroSegundo.posicao);
		
		int hora = relogio1.lerHora();
		int minuto = relogio1.lerMinuto();
		int segundo = relogio1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		
		
	}

}
