
public class Exercicio2 {
	String s;
	String s1;

	public String processar(String s){
		this.s = s;
		if (s ==null){
			return null;
		}else if (s.length() <=3){
			s1 = s.toUpperCase();
		}
		else{
			s1 = s.substring(0, 3);
			s = s.substring(3);
			StringBuilder sb = new StringBuilder(s1);
			sb.reverse();
			sb.append(s);
			s1 = sb.toString();
			s1 = s1.toUpperCase();
		}
		return s1;
		
	}
	
	public static void main(String[] args) {
		
		Exercicio2 string = new Exercicio2();
		String s1 = string.processar("abc");
		System.out.println(s1);
		Exercicio2 string1 = new Exercicio2();
		String s2 = string1.processar("abcdefg");
		System.out.println(s2);
		Exercicio2 string2 = new Exercicio2();
		String s3 = string2.processar(null);
		System.out.println(s3);	
	
		
		
		
		
		
	

	

	}

}