package day09_switchCase;

import java.util.Locale;

public class C4_StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String isim= "Firat";
		String soyisim = "Korkmaz";
		
		System.out.println(isim+" "+soyisim);
		
		System.out.println(isim.concat(" ").concat(soyisim));
		
		System.out.println(isim.charAt(2));
		System.out.println(isim.charAt(4));
		System.out.println(soyisim.charAt(6));// olmayan index yazilirsa java hata verir
		
		String str="FIRAT";
		System.out.println(str.toLowerCase(Locale.JAPAN));
		
		

	}

}
