package day30_dateTime;

import java.time.LocalDate;

public class C01_DateTime01 {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now(); // tarih isminde obje olusturduk
		System.out.println("bugunun tarihi :"+ tarih);
		
	   System.out.println("bugunden 21 gun sonrasi :"+tarih.plusDays(21)); //2021-09-01
	   
	   System.out.println("bugunden itibaren 3 yil sonrasi :"+ tarih.plusYears(3)); //2024-08-11
	   
	   System.out.println("bugunden 2 yil 5 ay 3 gun sonrasi :"+ tarih.plusYears(2).plusMonths(5).plusDays(3)); // 2024-08-11
	   
	   System.out.println("bugunden 40 gun oncesi :"+ tarih.minusDays(40)); //2021-07-02
	   
	   System.out.println("bugunun 5 yil oncesi 2 ay sonrasi 3 hafta sonrasi :"+ tarih.minusYears(5).plusMonths(5).plusWeeks(3));//2017-02-01
	   
	   System.out.println(tarih.getDayOfMonth());
	   System.out.println(tarih.getDayOfWeek());
	   System.out.println(tarih.getDayOfYear());
	   System.out.println(tarih.getMonthValue());
	   System.out.println(tarih.getMonth());
	   
	   LocalDate dgmGunu=LocalDate.of(1990, 9, 1);
	   
	   System.out.println("dogum tarihi :"+ dgmGunu);
	   System.out.println("dogum gunu :"+ dgmGunu.getDayOfWeek());
	   System.out.println(tarih.isAfter(dgmGunu)); // true
	   System.out.println(dgmGunu.isBefore(tarih)); // true
	   
	   System.out.println("bugun artik yil mi :"+ tarih.isLeapYear()); // false
	
		
		}

}
