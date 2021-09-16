package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
		
	   
		
		//kullanicidan bir pozitif sayi alin ve bu sayinin
		// rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int i=sayi;
		int rakamlarToplami=0;
		int rakam=0;
	 
		while(i>0) {
			
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
			
		}
			System.out.println("girdiginiz sayi :"+ sayi + " sayisinin rakamlar toplami :"+ rakamlarToplami);
			
		}

}
