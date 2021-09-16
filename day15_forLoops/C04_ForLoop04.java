package day15_forLoops;

import java.util.Scanner;

public class C04_ForLoop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//soru 4 : kullanicidan 100'den kucuk bir tamsayi isteyin
		// 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk birt tamsayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1; i<sayi; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
				
			
				
			}
			
			
		}

	}

}
