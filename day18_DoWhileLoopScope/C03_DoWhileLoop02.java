package day18_DoWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Soru 3: Kullanicidan toplamak uzere pozitif sayilar isteyin
		 islemi bitimek icin 0'a basmasini soyleyin
		 
		 Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve 
		 girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
		 kullanici negatif sayi girerse ignore edin
		 */
		
		
		double sayi=5;
		int sayac=0;
		int sayilarToplami=0;
		
		Scanner scan=new Scanner(System.in);
		
		
		do {
			System.out.println("Lutfen pozitif sayilar giriniz" + " \nislemi bitimek icin 0'a basin");
			
			sayi=scan.nextDouble();
			// kullanicidan aldigimiz sayi pozitif mi kontrol edelim
			
			if(sayi>0) {
				
				sayilarToplami+=sayi;
				sayac++;
			}else if(sayi<0) {
				System.out.println("Pozitif sayi girmeliydiniz \nnrgatif sayi girdiginiz icin yok sayiyorum");
				
				
				
			}else {
				System.out.println("Lutfen toplamak ixin poztitif sayilar girin"+ "\nislemi bitirmek icin 0'a basin");
				
			}
			
		}while(sayi!=0.0);
		
		System.out.println("girdiginiz sayilardan :" + sayac + " tanesi pozitifti" + "\nve pozitif sayilarin toplami :"+ sayilarToplami);

	}

}
