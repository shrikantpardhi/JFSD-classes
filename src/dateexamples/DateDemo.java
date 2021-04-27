package dateexamples;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	static void locaDate() {
		// java.time
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2021, 04, 29);
		System.out.println(ld + "          " + ld2);
		System.out.println(ld.getMonth());
		System.out.println(ld.compareTo(ld2));
	}
	
	static void localDateTime() {
		LocalDateTime ld = LocalDateTime.now();
		LocalDateTime ld1 = LocalDateTime.now(ZoneId.of("Africa/Nairobi"));
		LocalDateTime ld2 = LocalDateTime.of(2021, 04, 28, 2, 04, 29);
		
		System.out.println(ld + "          " + ld1);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		
		System.out.println("Max :"+LocalDateTime.MAX);
		System.out.println("Min :"+LocalDateTime.MIN);
		
		System.out.println(ld.compareTo(ld2));
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("use of format: "+myFormatObj.format(ld));
	}

	static void localTime() {
		LocalTime ld = LocalTime.now();
		LocalTime ld1 = LocalTime.now(ZoneId.of("Africa/Nairobi"));
		LocalTime ld2 = LocalTime.of(2, 04, 29);
		
		System.out.println(ld + "          " + ld1);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		
		System.out.println("Max :"+LocalTime.MAX);
		System.out.println("Min :"+LocalTime.MIN);
		System.out.println("Noon :"+LocalTime.NOON);
		
		System.out.println(ld.compareTo(ld2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		System.out.println("Milliseconds since Jan. 1, 1970 GMT =" + date.getTime());

		localDateTime();
	}

}
