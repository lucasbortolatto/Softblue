
public class Modulo4Prova {
	
	double notaParte1 = 1.0;
	double notaParte2 = 1.0;
	double prova = 1.0;
	
	double calculaNotaTotal(){
		prova= notaParte1 + notaParte2;
		if (prova > 10){
			prova = 10;
		}
		return prova;
		
	}

}
