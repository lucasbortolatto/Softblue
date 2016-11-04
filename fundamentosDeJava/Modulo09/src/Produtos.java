import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produtos {
	
	private static final DateFormat df = DateFormat.getDateInstance();
	
	private String nome;
	private double peso;
	private Date dataValidade;
	
	public Produtos(String nome, double peso, int dia, int mes, int ano){
		this.nome = nome;
		this.peso = peso;
		
		Calendar c = Calendar.getInstance();
		c.set(ano, mes - 1, dia);
		
		this.dataValidade = c.getTime();
	}
	
	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getDataValidade() {
		return dataValidade;
	}
	
	public String getFormattedDataValidate() {
		return df.format(dataValidade);
	}

	
	

}
