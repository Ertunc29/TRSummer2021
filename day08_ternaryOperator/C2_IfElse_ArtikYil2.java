package day08_ternaryOperator;

import java.util.Scanner;

public class C2_IfElse_ArtikYil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen artik yil kontrolu icin bir yil giriniz");
		
		int yil=scan.nextInt();
		
		if(yil % 4 !=0) {
			System.out.println("girdiginiz yil artik yil degil");
		} else { 
			
			if (yil %100==0 && yil%400 !=0) {
				System.out.println("girdiginiz yil artik yil");
			}else {
				System.out.println("Girdiginiz yil artik yil");
			}
		} 
			
		// Requirement bizim anayasamiz
				
	}

}
