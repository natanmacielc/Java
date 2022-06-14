import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// criação de datas com a nova classe LocalDate e
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
		System.out.println("Mes: " + localDate.getMonthValue());
		System.out.println("Mes: " + localDate.getMonth().name());
		System.out.println("Ano: " + localDate.getYear());

		// comparação entre diferentes instantes de tempo
		Instant iInicial = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant iFinal = Instant.now();

		Duration duracao = Duration.between(iInicial, iFinal);
		System.out.println("Duração em nanos segundos: " + duracao.toNanos());
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		System.out.println("Duração em horas: " + duracao.toHours());
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		System.out.println("Duração em dias: " + duracao.toDays());

		// comparação de datas (antes, depois, período entre duas datas)
		LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
		LocalDate localDateNovo = LocalDate.of(2015, 3, 5);

		System.out.println(localDateAntigo.isAfter(localDateNovo));
		System.out.println(localDateAntigo.isBefore(localDateNovo));
		System.out.println(localDateAntigo.isEqual(localDateNovo));

		Period periodo = Period.between(localDateAntigo, localDateNovo);
		System.out
				.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
		System.out.println("Apenas meses: " + periodo.toTotalMonths());

		// operações em datas como adição e subtração de dias, meses e anos
		LocalDate dataManipulacao = LocalDate.now();
		System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
		System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
		System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
		System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
		System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
		System.out.println("Menos 1 mês: " + dataManipulacao.minusMonths(1));
		System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));

		// classe LocalDate é imutável
		System.out.println("Data Original: " + dataManipulacao);

		// comparação de datas utilizando o fuso horário
		LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);

		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);

		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		System.out.println("Diferença de fuso horário: " + diferencaDeHoras.getSeconds() / 60 / 60);

		// formatação de datas com a nova API
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Data com /: " + hoje.format(formatadorBarra));
		System.out.println("Data com -: " + hoje.format(formatadorTraco));

		// métodos interessantes
		LocalDate data = LocalDate.now();

		System.out.println("Ano bissexto: " + data.isLeapYear());
		System.out.println("Número de dias do mês: " + data.lengthOfMonth());
		System.out.println("Número de dias do ano: " + data.lengthOfYear());
		System.out.println("Menor data: " + LocalDate.MIN);
		System.out.println("Maior data: " + LocalDate.MAX);

	}

}