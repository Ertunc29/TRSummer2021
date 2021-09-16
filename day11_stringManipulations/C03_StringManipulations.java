package day11_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * kullanicidan bir cumle isteyin. cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf ile,
		 * kucuk kelimesi iceriyorsa kucuk harf ile yazdirin. iki kelimeyi de icermiyorsa,
		 * cumle kucuk yada buyuk harf icermiyor yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		if(cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
			
		}else if(cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
			
		}else {
			System.out.println("Cumle kucuk yada buyk kelimesi icermiyor");
		}
		

	}

}
