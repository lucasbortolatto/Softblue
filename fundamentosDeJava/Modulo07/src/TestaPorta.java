
public class TestaPorta {

	public static void main(String[] args) throws CloneNotSupportedException {
		Porta porta1 = new Porta(1.75,0.5);
		porta1.abrir();
		
		Porta porta2 = (Porta) porta1.clone();
		
		

	}

}
