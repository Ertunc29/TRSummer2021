package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* kullanicidan baslangic ve bitis harflerini alin
		   ve baslangic harfinden baslayip bitis harfinde biten tum harfleri
		   buyuk harf olarak ekrana yazdirin.
		   kullanicinin hata yapmadigini farzedin
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ilk harfi giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen son harfi giriniz");
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		char harf=ilkHarf;
		
		while (harf<=sonHarf) {
			System.out.print(harf + " ");
			harf+=1;
		}

	}

}
