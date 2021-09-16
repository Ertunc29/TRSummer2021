package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan iki pozitif sayi isteyin
				// kullanici negatif sayi girdiginde 
				// girilen negatif sayilari yok sayip, yeniden deger isteyin
				//kullanici dogru giris yaptiginda "well done" ve sayialrin carpimini yazdirin
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen iki pozitif tamsayi giriniz");
				
				
				int sayi1=0;
				int sayi2=0;
				
				
				do {
					 sayi1=scan.nextInt();
					 sayi2=scan.nextInt();
					 
					 if(sayi1>0 && sayi2>0) {
							System.out.println("well done \ngirilen sayilarin carpimi :"+ (sayi1*sayi2));
						}else {
							System.out.println("Lutfen gecerli sayi giriniz");
						}
					
				} while (!(sayi1>0 && sayi2>0));

	}

}
