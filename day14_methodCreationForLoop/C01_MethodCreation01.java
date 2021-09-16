package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullanicidan bir sayi alin
		 i) bu sayinin tek mi coft mi oldugunu
		 ii)sifirdan buyuk mu kucuk mu oldugunu
		 iii)ayrica 100'den buyukse birler, onlar ve yuzler basamagindaki rakamlarin toplamini
		 yazdiran 3 method olusturun
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		tekMiCiftMiYazdir(sayi);
		sifirlaKarsilastirir(sayi);
		istenenBasamaklariYazdir(sayi);

	}

	private static void istenenBasamaklariYazdir(int sayi) {
		// TODO Auto-generated method stub
		
		if(sayi<100) {
			System.out.println("girilen sayinin birler basamagi "+ sayi%10);
		}else {
			
			int rakamlarToplami=0;
			int rakam=0;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
			System.out.println("sayinin birler, onlar ve yuzler basamagindaki sayilarin toplami :"+ rakamlarToplami);
		}
		
	}

	public static void sifirlaKarsilastirir(int sayi) {
		// TODO Auto-generated method stub
		
		if(sayi>0) {
			System.out.println("Girdiginiz sayi pozitiftir");
		}else if (sayi<0){
			System.out.println("Girdiginiz sayi negatiftir");
		}else {
			System.out.println("girdiginiz sayi negatif veya pozitif degildir");
		}
		
	}

	public static void tekMiCiftMiYazdir(int sayi) {
		// TODO Auto-generated method stub
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi cifttir");
		}else {
			System.out.println("girdiginiz sayi tektir");
			
		}
	}

}
