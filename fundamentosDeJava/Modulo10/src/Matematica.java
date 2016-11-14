
public class Matematica {
	Double angulo;
	TipoAngulo tipo;
	
	public Double converterAngulo(Double angulo, TipoAngulo tipo){
		this.angulo = angulo;
		this.tipo = tipo;
		if (tipo == tipo.GRAUS){
			System.out.println("Convers�o de " + tipo.GRAUS + " em " + tipo.RADIANOS + ":");
			angulo = Math.toRadians(angulo);
		}else{
			System.out.println("Convers�o de " + tipo.RADIANOS + " em " + tipo.GRAUS + ":");
			angulo = Math.toDegrees(angulo);
		}		
		return angulo;
		
	}
	
	public static Integer somar(Integer n1, Integer n2, Integer n3){
		System.out.println("Soma de n�meros inteiros:");
		return n1 + n2 + n2;
	}
	
	public static Integer converterBinarioParaDecimal(String numBinario){
		System.out.println("Convers�o do n�mero bin�rio " + numBinario + " para decimal:");
		return Integer.parseInt(numBinario, 2);
		
	}
	

}
