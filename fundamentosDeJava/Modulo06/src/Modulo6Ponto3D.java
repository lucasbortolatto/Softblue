
public class Modulo6Ponto3D extends Modulo6Ponto2D {

	//private double x;
	//private double y;
	private double z;
	
	public Modulo6Ponto3D(double x, double y, double z) {
		super(x, y);
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString(){
		
		return super.toString()+ ", y="+z;
	}
	
	
	
	
	
	
	

}
