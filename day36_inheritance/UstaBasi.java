package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{
	
	public String bolum="takimhane";
	public int sorOldIsciSay=20;

	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
		//Isci ub2=new Isci();
		List<String> list=new ArrayList<>();
		Object str =new String("Hasan");
		
		Isci ub2=new UstaBasi();
		
		// extends ile birbirine bagli olan clss'larda Is-A relation olan 
		// Data turleri istege bagli olarak kullanilabilir
		// Daha genis Data turu yazmanin avantaji kapsamin daha genis olmasi
		// Data turu olarak sectigimiz class ve parents'larina ait datalara ulasabiliriz
		System.out.println(ub2.departman); // isci class'indan
		System.out.println(ub2.izindeMi); // personel class'indan
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id); // Personel 
		
	}

}
