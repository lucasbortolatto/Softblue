
public class Modulo3Exercicio4 {

	public static void main(String[] args) {
		int elemento1 = 1;
		int elemento2 = 1;
		
		int result = 1;
		System.out.println(elemento1);
		System.out.println(elemento2);
		for (int n = 1; n <= 15; n++){
			result = elemento1 + elemento2;
			elemento1 = elemento2;
			elemento2 = result;
			System.out.println(result);
		}
		//corre��o
		int j = 1;
		for (int i = 0, cont = 0; cont <15; cont++){
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
			
		}
				
	}

}