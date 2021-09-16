package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime zaman=LocalTime.now();
		System.out.println("aktual zaman :"+ zaman);
		
		LocalTime time1=LocalTime.of(12, 35, 23);
		System.out.println(time1);
		
		System.out.println("su zamandan2 saat ileri 34 dakika geri 45 saniye ileri :" + zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		
		for(int i=0;i<10000;i++) {
			
			System.out.print(i);
		}
		
		LocalTime time2=LocalTime.now();
	    System.out.println();
	    System.out.println(time2);
	    
	    // ulke saatleri hesaplama
	    
	    ZonedDateTime Japan=ZonedDateTime.now(ZoneId.of("Japan"));
	    System.out.println(Japan);
	    
	    ZonedDateTime baskaUlke=ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
	    System.out.println(baskaUlke);
	    
}
}
