package day38_exception;

import java.util.Scanner;


public class Exception02 {

	public static void main(String[] args) {
	// kullanicidan iki tamsayi alin ve bolumlerini yazdirin
		int count=1;
		Scanner scan=new Scanner(System.in);
		
		while(count<=100) {
		System.out.println("Lutfen bolunecek tamsayiyi yazin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kaca bolmek istediginiz sayiyi yazin");
		int sayi2=scan.nextInt();
		// javaya exception handle etmek icin bir cozum uretmezsek
		// java exception ile karsilastiginda calismayi durdurur buna (stops execution)
		// throws execution (exception firlatir) problemin kaynagini bize gosterir
		// tum aplication durmus olur
		// musterinin kullandigi bir uygulama icin bu kabul edilemez
		// bunun icin kod yazan kisi muhtemel sorunlari ongormeli ve 
		// javaya bu sorunu handle etmesi icin yol gostermelidir
		
		System.out.println("islem no :"+ count);
		try {
		System.out.println("bolme isleminin sonucu :"+ sayi1/sayi2);
		}catch(ArithmeticException e) {
			System.out.println("sayiyi 0'a bolemezsin");
		}
		count++;
		
		}

	}

}
