
public class Modulo3Exercicio5_2 {

	public static void main(String[] args) {
		int x = 10;
		while (x <=1000){
			
			switch (x % 2){
			case 0:
				x +=5;
				break;
			case 1:
				x *= 2;
			}
			System.out.print(x + " ");
			
		}
			
	}

}