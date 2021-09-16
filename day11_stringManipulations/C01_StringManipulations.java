package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan bir cumle ve bir kelime alin
		// cumlede kelimenin kullanilip kullanilmadigini yazdirin
		//sadece icerigin olup olmadigini kontrol eder. kaz kez kullanildigini kontrol etmez
		//parametre sadece String olmalidir. Char kullanilmaz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.next().toLowerCase();
		
		
		if (cumle.indexOf(kelime)!=-1) {
			System.out.println("kelime cumlede kullanilmis");
			
		}else {
			System.out.println("kelime cumlede kullanilmamis");
		}
			
		//contains kullanalim
		// contains methodunda karsilastirma operatorleri kullanmaya gerek yok. cunku contains boolean sonuc doner
		
		if(cumle.contains(kelime)) {
			System.out.println("kelime cumlede kullanilmis");
			
		}else {
			System.out.println("kelime cumlede kullanilmamis");
		}

	}

}
