package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullaniciya kac sayi toplamak istedigini sorun
		   kullanici 2,3 veya 4 degerini girerse,
		   kullanicidan bu sayolari girmesini isteyin
		   ve sayilarin toplamini yazdirin.
		   kullanici toplamak istedigi sayi adedini 4'ten buyuk girerse
		   "cok sayi girdiniz, ben toplayamam yazdirin"
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac sayi toplamak istersiniz..");
		
		int sayiAdedi=scan.nextInt();
		
		if(sayiAdedi<2) {
			System.out.println("girdiginiz sayi adedi en az 2 olmali");
		}else if(sayiAdedi==2){
			ikiSayiTopla();
		}else if(sayiAdedi==3) {
			ucSayiTopla();
		}else if(sayiAdedi==4) {
			dortSayiTopla();
			
		}else {
			System.out.println("cok sayi girdiniz, ben toplayamam yazdirin");
			
			scan.close();
		}

	}

	     private static void dortSayiTopla() {
		
	    	 Scanner scan=new Scanner(System.in);
		 		System.out.println("Lutfen dort tam sayi giriniz");
		 		int sayi1=scan.nextInt();
		 		int sayi2=scan.nextInt();
		 		int sayi3=scan.nextInt();
		 		int sayi4=scan.nextInt();
		 		System.out.println("dort sayi girmeyi tercih ettiniz :"+ "\ndort sayinin toplami :" + (sayi1+sayi2+sayi3+sayi4)); 
		 		scan.close();
	}
	     

		private static void ucSayiTopla() {
		
	    	 Scanner scan=new Scanner(System.in);
	 		System.out.println("Lutfen uc tam sayi giriniz");
	 		int sayi1=scan.nextInt();
	 		int sayi2=scan.nextInt();
	 		int sayi3=scan.nextInt();
	 		System.out.println("uc sayi girmeyi tercih ettiniz :"+ "\nUc sayinin toplami :" + (sayi1+sayi2+sayi3)); 
		scan.close();
	}

		public static void ikiSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println("Iki sayi girmeyi tercih ettiniz :"+ "\nIki sayinin toplami :" + (sayi1+sayi2));
		
		scan.close();
	}

}
