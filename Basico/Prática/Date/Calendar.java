import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date date = Date.from(Instant.parse("2018-06-15T15:42:07Z"));

		System.out.println(sdf1.format(date));

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		int minutes = cal.get(Calendar.MINUTE);
		date = cal.getTime();

		System.out.println(sdf1.format(date));
		System.out.println(minutes);

	}
}