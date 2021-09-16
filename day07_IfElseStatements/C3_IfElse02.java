package day07_IfElseStatements;

import java.util.Scanner;

public class C3_IfElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan bir karakter isteyin ve harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kararkter giriniz");
		
		char karakter= scan.next().charAt(0);
		
		if (karakter>='A' && karakter<='Z' || karakter>='a' && karakter<='z') {
		
			System.out.println("Girilen karakter harf");
			
		} else { 
			
			System.out.println("Girilen karakater harf degil");

		} scan.close();
		
		
		
	}
	
	        

}
