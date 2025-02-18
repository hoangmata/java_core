package edu.fa;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalXXX {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		DateTimeFormatter dtf_1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(ld.format(dtf_1));
		
		DateTimeFormatter dtf_2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(ld.format(dtf_2));
		
		String strDate1 = "12-02-1999";
		System.out.println(LocalDate.parse(strDate1, dtf_1));
		
		String strDate2 = "21-02-1999";
		System.out.println(LocalDate.parse(strDate2, dtf_1));
		
		System.out.println(ld.getMonth().getValue());
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		Period period = Period.ofDays(4);
		System.out.println(ld.plus(period));
		
		period = Period.of(3, 2, 1);
		System.out.println(ld.minus(period));
		
		Duration duration = Duration.ofHours(0);
		System.out.println(ld.minus(duration));
		
		ZoneId zone = ZoneId.of("Asia/Bangkok");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zone);
		System.out.println(zdt);
		
		String newTimeZone = "2025-02-18T10:24:01.488925421+07:00[Asia/Bangkok]";
		System.out.println(ZonedDateTime.parse(newTimeZone));
	}
}
