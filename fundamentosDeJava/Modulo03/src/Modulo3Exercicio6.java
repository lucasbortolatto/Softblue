
public class Modulo3Exercicio6 {

	public static void main(String[] args) {
		int dia = 31;
		int mes = 1;
		int ano = 2016;
		
		if (dia < 1 || dia > 31){
			System.out.println("Dia " + dia + " invalido");
		}else if (mes < 1 || mes > 12){
			System.out.println("Mes " +mes + " invalido");
		}else if (mes == 2 && dia >=29){
			System.out.println("Dia " + dia + " invalido para o mes " + 2);			
		}else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 31){
			System.out.println("Nao existe dia " + dia + " no mes " + mes);
		}else{
			System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		}
			
	}

}
