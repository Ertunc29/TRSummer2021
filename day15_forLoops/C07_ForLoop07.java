package day15_forLoops;

import java.util.Scanner;

public class C07_ForLoop07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan bir String isteyin ve String i tersten yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Luyfen 100'den kucuk bir tamsayi giriniz");
		String kelime=scan.nextLine();
		
		for(int i=0; i<kelime.length(); i++) {
			System.out.print(kelime.substring(kelime.length()-1-i, kelime.length()-i));
		}
		System.out.println("");
		for(int i=kelime.length()-1; i>=0; i--) {
			System.out.print(kelime.substring(i,i+1));
		}

	}

}
