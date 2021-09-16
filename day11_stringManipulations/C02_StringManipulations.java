package day11_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz");
		String mail=scan.nextLine();
		
		if(mail.contains("@gmail.com")) {
			System.out.println("E mail adresiniz kaydedildi");
			
		}else {
			System.out.println("Lutfen gmail mail adresinizi giriniz"); //odev indexof ile yap. gmail.gmail sorununu
		}

	}

}
