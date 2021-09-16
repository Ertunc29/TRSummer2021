package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_IfStatements04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen kenar uzunluklarindan birini tamsayi olarak giriniz");
		
		int kenar1=scan.nextInt();
		
		System.out.println("lutfen kenar uzunluklarindan birini tamsayi olarak giriniz");
		
		int kenar2=scan.nextInt();
		
		if(kenar1==kenar2) {
			System.out.println("Girdiginiz dikdortgen bir karedir");
			
		} if (kenar1!=kenar2) {
			System.out.println("Girdiginiz dikdortgen bir kare degil");
		}
		
	

	}

}
