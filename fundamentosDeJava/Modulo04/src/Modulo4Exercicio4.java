
public class Modulo4Exercicio4 {

	public static void main(String[] args) {
		
		Modulo4Turma turma = new Modulo4Turma();
			
		Modulo4Aluno aluno1 = new Modulo4Aluno();
		Modulo4Aluno aluno2 = new Modulo4Aluno();
		Modulo4Aluno aluno3 = new Modulo4Aluno();
		
		turma.aluno1 = aluno1;
		turma.aluno2 = aluno2;
		turma.aluno3 = aluno3;
		
		Modulo4Prova aluno1Prova1 = new Modulo4Prova();
		aluno1Prova1.notaParte1 = 4.0;
		aluno1Prova1.notaParte2 = 2.5;
		aluno1.prova1 = aluno1Prova1;
		
		Modulo4Prova aluno1Prova2 = new Modulo4Prova();
		aluno1Prova2.notaParte1 = 1.0;
		aluno1Prova2.notaParte2 = 7.0;
		aluno1.prova2 = aluno1Prova2;
		
		Modulo4Prova aluno2Prova1 = new Modulo4Prova();
		aluno2Prova1.notaParte1 = 6.5;
		aluno2Prova1.notaParte2 = 3.5;
		aluno2.prova1 = aluno2Prova1;
		
		Modulo4Prova aluno2Prova2 = new Modulo4Prova();
		aluno2Prova2.notaParte1 = 0.0;
		aluno2Prova2.notaParte2 = 3.0;
		aluno2.prova2 = aluno2Prova2;
		
		Modulo4Prova aluno3Prova1 = new Modulo4Prova();
		aluno3Prova1.notaParte1 = 5.0;
		aluno3Prova1.notaParte2 = 4.0;
		aluno3.prova1 = aluno3Prova1;
		
		Modulo4Prova aluno3Prova2 = new Modulo4Prova();
		aluno3Prova2.notaParte1 = 6.0;
		aluno3Prova2.notaParte2 = 1.5;
		aluno3.prova2 = aluno3Prova2;
		
		System.out.println("M�dia Aluno1: " + turma.aluno1.calculaMedia());
		System.out.println("M�dia Aluno2: " + turma.aluno2.calculaMedia());
		System.out.println("M�dia Aluno3: " + turma.aluno3.calculaMedia());
		
		System.out.println("M�dia Turma:" + turma.calcularMedia());
		
		
		
		
		

		
	
			

	}

}
