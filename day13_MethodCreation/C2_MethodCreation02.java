package day13_MethodCreation;

import java.util.Scanner;

public class C2_MethodCreation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan iki tam sayi isteyin
		// bu sayilarin toplamlarini ve carpimlarini iki ayri method da hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		// method olsuturmanin kolay yolu 
		// method ismini ve parametreleri yazin (method call)
		
		toplama(sayi1,sayi2); // 30
		
		carpma(sayi1,sayi2); // 200
		carpma(sayi1+3,sayi2*2); // 520
		
		sayi1=15;
		sayi2=10;
		
		toplama(sayi1,sayi2); // 25
		carpma(sayi1,sayi2); // 150
		
		sayi2=40;
		toplama(sayi1-2,sayi2/5); // 21 
		carpma(sayi1,sayi2/8); // 75
		
		//sonuc olarak uygulamamizda tekrar tekrar kullanmamiz gereken kod bloklari icin
		// her seferinde yeniden yazmak yerine, bu blogu bir method da yazip 
		// ihtiyacimiz oldugu her seferde cagirmak daha mantiklidir 

	}
	
	// bir method sadece consol da birseyler yazdiracaksa return type olarak void yazilir
	// bu durumda return keyword una ihtiyac olmaz
	// ve Method bize bir sonuc dondurmez

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("girilen sayilarin carpimi :"+ (sayi1*sayi2));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("girilen sayilarin toplami :"+ (sayi1+sayi2));
		
	}

}
