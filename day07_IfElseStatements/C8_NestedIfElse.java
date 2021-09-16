package day07_IfElseStatements;

import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				// kullanicidan cinsiyet ve yas aliniz
				// eger calisan kadina 60 yasinadan buyukse emekli olabilir
				// calisan erkekse 65 yasindan buyukse emekli olabilir
				// emekli olamayacaksa emekli olamazsin yazdirin...yil calisman yazdirin
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Lutfen cinsiyetinizi giriniz\nErkek icin E, Kadin icin K giriniz");
				
				char cinsiyet=scan.next().toUpperCase().charAt(0);
				
				System.out.println("Lutfen yasinizi tamsayi olarak giriniz");
				
				int yas=scan.nextInt();
				
				if(cinsiyet=='K') { //kadinsa
					
					if(yas>60) {
						System.err.println("Emekli olabilirsin"); 
				} else { 
					System.out.println("Emekli olamazsin \nDaha "+ (60-yas) + "yil calismalisin") ;
					}
					
				} else if(cinsiyet=='E') {//erkekse
					if(yas>65) {
						System.out.println("Emekli olabilirsin");
					}else {
						System.out.println("Emekli olaamzsin \nDaha " + (65-yas) + "yil daha calismalisin");
					}
					
				} else {// yanlis giris
					
					System.out.println("Erkek icin E, Kadin icin K giriniz");
				
				

			}

		


	}

}
