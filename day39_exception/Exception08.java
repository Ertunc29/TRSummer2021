package day39_exception;

import java.util.Scanner;

public class Exception08 {

	public static void main(String[] args) {
		/*
		   Kullanicidan carpma yapmak icin bir String isteyin.
		   Kullancinin girdigi String sadece sayilardan olusuyorsa 
		   sayiyi 2 ile carpip sonucunu yazdirin
		   kullanici sayilardan olsumayan bir String girdiyse
		   "Girdiginiz String sayiya cevrilemez" yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String str=scan.next();
		
		try {
			System.out.println(2*Integer.parseInt(str));
		}catch (NumberFormatException e) {
			System.out.println("girdiginiz String sayiya cevrilemez");
		}
		

	}

}
