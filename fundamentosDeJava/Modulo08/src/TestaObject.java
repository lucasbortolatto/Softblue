
public class TestaObject {

	public static void main(String[] args) throws Exception {
		Object o = null;
		try{
			o.toString();
		}catch (Exception e){
			System.out.println("Erro de null pointer mano. O Objeto e " + e.getMessage());
		}
		
		System.out.println("Aplicação finalizada");

	}

}
