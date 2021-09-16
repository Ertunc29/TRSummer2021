package day38_exception;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// kullanicidan iki tamsayi alin ve bolumlerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolunecek tamsayiyi yazin");
		int sayi1=scan.nextInt();
		System.out.println("Lutfen kaca bolmek istediginiz sayiyi yazin");
		int sayi2=scan.nextInt();
		// java exception handle etmek icin try-catch blogu olusturmus
		
		try {
		System.out.println("bolme isleminin sonucu :"+ sayi1/sayi2);
		
		
		}catch (ArithmeticException e) {
			System.out.println("sayiyi 0'a bolemezsin");
		}

	}

}
