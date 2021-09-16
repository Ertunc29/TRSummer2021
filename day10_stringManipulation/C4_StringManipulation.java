package day10_stringManipulation;

import java.util.Scanner;

public class C4_StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lastIndexOf : verilen String de istenen karakterin kullanildigi son indexi dondurur
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.next().toLowerCase();
		
		int ilkkullanimIndexi=cumle.indexOf(kelime);
		int sonkullanimIndexi=cumle.lastIndexOf(kelime);
		
		System.out.println(ilkkullanimIndexi);
		System.out.println(sonkullanimIndexi);
		
		if(ilkkullanimIndexi==-1) {
			System.out.println("Girilen kelime cumlede kullanilmamis");
		} else if(ilkkullanimIndexi==sonkullanimIndexi) {
			System.out.println("Girilen kelime cumlede bir kez kullanilmis");
		} else {
			System.out.println("Girilen kelime cumlede birden fazla kullanilmis");
		}
		
		System.out.println(ilkkullanimIndexi==-1 ? "kelime cumlede kullanilmamis" : (ilkkullanimIndexi==sonkullanimIndexi ?  "kelime cumlede bir kez kullanilmis" : "kelime cumlede birden fazla kez kullanilmis"));

	}

}
