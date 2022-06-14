import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2019 12:58:23");
		Date now = new Date();
		Date now1 = new Date(System.currentTimeMillis());
		Date x1 = new Date(0L);
		Date x2 = new Date(1000L * 60L * 60L * 5L);
		Date x3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		
		System.out.println(y1);
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(now));
		System.out.println(sdf2.format(now1));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf3.format(x3));

		
		scanner.close();

	}
}