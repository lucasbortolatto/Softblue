
public class Modulo3Exercicio7 {

	public static void main(String[] args) {
		double nota = 0.0;
		int cont = 0;
		double media = 0.0;
		double somaNotas = 0.0;
		while(nota != -1){
			System.out.println("Digite a nota: ");
			nota = Console.readDouble();
			if(nota == -1){
				break;
			}else if(nota <0 || nota >10){
				System.out.println("Nota Invalida. Digite outra");
				continue;
			}
			somaNotas += nota;
			cont += 1;
		}
		media = somaNotas / cont;
		System.out.println("Media: " + media);
		
	}

}
