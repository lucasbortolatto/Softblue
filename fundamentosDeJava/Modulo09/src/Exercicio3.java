
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Exercicio3 {
	
	public static void periodoSinceJamesGoslingBirthday(){
		LocalDate nascimento = LocalDate.parse("1955-05-19");
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(nascimento, hoje);
		System.out.println("Anos: " + periodo.getYears());
		System.out.println("Meses: " + periodo.getMonths()); 		
		System.out.println("Dias: " + periodo.getDays());
	}
	
	public static void durationSince3Am(){
		
		String data = ("11/11/2016 03:00");
		LocalTime horaAnterior = LocalTime.parse("03:00");
		LocalTime agora = LocalTime.now();
		Duration d = Duration.between(horaAnterior, agora);
		System.out.println("Segundos: " + d.getSeconds());
		
	}
	

	public static void main(String[] args) {
		periodoSinceJamesGoslingBirthday();
		durationSince3Am();
		
	}

}
