package day30_dateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		 
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2021, 8, 11);
		
		/* 
		 
		 * yy: yilin son iki rakami
		 * yyyy:yilin tamamini
		 * y:yilin tamamini
		 * M:ay sirasini verir-7
		 * MM: ay sirasini verir-07
		 * MMM: ay isminin tamamini verir
		 */
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd//M/yy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd//MM/yy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd//MMM/yy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yy");
		
		System.out.println(dtf.format(date));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(bugun));
		System.out.println(dtf3.format(date));
		
		// kas yasindasin
		
		LocalDate dt=LocalDate.of(2005, 03, 05);
		System.out.println("bugunun tarihi :"+ bugun);
		System.out.println("faruk dt :"+ dt);
		Period yasim=Period.between(dt, bugun);
		System.out.println("faruk yas: "+ yasim);
		System.out.println(yasim.getYears());

	}

}
