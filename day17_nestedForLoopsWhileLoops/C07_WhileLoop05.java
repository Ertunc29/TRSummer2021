package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullanicidan toplamak uzere sayi isteyin
		  toplam 200 oluncaya kadar sayi istemeye devam edin
		  toplam 200'u gectiginde kullanicinin kac sayi girdigine ve bu sayilarin toplaminin
		  kac oldugunu yazdirin
		 */
		
		// for loop ta bir islem yapabilmek icin tekrar sayisini bilmek lazim
		// while loop ta tekrar sayisi onemli degil onemli olan bitirme sartidir
		
		
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		while(toplam<200) {
			System.out.println("Lutfen toplamak icin bir tam sayi girin");
			sayi=scan.nextInt();
			
			toplam+=sayi;
			sayac++;
		}
		 System.out.println("toplam :"+ sayac +" adet sayi girdiniz ve bu sayilarin toplami :"+ toplam);
		 
		 // eger adim sayisi bilinmiyor veya ongorulemiyorsa
		 // for loop degilde while loop kullanmak daha mantiklidir
		 // eger adimlar belli ise for loop kullanmak daha mantikli olabilir
		 // iki fazla satir yazmaktan 
		 // veya degisimi unutup sonsuz loop a girmekten kurtulmus oluruz

	}

}
