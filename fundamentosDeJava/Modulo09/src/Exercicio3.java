
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Exercicio3 {

	public static void main(String[] args) {
		String nascimento = "19/05/1955 22:00";
		LocalDateTime d1 = LocalDateTime.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		LocalDateTime d2 = LocalDateTime.now();
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Meses: " + p.toTotalMonths());
		Duration d = Duration.between(d1, d2); 		
		System.out.println("Dias: " + d.toHours());
	}

}