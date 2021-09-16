package day07_IfElseStatements;

import java.util.Scanner;

public class C11_NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 5'e bolunen 4 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		if (sayi/5==0 && sayi/5==5) {
			
		}else {
			
		}
		
		if (sayi%5==0) {
			System.out.println("5'e bolunen cift sayi");
			
		} else if (sayi%5==5) {
			System.out.println("5'e bolunen tek sayi");
			
		}else {
			System.out.println("Lutfen 5'e bolunen bir sayi giriniz");
		}

	}

}
