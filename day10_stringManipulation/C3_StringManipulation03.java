package day10_stringManipulation;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//indexOf() verilen Stringde istenen karakterin kullanildigi ilk index'i dondurur
		// '' char, " " String ama index acisindan farklari yok
		
		String str= "Java ogrenmek ne guzel";
		
		System.out.println(str.indexOf("e")); // 8
		
		System.out.println(str.indexOf(' '));// 4
		
		System.out.println(str.indexOf("mek")); // 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); //-1
		
		System.out.println("J"); // J
		
		System.out.println(str.indexOf("e", 10)); // index olarak 10 dahil sonrasinda e arar
		
		
		
		// kullsnicidan bir String isteyin 
		// girdigi String "Java" iceriyorsa "Aferin" yazdirin
		// icermiyorsa daha cok calisman lazim yazdirin
		// buyuk kucuk harf onemsiz olsun
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		cumle.indexOf("java"); // cumlede java varsa index donecek, yoksa -1 donecek
		
		
		//1.yol
		
		if(cumle.indexOf("java") ==-1 ) {
			
			System.out.println("daha cok calisman lazim");
			
		} else {
			System.out.println("Aferin");
		}
		
		//2.yol
		
		if (cumle.indexOf("java") != -1) {
		
		System.out.println("Aferin"); 
			
			
		} else {
			System.out.println("daha cok calisman lazim");
		}
		
		
		//3.yol
		System.out.println(cumle.indexOf("java")==-1 ? "daha cok calisman lazim" : "aferin") ;

	}

}
