package day07_IfElseStatements;

import java.util.Scanner;

public class C6_IfElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidna gun ismi alin ve 
		// hafta ici veya hafta sonu oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gunIsmi=scan.next().toLowerCase();
		
		if(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || 
				gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")) {
			System.out.println("Girdiginiz gun hafta ici");
			
		} else if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			System.out.println("Girdiginiz gun hafta sonu");
			
		} else {
			System.out.println("Lutfen gecerli bir isim yaziniz");
		}
		  
		scan.close();

	}

}
