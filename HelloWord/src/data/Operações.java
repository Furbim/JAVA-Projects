package data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Operações {

	public static void main(String[] args) {
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-12-28");
		LocalDateTime d05 = LocalDateTime.parse("2023-12-28T01:30:26");
		LocalDate d07 = LocalDate.parse("28/12/2023",fm1);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm").withZone(ZoneId.systemDefault());
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d07);
		System.out.println(d05);
		System.out.println(d07.format(fmt1));
		System.out.println(d05.format(fm2));
		System.out.println(fmt2.format(d03));
	}

}
