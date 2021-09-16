package day31_varargsStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C01_LocalDateTimeFormatter {

	public static void main(String[] args) {
		
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt); // 2021-08-12T11:25:59.605
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMM/dd  hh:mm");
		
		System.out.println(dtf.format(ldt)); //21/Aug/12  11:26
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd");
		System.out.println(dtf2.format(ldt));
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm"); // 24 saatlik sisteme gore
		System.out.println(dtf3.format(ldt));
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm"); // pm/am sistemine gore 
		System.out.println(dtf4.format(ldt));
		
		LocalDate dogumTarihi=LocalDate.of(1995, 1, 12);
		LocalDate bugun=LocalDate.now();
		
		Period benimYasim=Period.between(dogumTarihi, bugun);
		System.out.println(benimYasim);
		
		int yas=Period.between(dogumTarihi, bugun).getYears(); // sadece yil olarak yas hesabi icin
		System.out.println(yas);

	}

}
