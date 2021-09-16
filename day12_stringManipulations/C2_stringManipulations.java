package day12_stringManipulations;

import java.util.Scanner;

public class C2_stringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.nextLine();
		
		
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		String kartNo=scan.nextLine();
		
		String isimDuzenlenmis=isim.substring(0,1).toUpperCase() + // ilk harfi buyuk olarak verir
		                       isim.substring(1).replaceAll("\\w","*");
		
		String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase() +
				                  soyisim.substring(1).replaceAll("\\S","*");
		
		String kartNoDuzenlenmis="**** **** **** " + kartNo.substring(12,16);
		
		System.out.println("isim-soyisim : "+ isimDuzenlenmis+" "+soyisimDuzenlenmis + "\nkartNo :" + kartNoDuzenlenmis);
		
		
	}

}
