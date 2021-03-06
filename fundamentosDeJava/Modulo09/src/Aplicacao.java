import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		Produtos p1 = new Produtos("Feijao", 2.5, 4, 10, 2020);
		Produtos p2 = new Produtos("Cafe", 1, 1, 1, 2022);
		Produtos p3 = new Produtos("Beterraba", 0.9, 12, 11, 2017);
		
		Locale l = new Locale("pt", "BR");
		
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p1.getNome(),p1.getPeso(), p1.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p2.getNome(),p2.getPeso(), p2.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p3.getNome(),p3.getPeso(), p3.getFormattedDataValidate()));
	}	

}
