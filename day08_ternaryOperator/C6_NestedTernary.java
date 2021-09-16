package day08_ternaryOperator;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan bir tamsayi alin ve syi 10 dan kucukse rakam, 100 den kucukse iki basamakli sayi
		// yuzden buyukse uc basamakli sayi yazdirin
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi=scan.nextInt();
				
				System.out.println(sayi<10 ? "Rakam" : (sayi<100 ? "iki basamakli sayi" : "uc basamakli sayi"));

	}

}
