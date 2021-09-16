package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoop09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kullanicidan 10'dan kucuk bir sayi isteyin ve girilen sayinin faktoriyelini bulun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 10'dan kucuk bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		
		for(int i=1; i<=sayi;i++) {
			faktoriyel*=i;
			
			
		}System.out.println("girdiginiz sayinin faktoriyeli :"+ faktoriyel);

	}

}
