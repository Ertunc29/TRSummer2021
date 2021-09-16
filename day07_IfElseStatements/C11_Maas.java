package day07_IfElseStatements;

import java.util.Scanner;

public class C11_Maas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen maas talebinizi giriniz");
		
		double maas=scan.nextDouble();
		
		if (maas <60000) {
			System.out.println("Kabul edemem");
			
		} else if(maas>60.000 && maas<80000) {
			System.out.println("Konusabiliriz");
			
		
		} else if (maas>80000) {
			System.out.println("Kabul ediyorum");
			
		}else {
			System.out.println("lutfen gecerli bir sayi giriniz");
		}
		

	}

}
