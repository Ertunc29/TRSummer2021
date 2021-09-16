package day08_ternaryOperator;

import java.util.Scanner;

public class C7_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin uzunlugunu giriniz");
		
		double uzunluk=scan.nextDouble();
		
		System.out.println("Lutfen dikdgortgenin genisligini giriniz");
		
		double genislik=scan.nextDouble();
		
		System.out.println(uzunluk<=0 || genislik <=0 ? "Lutfen gecerli sayi giriniz" :( genislik==uzunluk ? "Kare" : "Kare degil") );

	}

}
