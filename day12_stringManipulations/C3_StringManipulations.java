package day12_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* kullanicidan bir sifre girmesini isteyin. 
		  asagidaki sartlari sagliyorsa  "Sifre basari ile tanimlamdi"
		  sartlari saglamiyorsa "Islem basarisiz, lutfen yeni sifre girin" yazdirin
		  -ilk harf buyuk harf olmali
		  -son harf kucuk harf olmali
		  -sifre bosluk icermemeli
		  -sifre uzunlugu en az 8 karakter olmali
		  
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		String sifre=scan.nextLine();
		
		boolean ilkHarfKontrol=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean sonHarfKontrol=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
		boolean spaceKontrol=!sifre.contains(" ");
		//basa ! koyduk cunku bosluk yoksa sonuc true olur
		boolean uzunlukKontrol=sifre.length()>=8;
		
		if(ilkHarfKontrol && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
			System.out.println("Sifreniz basari ile tamamlandi");
			
		}else {
			System.out.println("Lutfen gecerli bir sifre giriniz");
			
		}
		
		
		

	}

}
