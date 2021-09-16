package day15_forLoops;

import java.util.Scanner;

public class C05_ForLoop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// soru 5: kullanicidan 100'den kucuk bir tamsayi isteyin
		// 1'den baslayarak girilen sayiya kadar 3'un veya 5'inkati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Luyfen 100'den kucuk bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1; i<100;i++) {
			
			if(i%3==0 || i%5==0) {
				System.out.println(i+ " ");
				
			}
			
			
				
			
		}

	}

}
