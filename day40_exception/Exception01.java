package day40_exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// kullanicidan yasini girmesini isteyin
		// Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception  verecek
		// sekilde yazdirin
		
		/*	Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		
		if(yas>=0) {
			System.out.println("girdiginiz yas :"+ yas);
			
		}else {
			
			throw new IllegalArgumentException();
		}
		
		// bu sekilde yazdigimizda java exception throw eder ama kodumuz da bloke olmus olur
		// bloke olmasini engellemek icinde try -catch blogunu kullanabiliriz
     */
		
		// java ya bir exception throw ettirmek icin throw ve new keywor'leri kullanilir
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		try {
		if(yas>=0) {
			System.out.println("girdiginiz yas :"+ yas);
			
		}else {
			
			throw new IllegalArgumentException();
			
		} 
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("kod bloke olmadi");
	}

}
