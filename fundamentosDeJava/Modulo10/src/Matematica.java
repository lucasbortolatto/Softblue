
public class Matematica {
	
	public enum TipoAngulo{
		GRAUS,
		RADIANOS;
}
	
	public static Double converterAngulo(Double angulo, TipoAngulo tipo){
		if (tipo == TipoAngulo.GRAUS){
			System.out.println("Convers�o de " + TipoAngulo.GRAUS + " em " + TipoAngulo.RADIANOS + ":");
			angulo = Math.toRadians(angulo);
		}else{
			System.out.println("Convers�o de " + TipoAngulo.RADIANOS + " em " + TipoAngulo.GRAUS + ":");
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
		return Integer.valueOf(numBinario, 2);
		
	}
	

}